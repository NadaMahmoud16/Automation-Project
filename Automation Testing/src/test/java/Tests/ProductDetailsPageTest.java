package Tests;

import Pages.ProductDetailsPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductDetailsPageTest extends BaseTest {

    ProductDetailsPage page;
    SoftAssert soft = new SoftAssert();


    @Test
    public void TC_13() throws InterruptedException {
        reportTest = report.createTest("Product Details Page Test");
        page = new ProductDetailsPage(driver);

        page.goToProductDetailsPageLink();
        reportTest.pass("You will be redirect to the selected product details page");

        //Click 'View Product' for any product on home page
        soft.assertEquals(driver.getCurrentUrl(), "https://www.automationexercise.com/product_details/1");
        reportTest.info("The product details page is displayed");

        //Verify product detail is opened
        page.getProductInsideProductDetails();
        String name = page.getProductInsideProductDetails();
        reportTest.info("The product name is" + page.getProductInsideProductDetails());

        // Increase quantity to 5
        page.writeQuantityInput();
        reportTest.pass("The quantity will be 5");

        //Click 'Add to cart' button
        page.clickAddToCartButton();
        reportTest.pass("Add to cart button is clickable");

        //Click 'View Cart' button
        page.clickViewCartButton();
        reportTest.pass("View cart button is clickable and you will redirect to cart page");

        //Verify that product is displayed in cart page with exact quantity
        soft.assertEquals(name ,page.getProductInsideCart());
        reportTest.pass("Selected product is the same with the product on cart page");

        soft.assertEquals(page.getVerifyProductQuantity(), "5");
        reportTest.pass("The entered quantity is the same with the quantity in the cart page");

        soft.assertAll();

    }

}
