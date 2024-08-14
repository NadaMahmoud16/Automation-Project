package Tests;

import Pages.CartPage;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartPageTest extends BaseTest {
     Faker fake = new Faker();
     String email2 = fake.internet().safeEmailAddress();
     CartPage cart;
     SoftAssert soft = new SoftAssert();

     @Test
    public void TC_11() throws InterruptedException {
         cart = new CartPage(driver);
         reportTest = report.createTest("Subscription CartPage");

          //Navigate to url 'http://automationexercise.com'
          //Verify that home page is visible successfully
         soft.assertEquals(driver.getCurrentUrl(), ("https://www.automationexercise.com/"));
         reportTest.pass("The HomePage is visible");

         //Click 'Cart' button
         cart.clickCartButton();
         reportTest.pass("The CartPage is visible");

         // Verify text 'SUBSCRIPTION'
         soft.assertEquals(cart.getSubText(), "SUBSCRIPTION");
         reportTest.pass(cart.getSubText()+"title will displayed");

         //Enter email address in input and click arrow button
         cart.clickEmailInput(email2);
         reportTest.info("Email input accept valid email");

         //Verify success message 'You have been successfully subscribed!' is visible
         soft.assertEquals(cart.getSuccMessage(), "You have been successfully subscribed!");
          reportTest.pass(cart.getSuccMessage()+"message will displayed");

          soft.assertAll();
     }
}
