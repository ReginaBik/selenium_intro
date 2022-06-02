package test;

import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class _001_Validate_Title_practice {

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.apple.com/");
        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)) System.out.println("Title validation passed");
        else System.out.println("Title validation failed");

        driver.quit();


    }
}
