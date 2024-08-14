package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By clickProducts = By.cssSelector("a[href=\"/products\"]");
    By hoverFirstProductText = By.cssSelector("div[class=\"features_items\"] div[class=\"col-sm-4\"]:nth-child(3) p");
    By firstProductAdd = By.cssSelector("div[class=\"features_items\"] div[class=\"col-sm-4\"]:nth-child(3) a[class=\"btn btn-default add-to-cart\"]");
    By firstProductText = By.cssSelector("div[class=\"features_items\"] div[class=\"col-sm-4\"]:nth-child(3) p");
    By continueShoppingButton = By.cssSelector("button[class=\"btn btn-success close-modal btn-block\"]");
    By hoverSecondProductText = By.cssSelector("div[class=\"features_items\"] div[class=\"col-sm-4\"]:nth-child(4) p");
    By secondProductAdd = By.cssSelector("div[class=\"features_items\"] div[class=\"col-sm-4\"]:nth-child(4) a[class=\"btn btn-default add-to-cart\"]");
    By secondProductText = By.cssSelector("div[class=\"features_items\"] div[class=\"col-sm-4\"]:nth-child(4) p");
    By viewCartInput = By.cssSelector("div[class=\"modal-body\"] a[href=\"/view_cart\"]");
    By verifyFirstProductText = By.cssSelector("a[href=\"/product_details/1\"]");
    By verifySecondProductText = By.cssSelector("a[href=\"/product_details/2\"]");
//    By viewCartFirstProduct = By.id("product-1");
//    By viewCartSecondProduct = By.id("product-2");
    By firstProductPrice = By.cssSelector("tr[id=\"product-1\"] td[class=\"cart_price\"] p");
    By firstProductQuantity = By.cssSelector ("tr[id=\"product-1\"] button[class=\"disabled\"]");
    By firstProductTotal = By.cssSelector ("tr[id=\"product-1\"] p[class=\"cart_total_price\"]");
    By secondProductPrice = By.cssSelector("tr[id=\"product-2\"] td[class=\"cart_price\"] p");
    By secondProductQuantity = By.cssSelector ("tr[id=\"product-2\"] button[class=\"disabled\"]");
    By secondProductTotal = By.cssSelector ("tr[id=\"product-2\"] p[class=\"cart_total_price\"]");

    public void clickOnProducts() throws InterruptedException {
        click(clickProducts);
    }
    public void hoverOverFirstProductText(){
        hover(hoverFirstProductText);
    }
    public void clickFirstProductAdd() throws InterruptedException {
        click(firstProductAdd);
    }
    public String getFirstProductText(){
        return returnText(firstProductText);
    }
    public void clickContinueShoppingButton() throws InterruptedException {
        click(continueShoppingButton);
    }
    public void hoverOverSecondProductText(){
        hover(hoverSecondProductText);
    }
    public void clickSecondProductAdd() throws InterruptedException {
        click(secondProductAdd);
    }
    public String getSecondProductText(){
        return returnText(secondProductText);
    }
    public void clickViewCartInput() throws InterruptedException {
        click(viewCartInput);
    }
    public String getVerifyFirstProductText(){
        return returnText(verifyFirstProductText);
    }
    public String getVerifySecondProductText(){
        return returnText(verifySecondProductText);
    }
    public String getFirstProductPrice(){
        return returnText(firstProductPrice);
    }
    public String getFirstProductQuantity(){
        return returnText(firstProductQuantity);
    }
    public String getFirstProductTotal(){
        return returnText(firstProductTotal);
    }
    public String getSecondProductPrice(){
        return returnText(secondProductPrice);
    }
    public String getSecondProductQuantity(){
        return returnText(secondProductQuantity);
    }
    public String getSecondProductTotal(){
        return returnText(secondProductTotal);
    }















}

