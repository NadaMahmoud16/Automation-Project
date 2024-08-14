package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }
    //locators
    By cartButton = By.cssSelector("div[class=\"shop-menu pull-right\"] a[href=\"/view_cart\"]");
    By subText = By.cssSelector("div[class=\"single-widget\"] h2");
    By emailInput = By.id("susbscribe_email");
    By emailButton = By.id("subscribe");
    By succMessage = By.cssSelector("div[class=\"alert-success alert\"]");

    //Methods
    public void clickCartButton() throws InterruptedException {
        click(cartButton);
    }
    public String getSubText(){
        return returnText(subText);
    }
    public void clickEmailInput(String text) throws InterruptedException {
        write(emailInput, text);
        click(emailButton);
    }
    public String getSuccMessage(){
        return returnText(succMessage);
    }













}

