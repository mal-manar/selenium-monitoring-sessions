package assignments.weekOne.day02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02BrowserHistory {

    //    Task 1: Browser History Exploration
    //    Setup:
    //    Use @BeforeEach to launch Chrome and maximize.
    //    Test 1:
    //    Navigate to https://www.wikipedia.org/.
    //    Navigate to https://www.google.com/.
    //    Navigate back and forward multiple times, asserting the correct title at each step.
    //    Test 2:
    //    Use driver.navigate().refresh() on Google and assert the title still contains "Google".
    //    Teardown:
    //    Use @AfterEach to close the browser.



    WebDriver driver;

    //    Use @BeforeEach to launch Chrome and maximize.
    @BeforeEach
    void setup(){
       driver = new ChromeDriver();
       driver.manage().window().maximize();
    }

    //    Navigate back and forward multiple times, asserting the correct title at each step.
    @Test
    void navTest(){
        driver.navigate().to("https://www.wikipedia.org/");
        driver.navigate().to("https://www.google.com/");

        driver.navigate().back();
        assert driver.getTitle().equals("Wikipedia");

        driver.navigate().forward();
        assert driver.getTitle().equals("Google");

        driver.navigate().back();
        assert driver.getTitle().equals("Wikipedia");

        driver.navigate().forward();
        assert driver.getTitle().equals("Google");

    }

    //    Use driver.navigate().refresh() on Google and assert the title still contains "Google".

    @Test
    void refreshTest(){
        driver.navigate().to("https://www.google.com/");
        driver.navigate().refresh();
        assert driver.getTitle().contains("Google");
    }

    //    Use @AfterEach to close the browser.
    @AfterEach
    void tearDownAll(){
        driver.quit();
    }




}
