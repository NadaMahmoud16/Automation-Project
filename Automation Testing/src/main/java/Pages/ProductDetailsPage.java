package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    //locators
    By goToProductDetailsPage = By.cssSelector("a[href=\"/product_details/1\"]");
    By quantityInput = By.id("quantity");
    By addToCartButton = By.cssSelector("button[class=\"btn btn-default cart\"]");
    By productInsideProductDetails = By.cssSelector("div[class=\"product-information\"] h2");
    By viewCartButton = By.cssSelector("div[class=\"modal-body\"] a[href=\"/view_cart\"]");
    By productInsideCart = By.cssSelector("a[href=\"/product_details/1\"]");
    By verifyProductQuantity = By.cssSelector("button[class=\"disabled\"]");

    //Method
    public void goToProductDetailsPageLink() throws InterruptedException {
        click(goToProductDetailsPage);
    }
    public String getProductInsideProductDetails(){
        return returnText(productInsideProductDetails);
    }
    public void writeQuantityInput(){
        write(quantityInput, "5");
    }
    public void clickAddToCartButton() throws InterruptedException {
        click(addToCartButton);
    }
    public void clickViewCartButton() throws InterruptedException {
        click(viewCartButton);
    }
    public String getProductInsideCart(){
        return  returnText(productInsideCart);
    }
    public String getVerifyProductQuantity(){
        return returnText(verifyProductQuantity);
    }









}
