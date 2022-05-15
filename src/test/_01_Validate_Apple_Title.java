package test;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.apple.com/");

        if (driver.getTitle().equals("Apple")) System.out.println("Apple title validation PASSED");
        else System.out.println("Apple title validation FAILED");


        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)) System.out.println("Apple title validation PASSED");
        else System.out.println("Apple title validation FAILED");

        System.out.println("End of the program");

        driver.quit();
    }
}
