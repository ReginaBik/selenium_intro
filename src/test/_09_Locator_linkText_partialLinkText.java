package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkText_partialLinkText {
    public static void main(String[] args) {

        /*
Go to https://www.google.com
Validate the Gmail, Images, About and Store links are displayed and enabled
 */


   /* WebDriver driver = Driver.getDriver();
    driver.get("https://www.google.com/");

        WebElement aboutlink = driver.findElement(By.linkText("About"));
        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        WebElement storeLink =  driver.findElement(By.partialLinkText("Sto"));

        System.out.println("About displayed = " + aboutlink.isDisplayed());
        System.out.println("About is enabled = "  + aboutlink.isEnabled());

        System.out.println("Images displayed = " + imagesLink.isDisplayed());
        System.out.println("Images is enabled = "  + imagesLink.isEnabled());

        System.out.println("Gmail displayed = " + gmailLink.isDisplayed());
        System.out.println("Gmail is enabled = "  + gmailLink.isEnabled());

        System.out.println("Store displayed = " + storeLink.isDisplayed());
        System.out.println("Store is enabled = "  + storeLink.isEnabled());

        Driver.quitDriver();*/
/*
        Go to https://www.google.com
        Validate the Gmail, Images, About and Store links are displayed and enabled*/


        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        WebElement storeLink = driver.findElement(By.linkText("Store"));
        WebElement gmailLink = driver.findElement(By.partialLinkText("mail"));
        WebElement imagesLink = driver.findElement(By.partialLinkText("Ima"));

        System.out.println(aboutLink.getText()); // About
        System.out.println(storeLink.getText()); // Store
        System.out.println(gmailLink.getText()); // Gmail
        System.out.println(imagesLink.getText()); // Images

        System.out.println(aboutLink.isDisplayed() && aboutLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(storeLink.isDisplayed() && storeLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(gmailLink.isDisplayed() && gmailLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(imagesLink.isDisplayed() && imagesLink.isEnabled() ? "PASSED" : "FAILED");

        Driver.quitDriver();




}

}