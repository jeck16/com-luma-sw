package sw.luma.com.pages;

import org.openqa.selenium.By;
import sw.luma.com.utilities.Utility;

public class MenPantsPage extends Utility {
    By cronusPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    By color = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void mouseHoverOnPantAndClick() throws InterruptedException {
        mouseHoverToElement(cronusPant);
        Thread.sleep(1000);
        mouseHoverToElementAndClick(size32);
        Thread.sleep(1000);
        mouseHoverToElementAndClick(color);
    }
    public void clickOnAddToCart() throws InterruptedException {
        mouseHoverToElement(cronusPant);
        Thread.sleep(1000);
        mouseHoverToElementAndClick(addToCart);
        Thread.sleep(1000);
    }
    public void clickOnShoppingCart() throws InterruptedException {
        clickOnElement(shoppingCart);
        Thread.sleep(1000);
    }
}
