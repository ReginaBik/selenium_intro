package test;

import utilities.Driver;
import org.openqa.selenium.WebDriver;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {

            //1. Set up driver
            WebDriver driver = Driver.getDriver();


            //2. Validation
            driver.get("https://www.apple.com/");

            String expectedTitle = "Apple"; // from requirement
            String actualTitle = driver.getTitle(); // from application under development

            if(actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
            else System.out.println("Title validation FAILED!!!");



            //3. Quit driver
            Driver.quitDriver();
    }
}
