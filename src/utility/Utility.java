package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Jay
 */
public class Utility {

    public WebDriver driver;

    /**
     * This method will click on element
     * @param by
     */
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    /**
     * This method will get text from element
     * @param by
     * @return
     */
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     * @param by
     * @param text
     */
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will select by value from dropdown
     * @param by
     * @param value
     */
    public void selectByValueFromDropDown(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }



}
