package POM;
import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage extends BaseUtil {

    public MyProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        BaseUtil.driver = driver;
    }
    // start
    @FindBy(how= How.XPATH, using = "//*[@id='profile-menu-trigger--content']")
    public WebElement myActualFullNameLoc;

}
