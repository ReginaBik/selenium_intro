package utilities;

import org.openqa.selenium.WebDriver;

public class ValidationUtils {


        public static void validateTitle(WebDriver driver, String expectedTitle){
            if (driver.getTitle().equals(expectedTitle)) System.out.println("Title is VALIDATED");
            else System.out.println("Title is NOT VALIDATED");
        }

}
