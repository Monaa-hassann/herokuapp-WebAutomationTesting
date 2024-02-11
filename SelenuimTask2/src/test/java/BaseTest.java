import Utilities.BrowserActions;
import Utilities.BrowserSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class BaseTest {
   static WebDriver drive;
   static SoftAssert assertData = new SoftAssert();

    @BeforeMethod
    public void BaseTest1() {

        drive = BrowserSetup.chooseBrowser("Chrome","https://the-internet.herokuapp.com/");
    }

  /* @AfterMethod
    public void BaseTest2() {
       drive.quit();
    } */
}
