import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class FacebookPractice {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");

        String expectedTitle = "Facebook - log in or sign up";
        if(driver.getTitle().equals(expectedTitle)) System.out.println("Title is validated");
        else System.out.println("Title is not validated");

        driver.quit();
    }
}
