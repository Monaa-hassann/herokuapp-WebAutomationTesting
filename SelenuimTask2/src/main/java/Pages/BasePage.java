package Pages;

import Utilities.BrowserActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage {
    WebDriver drive;
    WebDriverWait wait;

    By welcomeMessage = By.xpath("//h1[@class='heading']");
    By DropDown = By.xpath("//ul//li[11]//a");
    By formAuthentication = By.xpath("//ul//li[21]//a");

    By hovers = By.xpath("//ul//li[25]//a");
    By keyPress = By.xpath("//ul//li[31]//a");
    By jsAlert = By.xpath("//ul//li[29]//a");
    By fileUploader = By.xpath("//ul//li[18]//a");

    By entryAd = By.xpath("//ul//li[15]//a");
    By contextMenu = By.xpath("//ul//li[7]//a");
    By framesPage = By.xpath("//ul//li[44]//a");
    public BasePage (WebDriver drive) {
        this.drive = drive;
    }

    public String getWelcomeMessage () {return BrowserActions.getText(welcomeMessage,drive);};
    public void clickDropDown () {BrowserActions.clickOnButton(DropDown,drive);};
    public void clickFormAuth () {BrowserActions.clickOnButton(formAuthentication,drive);};
    public void clickHovers() {BrowserActions.clickOnButton(hovers,drive);};
    public void clickKeyPress() {BrowserActions.clickOnButton(keyPress,drive);};

    public void clickJSAlert() {BrowserActions.clickOnButton(jsAlert,drive);};
    public void fileUpload() {BrowserActions.clickOnButton(fileUploader,drive);};
    public void contextMenu() {BrowserActions.clickOnButton(contextMenu,drive);};
    public void frames() {BrowserActions.clickOnButton(framesPage,drive);};



}
