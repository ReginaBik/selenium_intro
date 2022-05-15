package test;

import utilities.Driver;
import org.openqa.selenium.WebDriver;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) throws InterruptedException {
        //1. Set up driver
        WebDriver driver = Driver.getDriver();


        //2. Validation
        driver.get("https://www.apple.com/");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.apple.com/";

        if(actualURL.equals(expectedURL)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation failed");

        //3. Quit driver
        Driver.quitDriver();




    }
}
