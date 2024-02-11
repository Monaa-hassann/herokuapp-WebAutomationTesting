package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlert extends BasePage{

    By clickJsAlert = By.xpath("//button[text()='Click for JS Alert']");
    By clickJsConfirm = By.xpath("//button[text()='Click for JS Confirm']");


    public JSAlert(WebDriver drive) {
        super(drive);
    }

    public void clickOnJs () {
        BrowserActions.clickOnButton(clickJsAlert,drive);};
    public void clickOnJsConfirm () {
        BrowserActions.clickOnButton(clickJsConfirm,drive);};

    public void acceptAlert() {
        drive.switchTo().alert().accept();
    }

    public void dismissAlert() {
        drive.switchTo().alert().dismiss();
    }
    public String alertGetText() {
       return drive.switchTo().alert().getText();
    }


}
