package test;

import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.apple.com");
        String expectedString = "https://www.apple.com/";
        String actualString = driver.getCurrentUrl();
        if(actualString.equals(expectedString)) System.out.println("Apple URL validation PASSED");
        else System.out.println("Apple URL validation FAILED");

        System.out.println("End of the program");

        driver.quit();




    }
}
