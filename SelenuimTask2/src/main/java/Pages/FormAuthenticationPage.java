package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormAuthenticationPage extends BasePage{
    WebDriverWait wait;


    By userName = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//button[@type='submit']");
    By loginMessage = By.xpath("//div[@class='flash error']");

    public FormAuthenticationPage(WebDriver drive){
        super(drive);
    }

    public void enterUser (String text) {BrowserActions.sendText(userName,drive,text);};
    public void enterPass (String text) {BrowserActions.sendText(password,drive,text);};
    public void loginPress (){BrowserActions.clickOnButton(loginButton,drive);};


}
