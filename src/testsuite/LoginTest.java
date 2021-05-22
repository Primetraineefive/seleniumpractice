package testsuite;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){

        // Finding the login link element and click on login link element
       /* WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));

        // This is expected text from Requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // Get text from Welcome text element from web site
        /*WebElement message = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));
        String actualMessage = message.getText();*/
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));

        Assert.assertEquals("User not navigate to login page", expectedMessage, actualMessage);

    }

    @Test
    public void verifyErrorMessageWhenWrongUsernameAndPasswordEntered(){
        // Finding the login link element and click on login link element
        /*WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));

        // Finding the emailField element
        /*WebElement emailField = driver.findElement(By.id("Email"));

        // Send email address to emailField element
        emailField.sendKeys("abc@gmail.com");*/
        sendTextToElement(By.id("Email"), "abc@gmail.com");

        // Finding the password element
        /*WebElement passwordField = driver.findElement(By.name("Password"));
        // Send password to passwordField element
        passwordField.sendKeys("abc123");*/
        sendTextToElement(By.name("Password"), "abc123");

        // Finding the login button Clicking on login button
     /*   WebElement loginBtn = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginBtn.click();*/

        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));

        // This is expected message from Requirement
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";


        /*WebElement errorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        // This is actual error message from web site
        String actualErrorMessage = errorMessage.getText();*/
        String actualErrorMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));

        Assert.assertEquals("Error message not display",expectedErrorMessage,actualErrorMessage);


    }

    @After
    public void tearDown(){
        closeBrowser();
    }


}
