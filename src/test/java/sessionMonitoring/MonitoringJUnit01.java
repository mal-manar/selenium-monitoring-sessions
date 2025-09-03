package sessionMonitoring;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonitoringJUnit01 {

    // Go to YouTube homepage
    // Do the following tasks by creating 4 different test methods.
    // Print "Test is running" before each test() method
    // Print "Test finished" after each test() method
    // Test if the currentURL contains "youtube"
    // Test if the title does not contain "Video".
    // Test if the URL contains "youtube".
    // Test if the sourcePage contains "youtube".

    static WebDriver driver;
    static String url = "https://www.youtube.com/";


    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    // Print "Test is running" before each test() method
    @BeforeEach
    void beforeEach() {
        System.out.println("Test is running");
    }


    // Test if the currentURL contains "youtube"
    @Test
    void urlTest() {
        System.out.println("currentURL contains \"youtube\" test - is executed");
        String url = driver.getCurrentUrl();
        Assertions.assertTrue(url.contains("youtube"));
    }

    // Test if the title does not contain "Video".
    @Test
    void titleTest() {
        System.out.println("title does not contain \"Video\" test - is executed");
        String title = driver.getTitle();
        Assertions.assertFalse(title.contains("Video"));
    }

    // Test if the URL contains "youtube".
    @Test
    void urlTest2() {
        System.out.println("URL contains \"youtube\" test - is executed");
        String url = driver.getCurrentUrl();
        Assertions.assertTrue(url.contains("youtube"));
    }

    // Test if the sourcePage contains "youtube".
    @Test
    void sourcePageTest() {
        System.out.println("sourcePage contains \"youtube\" test - is executed");
        String pageSource = driver.getPageSource();
        Assertions.assertTrue(pageSource.contains("youtube"));
    }


    // Print "Test finished" after each test() method
    @AfterEach
    void afterEach() {
        System.out.println("Test finished");
    }

    @AfterAll
    public static void close() {
        driver.quit();
    }

}
