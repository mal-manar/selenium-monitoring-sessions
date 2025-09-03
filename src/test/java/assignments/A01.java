package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class A01 {
    public static void main(String[] args) throws InterruptedException {


        //===T01: Setup Chrome Driver===//
        //create chrome driver
        WebDriver driver = new ChromeDriver();
        //go to https://www.google.com/
        driver.get("https://www.google.com/");
        //get the title on page
        String ChromeDriverTitle = driver.getTitle();
        System.out.println("Title is: " + ChromeDriverTitle);
        //get the current url on page
        String url = driver.getCurrentUrl();
        System.out.println("Current URL is: " + url);
        //close the browser
        driver.quit();


        //===T02:  FireFox driver===//
        //create firefox driver
        WebDriver driverF = new FirefoxDriver();
        //go to YouTube
        driverF.get("https://www.youtube.com/");
        //verify the page title contains "video" by
        String FirefoxDriverTitle = driverF.getTitle();
        if (FirefoxDriverTitle.toLowerCase().contains("video")) {
            System.out.println("Title contains video, Test Passed");
        } else {
            System.out.println("Title does not contain video, Test Failed");
        }
        //close the browser
        driverF.quit();


        //===T03:  manage window commands-01 ===//
        //create chrome driver
        WebDriver driverP= new ChromeDriver();
        //go to https://www.amazon.com/
        driverP.get("https://www.amazon.com/");
        //print the position and size of the page
        System.out.println("Position: " + driverP.manage().window().getPosition());
        System.out.println("Size: " + driverP.manage().window().getSize());
        //set the position & size as desired
        driverP.manage().window().setPosition(new Point(200, 100));
        driverP.manage().window().setSize(new Dimension(600, 300));
        //test that the page is in the  position & size as expected
        System.out.println("New Position: " + driverP.manage().window().getPosition());
        System.out.println("New Size: " + driverP.manage().window().getSize());
        //close the browser
        driverP.quit();


        //===T04:  manage window commands-02 ===//
        //open google
        WebDriver driverM= new ChromeDriver();
        driverM.get("https://www.google.com/");
        //maximize the window
        driverM.manage().window().maximize();
        //print the position and size of the page
        System.out.println("Maximized Position: " + driverM.manage().window().getPosition());
        System.out.println("Maximized Size: " + driverM.manage().window().getSize());
        //minimize the window
        driverM.manage().window().minimize();
        //wait 5 seconds in the icon state and then maximize again
        Thread.sleep(5000);
        driverM.manage().window().maximize();
        //print the position and dimensions of the page in maximized state
        System.out.println("Maximized Position: " + driverM.manage().window().getPosition());
        System.out.println("Maximized Size: " + driverM.manage().window().getSize());
        //make the page full screen
        driverM.manage().window().fullscreen();
        //close the browser
        driverM.quit();









    }
}
