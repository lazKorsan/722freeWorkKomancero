package popUpPopUp;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.ReusableMethods;
import utilities.TestBase;

import static utilities.TestBase.driver;


public class practiceautamationPage{
    public static WebDriver driver ;
    @BeforeEach
    public void setUp(){
        driver = TestBase.createDriver() ;
    }
    @AfterEach
    public void tearDown(){
        ReusableMethods.bekle(3);
        driver.quit();
    }
    @org.junit.jupiter.api.Test


    @Test
    public void testHandlingLogwinPopUpUsingCredentials() {
        String URL = "https://" + "admin" + ":" + "admin" + "@practice.expandtesting.com/download-secure";
        driver.get(URL);

        // https://admin:admin@the-internet.herokuapp.com/basic_auth
        // https://the-internet.herokuapp.com/basic_auth


        String title = driver.getTitle();
        System.out.println("The page title is : " + title);


        String text = driver.findElement(By.tagName("p")).getText();
        System.out.println("The text present in page is : " + text);
    }
}