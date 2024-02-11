package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames extends BasePage {

    String frameBoxId = "mce_0_ifr";
    By textArea = By.id("tinymce");

    By justifyButton = By.xpath("//button[@title='Justify']");
    public Frames(WebDriver drive) {
        super(drive);
    }
    public void clearTextArea() {
        switchFrame();
        drive.findElement(textArea).clear();
        switchToParent();
    }
    public void switchFrame() {
        drive.switchTo().frame(frameBoxId);
    }
    public void switchToParent() {
        drive.switchTo().parentFrame();
    }

    public void clickOnJustify(String text) {
        drive.findElement(justifyButton).click();
    }
    public void sendText(String text) {
        switchFrame();
        drive.findElement(textArea).sendKeys(text);
        switchToParent();
    }
    public String getText() {
        switchFrame();
        String text = drive.findElement(textArea).getText();
        switchToParent();
        return text;
    }

}
