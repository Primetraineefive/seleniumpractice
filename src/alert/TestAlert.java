package alert;

import browsertesting.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class TestAlert extends BaseTest {

    String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void alertExample(){
        clickOnElement(By.name("proceed"));
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
}
