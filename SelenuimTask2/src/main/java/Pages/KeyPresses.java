package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPresses extends BasePage {
    By pressText = By.xpath("//input[@type='text']");

    public KeyPresses(WebDriver driver){super(driver);};

    public void sendPressText(String text) {BrowserActions.sendText(pressText,drive,text);};



}
