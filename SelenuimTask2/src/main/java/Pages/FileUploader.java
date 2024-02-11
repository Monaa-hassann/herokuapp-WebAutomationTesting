package Pages;

import Utilities.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploader extends BasePage{
    By chooseFile = By.id("file-upload");
    By UploadFile = By.id("file-submit");


    public FileUploader(WebDriver drive) {
        super(drive);
    }

    public void uploadFile(){
        BrowserActions.clickOnButton(fileUploader,drive);
    }
    public void chooseFile(String absoluteFilePath){
        drive.findElement(chooseFile).sendKeys(absoluteFilePath);
        uploadFile();
    }
}
