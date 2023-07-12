package sw.luma.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sw.luma.com.utilities.Utility;

public class ShoppingCartPage extends Utility {
    By quantity = By.xpath("(//input[@class='input-text qty'])[1]");
    By update = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    public void changeQuantity(String text){
        WebElement qty = getElement(quantity);
        qty.clear();
        sendTextToElement(quantity,text);
    }
    public void clickOnUpdate(){
        clickOnElement(update);
    }
}