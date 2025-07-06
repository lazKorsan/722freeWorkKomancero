package popUpPopUp;


import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBase;

import static utilities.TestBase.driver;


public class TestHandlingLoginPopUpUsingCredenti{
    @BeforeEach
    public void setUp(){
        driver = TestBase.createDriver() ;
    }


    @Test
    public void testHandlingLoginPopUpUsingCredentials() {
        String URL = "https://" + "admin" + ":" + "admin" + "@the-internet.herokuapp.com/basic_auth";
        driver.get(URL);


        String title = driver.getTitle();
        System.out.println("The page title is : " + title);


        String text = driver.findElement(By.tagName("p")).getText();
        System.out.println("The text present in page is : " + text);
    }
}