package POM;
import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookingLandingPage extends BaseUtil {

    public BookingLandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        BaseUtil.driver = driver;
    }
    // start
    @FindBy(how= How.LINK_TEXT, using = "Sign in")
    public WebElement signInLink;

    @FindBy(how= How.CSS, using = "#username")
    public WebElement enterEmail;

    @FindBy(how= How.XPATH, using = "//button[@type='submit']")
    public WebElement clickNextButtonAfterEnterEmail;

    @FindBy(how= How.XPATH, using = "//*[@id='password']")
    public WebElement enterPassword;

    @FindBy(how= How.XPATH, using = "//form[@class='nw-signin']/button")
    public WebElement clickNextButtonAfterEnterPassword;




}
