package junit;

import org.junit.*;

/**
 * Created by Jay
 */
public class JUnitIntroduction {

    @BeforeClass
    public static void connectToDB(){
        System.out.println("DB connection");
    }

    @AfterClass
    public static void closeConnection(){
        System.out.println("Close DB connection");
    }

    @Before
    public void openBrowser(){
        System.out.println("Opening Browser");
    }

    @After
    public void closeBrowser(){
        System.out.println("Closing Browser");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        System.out.println("Navigate to Login page");
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        System.out.println("Navigate to Register page");
    }

}
