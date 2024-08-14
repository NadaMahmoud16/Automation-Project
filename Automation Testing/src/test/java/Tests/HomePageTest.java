package Tests;

import Pages.HomePage;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends BaseTest {
    Faker fake = new Faker();
    String email = fake.internet().safeEmailAddress();
    HomePage page;
    SoftAssert soft = new SoftAssert();


    @Test
    public void TC_10() throws InterruptedException {
        reportTest = report.createTest("Subscription Test");
        HomePage page = new HomePage(driver);

        // Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully
        soft.assertEquals(driver.getCurrentUrl(), "https://www.automationexercise.com/");
        reportTest.pass("The HomePage is visible");

        // Verify text 'SUBSCRIPTION'
        soft.assertEquals(page.getSubText(), "SUBSCRIPTION", "Title is visible");
        reportTest.pass("The text is "+page.getSubText());

        //Enter email address in input and click arrow button
        page.setSubText(email);
        reportTest.pass("The email input accept correct email data");

        // Verify success message 'You have been successfully subscribed!' is visible
        soft.assertEquals(page.getSuccessMessage(), "You have been successfully subscribed!");
        reportTest.pass("The text is "+page.getSuccessMessage());

        soft.assertAll();
    }}
