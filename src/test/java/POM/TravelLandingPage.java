package POM;
import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TravelLandingPage extends BaseUtil {

    public TravelLandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        BaseUtil.driver = driver;
    }
    // start
    @FindBy(how= How.ID, using = "s1s")
    public WebElement whereYouGoingEditBox;

    public void whereYouGoingBox (){
        whereYouGoingEditBox.sendKeys("Bangladesh");
    }



}
