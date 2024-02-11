package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserSetup {
    static WebDriver drive;

    public static WebDriver chooseBrowser(String Text, String Url) {
        if (Text.equals("chrome") || Text.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
            drive = new ChromeDriver();

        } else if (Text.equals("edge") || Text.equals("Edge")) {
            WebDriverManager.edgedriver().setup();
            drive = new EdgeDriver();

        } else {
            System.out.println("browser is not found");
        }

        drive.get(Url);
        drive.manage().window().maximize();
        return drive;
    }
}
