package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jay
 */
public class LocatorsDemo5 {

    public static void main(String[] args) {
        String baseUrl = "https://money.rediff.com/gainers/bse/daily/groupa";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        // Self   -- Selects the Current Node
        String text = driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/self::a")).getText();
        System.out.println(text); //India Tourism De

        // Parent - Selects the parent of current node (always One)
        text = driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/parent::td")).getText();
        System.out.println(text);  // India Tourism De

        //Child - Selects all children of the current node (One or many)
        List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/child::td"));
        System.out.println("Numbers of Child Elements :" +childs.size());

        // Ancestor - Selects all ancestors (parent grandparent, etc.)
        text = driver.findElement(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr")).getText();
        System.out.println(text);

        // Descendant - Selects all descendants (children, grandchildren, etc.)
        List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/descendant::*"));
        System.out.println("Numbers of descendants : " +descendants.size());

        //Following - Selects everything in the documents after the closing tag of the current node
        List<WebElement> followings = driver.findElements(By.xpath("//a[contains(text(),'India Tourism De')]/ancestor::tr/following::tr"));
        System.out.println("Numbers of followings : " +followings.size());

        // Following-sibling Selects all siblings after the current node
        // //a[contains(text(),'India Tourism De')]/ancestor::tr/following-sibling::tr

        // Preceding - Selects all nodes the appear before the current node in the document
        // //a[contains(text(),'India Tourism De')]/ancestor::tr/preceding::tr

        // Preceding-sibling - Select all siblings before the current node
        // //a[contains(text(),'India Tourism De')]/ancestor::tr/preceding-sibling::tr

    }
}
