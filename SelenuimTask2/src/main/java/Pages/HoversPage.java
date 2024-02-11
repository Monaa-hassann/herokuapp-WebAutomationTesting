package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HoversPage extends BasePage {
    Actions hover = new Actions(drive);
    List<WebElement> hoverlist = drive.findElements(By.xpath("//img[@src='/img/avatar-blank.jpg']"));
    List<WebElement> usersList = drive.findElements(By.tagName("h5"));

    public HoversPage (WebDriver driver) {
        super(driver);
    }

    public void chooseHover (int index) {hover.moveToElement(hoverlist.get(index)).perform();};

}
