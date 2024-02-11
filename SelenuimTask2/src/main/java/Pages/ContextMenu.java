package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu extends BasePage{

    By boxClick = By.id("hot-spot");

    public ContextMenu(WebDriver drive) {
        super(drive);
    }

    public void contextClick () {
        Actions actions = new Actions(drive);
        actions.contextClick(drive.findElement(boxClick)).perform();
    }
    public String getPopUpText(){
        return drive.switchTo().alert().getText();
    }

    public void acceptPopUp(){
        drive.switchTo().alert().accept();
    }


}
