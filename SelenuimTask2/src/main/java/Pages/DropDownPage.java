package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.BrowserActions.waitUntilElementIsVisible;

public class DropDownPage extends BasePage {
    WebDriverWait wait;

    By optionSelect = By.xpath("//select[@id='dropdown']");

    public DropDownPage(WebDriver drive){
        super(drive);
    };

    public void selectOpt (int index)  {
        Select selectOption = new Select(drive.findElement(optionSelect));
        selectOption.selectByIndex(index);
    }

}

