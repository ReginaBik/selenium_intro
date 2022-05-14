package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {

        //1.Set up driver
        System.setProperty("webdriver.chrome.driver", "/Users/reginabiktimirova/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver(); // Instantiate a Chrome browser


        //2.Maximize driver(browser)
        driver.manage().window().fullscreen(); // we want to keep the whole screen //or instead of fullscreen we can use
        // driver.manage().window().maximize();

        //3.Define implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //u can put 60 as well

        //4. Navigate to Google web-site
        driver.get("https://www.google.com/");

        //5. Validate the title is Google
        System.out.println("The title of the page = " + driver.getTitle());
        if (driver.getTitle().equals("Google")) System.out.println("Google title validation PASSED");
        else  System.out.println("Google title validation failed");

        System.out.println("End of the program");

        //6. Quit  the driver
       //Thread.sleep(3000);
        driver.quit();




    }
}
