package sw.luma.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sw.luma.com.utilities.Utility;

public class DufflePage extends Utility {
    By quantity = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");

    public void changeQuantity(String text){
        WebElement qty = getElement(quantity);
        qty.clear();
        sendTextToElement(quantity,text);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
}
