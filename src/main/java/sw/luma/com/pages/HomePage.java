package sw.luma.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sw.luma.com.utilities.Utility;

import java.time.Duration;

public class HomePage extends Utility {
    By women = By.xpath("//span[normalize-space()='Women']");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By womenJackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By selectSorting = By.xpath("(//select[@id='sorter'])[1]");
    By men = By.xpath("//a[@id='ui-id-5']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By bottoms = By.xpath("//li[@class = 'level1 nav-3-2 category-item last parent ui-menu-item']//span[contains(text(),'Bottoms')]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gear = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");
    By duffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void mouseHoverOnWomenTopsAndClick() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(women));
        mouseHoverToElement(women);
        Thread.sleep(1000);
        mouseHoverToElement(tops);
        Thread.sleep(1000);
        mouseHoverToElementAndClick(womenJackets);
        Thread.sleep(1000);
    }

    public void mouseHoverOnMenBottomsAndClick() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(men));
        mouseHoverToElement(men);
        Thread.sleep(5000);
        mouseHoverToElement(bottoms);
        Thread.sleep(5000);
        mouseHoverToElementAndClick(pants);

    }

    public void selectSortingOption(String text) throws InterruptedException {
        selectByVisibleTextFromDropDown(selectSorting, text);
        Thread.sleep(1000);
    }
    public void mouseHoverOnGearAndClick() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(gear));
        mouseHoverToElement(gear);
        Thread.sleep(5000);
        mouseHoverToElementAndClick(bags);
        Thread.sleep(3000);
        clickOnElement(duffle);
    }
}
