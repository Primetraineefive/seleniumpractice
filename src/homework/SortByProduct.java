package homework;

import browsertesting.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jay
 */
public class SortByProduct extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductArrangeInAlphabaticalOrder() throws InterruptedException {
        //Mouse hove on Computer Menu and click on desktop
        mouseHoverToElement(By.xpath("//div[@class='header-menu']//ul[1]//a[contains(text(),\"Computers\")]"));
        clickOnElement(By.xpath("//div[@class='header-menu']//ul[1]//a[contains(text(),'Computers')]//parent::li//ul//a[contains(text(), 'Desktops')]"));

        //sort by position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.id("products-orderby"), "Name: A to Z");

        Thread.sleep(3000);

        //Getting list of web elements of product name
        List<WebElement> deskTopList = driver.findElements(By.xpath("//h2[@class='product-title']"));

        List<String> productName = new ArrayList<>();

        for (WebElement deskTop : deskTopList){
            productName.add(deskTop.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);

        Collections.sort(tempList);
        System.out.println(productName);
        System.out.println(tempList);
        Assert.assertEquals("Product not arrange", productName, tempList);

    }




}
