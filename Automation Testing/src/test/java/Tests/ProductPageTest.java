package Tests;

import Pages.ProductPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductPageTest extends BaseTest{

    ProductPage page;
    SoftAssert soft = new SoftAssert();

    @Test
    public void TC_12() throws InterruptedException {
        reportTest = report.createTest("View Cart Test");
        ProductPage page = new ProductPage(driver);

        //Click 'Products' button
        page.clickOnProducts();
        reportTest.pass("The products page is displayed");

        //Hover over first product and click 'Add to cart'
        page.hoverOverFirstProductText();
        reportTest.pass("Hover over First Product Text");

        page.clickFirstProductAdd();
        reportTest.pass("The first product add to cart button is clickable");

        //Click 'Continue Shopping' button
        page.clickContinueShoppingButton();
        reportTest.pass("Continue shopping button is clickable");

        // Hover over second product and click 'Add to cart'
        page.hoverOverSecondProductText();
        reportTest.pass("Hover over Second Product Text");

        page.clickSecondProductAdd();
        reportTest.pass("The first product add to cart button is clickable");

        String firstProduct =  page.getFirstProductText();
        String secondProduct =  page.getSecondProductText();

        //Click 'View Cart' button
        page.clickViewCartInput();
        reportTest.pass("View cart button will redirect to the Cart Page");

        // Verify both products are added to Cart
        soft.assertEquals(firstProduct, page.getVerifyFirstProductText());
        reportTest.pass("The first product outside is displayed in cart page");

        soft.assertEquals(secondProduct, page.getVerifySecondProductText());
        reportTest.fail("The second product text outside is not the same with the same product inside");

        //Verify their prices, quantity and total price
        soft.assertEquals(page.getFirstProductPrice(), "Rs. 500");
        reportTest.pass("Correct price is displayed");

        soft.assertEquals(page.getFirstProductQuantity(), "1");
        reportTest.pass("Correct quantity is displayed");

        soft.assertEquals(page.getFirstProductTotal(), "Rs. 500");
        reportTest.pass("Correct total is displayed");
        reportTest.info("Correct total price according to the product quantity");

        soft.assertEquals(page.getSecondProductPrice(), "Rs. 400");
        reportTest.pass("Correct price is displayed");

        soft.assertEquals(page.getSecondProductQuantity(), "1");
        reportTest.pass("Correct quantity is displayed");

        soft.assertEquals(page.getSecondProductTotal(), "Rs. 400");
        reportTest.pass("Correct total is displayed");
        reportTest.info("Correct total price according to the product quantity");

        soft.assertAll();

    }
}


