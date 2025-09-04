package assignments;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05NavVerify {

//    Task 4: Multiple Navigation and Verification
//    Setup:
//    Launch Chrome and maximize in @BeforeEach.
//            Test 1:
//    Navigate Google → YouTube → LinkedIn.
//    Assert titles contain "Google", "YouTube", "LinkedIn" respectively.
//            Test 2:
//    Navigate back twice and assert the URL of Google.
//    Navigate forward twice and assert URL of LinkedIn.
//            Teardown:
//    Use @AfterAll to quit the browser.

    static WebDriver driver;

    @BeforeEach
    void setup(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    }

    //            Test 1:
    @Test
    void navTitleVerifyTest(){
        driver.navigate().to("https://www.google.com/");
        Assertions.assertTrue(driver.getTitle().contains("Google"), "Title should contain Google");

        driver.navigate().to("https://www.youtube.com/");
        Assertions.assertTrue(driver.getTitle().contains("YouTube"), "Title should contain YouTube");

        driver.navigate().to("https://www.linkedin.com/");
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"), "Title should contain LinkedIn");
    }

//            Test 2:
    @Test
    void navUrlVerifyTest(){
        driver.navigate().to("https://www.google.com/");
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().to("https://www.linkedin.com/");

        // Back twice → should be Google
        driver.navigate().back();
        driver.navigate().back();
        Assertions.assertEquals("https://www.google.com/", driver.getCurrentUrl(), "URL should be Google");

        // Forward twice → should be LinkedIn
        driver.navigate().forward();
        driver.navigate().forward();
        Assertions.assertEquals("https://www.linkedin.com/", driver.getCurrentUrl(), "URL should be LinkedIn");

    }

    @AfterAll
    public static void close() {

        driver.quit();
    }



}
