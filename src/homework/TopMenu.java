package homework;

import browsertesting.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay
 */
public class TopMenu extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void selectMenuAndClick(){
        selectMenu("Electronics");
    }

   /* public void selectMenu(String menu){
        if (menu.equalsIgnoreCase("Computer")){
           clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        }else if (menu.equalsIgnoreCase("Electronics")){
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        }
    }*/

    public void selectMenu(String menu){
        List<WebElement> menuList = driver.findElements(By.xpath("//div[@class='header-menu']/ul[1]/li/a"));
        for (WebElement element: menuList){
            if (element.getText().equalsIgnoreCase(menu)){
                element.click();
            }
        }
    }


}
