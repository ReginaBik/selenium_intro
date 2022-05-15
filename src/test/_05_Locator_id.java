package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    public static void main(String[] args) {
         /*
    Go to https://www.techglobalschool.com

    Validate the company signature
        Logo must be displayed in the header section
        Company name must be displayed in the header section
        Company quote must be displayed in the header section
     */


            WebDriver driver = Driver.getDriver();

            driver.get("https://www.techglobalschool.com");



        WebElement companyQuote = driver.findElement(By.id("comp-kuiqjidf1"));

        if(companyQuote.isDisplayed()) System.out.println("Company quote PASSED!");
        else System.out.println("Company quote FAILED");

        Driver.quitDriver();




            Driver.quitDriver();
    }
}
