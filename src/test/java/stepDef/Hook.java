package stepDef;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.util.Strings;

public class Hook extends BaseUtil {

    public static WebDriver driver;

    String defaultBrowser = "ch";
    String defaultEnv = "prod";
    String url;
    String baseURL =  System.getProperty ("env");
    String browserType = System.getProperty("browser");


    @Before
    public void openBrowser(){
        if (Strings.isNullOrEmpty(browserType)){
            browserType = defaultBrowser;
        }
        if (Strings.isNullOrEmpty(baseURL)){
            baseURL = defaultEnv;
        }
        driver = initDriver (browserType);
        switch(baseURL) {
            case "qa":
                url = "http://qa.booking.com";
                break;
            case "dev":
                url = "http://dev.booking.com";
                break;
            case "prod" :
                url = "http://booking.com";
                break;
        }
        driver.get(url);
    }

    @After
    public void tearDown(Scenario scenario){
            try {
                if (scenario.isFailed()) {
                    final byte[] screenshot = ((TakesScreenshot) driver)
                            .getScreenshotAs(OutputType.BYTES);
                    scenario.attach(screenshot, "image/png", scenario.getName());
                }
            } finally {
                System.out.println("closing the browser browser...");
                System.out.println("=============================");
                driver.quit();
            }
        }
    }
