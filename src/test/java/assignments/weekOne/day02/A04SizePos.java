package assignments.weekOne.day02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class A04SizePos {

//    Task 3: Browser Size and Position
//    Setup:
//    Open Chrome in @BeforeEach.
//            Test 1:
//    Navigate to https://www.bbc.com/.
//    Set browser size to 800x600 and assert the window size.
//            Test 2:
//    Move the window to position (100, 100) and assert its position.
//    Teardown:
//    Close the browser.

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }
    // Test 1: Size
    @Test
    void sizeTest() {
        driver.navigate().to("https://www.bbc.com/");
        driver.manage().window().setSize(new Dimension(800, 600));

        Dimension actualSize = driver.manage().window().getSize();
        assertEquals(800, actualSize.getWidth(), "Width should be 800");
        assertEquals(600, actualSize.getHeight(), "Height should be 600");
    }

    // Test 2: Position
    @Test
    void positionTest() {
        driver.navigate().to("https://www.bbc.com/");
        driver.manage().window().setPosition(new Point(100, 100));

        Point actualPos = driver.manage().window().getPosition();
        assertEquals(100, actualPos.getX(), "X position should be 100");
        assertEquals(100, actualPos.getY(), "Y position should be 100");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}