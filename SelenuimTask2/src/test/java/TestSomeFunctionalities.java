import Pages.*;
import org.testng.annotations.Test;


public class TestSomeFunctionalities extends BaseTest {

    @Test
    public void welcomeMessage() {
        BasePage basepage = new BasePage(drive);
        basepage.getWelcomeMessage();
        assertData.assertEquals(basepage.getWelcomeMessage(),"Welcome to the-internet");
        assertData.assertAll();
    }
    @Test
    public void ClickFormAuthentication() {
        BasePage base = new BasePage(drive);
        base.clickFormAuth();
        FormAuthenticationPage form = new FormAuthenticationPage(drive);
        form.enterUser("monahassan");
        form.enterPass("Mona2025/");
        form.loginPress();
    }

    @Test
    public void Hovers(){
        BasePage base = new BasePage(drive);
        base.clickHovers();
        HoversPage hover = new HoversPage(drive);
        hover.chooseHover(0);
    }
    @Test
    public void dropDown(){
        BasePage base = new BasePage(drive);
        base.clickDropDown();
        DropDownPage dropdown = new DropDownPage(drive);
        dropdown.selectOpt(2);
    }
}
