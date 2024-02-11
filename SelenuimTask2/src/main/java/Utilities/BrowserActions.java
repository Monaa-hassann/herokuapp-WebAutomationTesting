package Utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions {

    public static void clickOnButton (By locatedElement , WebDriver drive) {
       WebDriverWait wait = new WebDriverWait(drive,5);
       wait.until(ExpectedConditions.elementToBeClickable(locatedElement));
        drive.findElement(locatedElement).click();
    }
    public static void sendText  (By locatedElement , WebDriver drive, String text){
        WebDriverWait wait = new WebDriverWait(drive,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatedElement));
        drive.findElement(locatedElement).sendKeys(text);
    }
    public static String getText (By locatedElement , WebDriver drive) {
        WebDriverWait wait = new WebDriverWait(drive,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locatedElement));
        return drive.findElement(locatedElement).getText();
    }

    public static void waitUntilElementIsVisible (WebDriverWait wait , WebDriver drive, By element) {
        wait = new WebDriverWait(drive,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

}
