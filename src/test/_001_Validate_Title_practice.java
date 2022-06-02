package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _001_Validate_Title_practice {

    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.apple.com/");
        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)) System.out.println("Title validation passed");
        else System.out.println("Title validation failed");
        //Practice 2 VALIDATE URL
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.apple.com/";
        if(actualUrl.equals(expectedUrl)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        //Practice 3 WEBELEMENETS
        WebElement appleLogo = driver.findElement(By.id("ac-gn-firstfocus-small"));
        if(appleLogo.isDisplayed()) System.out.println("Home button is displayed");
        else System.out.println("Home button is NOT displayed");

        if(appleLogo.isEnabled()) System.out.println("It is enabled");
        else System.out.println("it is NOT enabled");

        //Practice 4 LOCATORS by id, xPath, CSS




        driver.quit();


    }
}
