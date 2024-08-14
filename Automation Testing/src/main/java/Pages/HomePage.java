package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    //    locators
    By subText = By.cssSelector("div[class=\"single-widget\"] h2");
    By subEmailInput = By.cssSelector("input[id=\"susbscribe_email\"]");
    By subEmailButton = By.cssSelector("button[id=\"subscribe\"]");
    By successMessage = By.cssSelector("div[class=\"alert-success alert\"]");


    //Methods
    public String getSubText(){
        return returnText(subText);
    }
    public void setSubText(String text) throws InterruptedException {
        write(subEmailInput, text);
        click(subEmailButton);
    }
    public String getSuccessMessage(){

        return returnText(successMessage);
    }

}
