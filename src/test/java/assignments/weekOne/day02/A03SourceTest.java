package assignments.weekOne.day02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03SourceTest {

//    Task 2: Page Source Validation
//    Setup:
//    Use @BeforeEach to open Chrome and maximize.
//    Test 1:
//    Navigate to https://www.selenium.dev/.
//    Verify that the page source contains the word "WebDriver".
//    Test 2:
//    Navigate to https://www.python.org/.
//    Assert the page source contains "Python".
//    Teardown:
//    Close the browser with @AfterEach.



    WebDriver driver;

//    Use @BeforeEach to open Chrome and maximize.

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    //    Test 1:
    @Test
    void sourceSeleniumVerifyTest(){
        driver.navigate().to("https://www.selenium.dev/");
        String pageSource = driver.getPageSource();
        assert pageSource.contains("WebDriver");
    }

    //    Test 2:
    @Test
    void sourcePythonVerifyTest(){
        driver.navigate().to("https://www.python.org/");
        String pageSource = driver.getPageSource();
        assert pageSource.contains("Python");
    }

    //    Close the browser with @AfterEach.
    @AfterEach
    void teardown(){
        driver.quit();
    }

}
