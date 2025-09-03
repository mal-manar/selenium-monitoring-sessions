package sessionMonitoring;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonitoringJUnit02 {


// Go to google homepage
// Do the following tasks by creating 3 different test methods.
// Print "Tests are starting to run" before each test() method
// Print "Tests have finished running" after each test() method
// Test if the title is the same when the page window is maximize and minimize
// Test if the title does not contain "Video" when the page window is fullscreen
// Test if the URL contains "google"


    WebDriver driver;
    String url = "https://www.google.com/";

// Print "Tests are starting to run" before each test() method
    @BeforeEach
    void beforeEach() {
        System.out.println("Tests are starting to run");
        driver = new ChromeDriver();
        driver.get(url);
    }



    // Test if the (title) is the same when the page window is maximize and minimize
    @Test
    void titleTest() {
       String titleMax;
       String titleMin;

       driver.manage().window().maximize();
       titleMax = driver.getTitle();
       driver.manage().window().minimize();
       titleMin = driver.getTitle();

        Assertions.assertEquals(titleMax, titleMin, "titles are not the same");

    }

    // Test if the title "does not" contain "Video" when the page window is fullscreen
    @Test
    void titleVideoTest() {
        driver.manage().window().fullscreen();
        String title = driver.getTitle();
        Assertions.assertFalse(title.contains("Video"), "title contains 'Video'");
    }

    // Test if the URL contains "google"
    @Test
    void urlTest() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertTrue(currentUrl.toLowerCase().contains("google"), "URL does not contain 'google'");
    }
    // Print "Tests have finished running" after each test() method
    @AfterEach
    void afterEach() {
        System.out.println("Tests have finished running");
        driver.quit();
    }





}
