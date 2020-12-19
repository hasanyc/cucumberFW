package stepDef;

import POM.TravelLandingPage;
import base.BaseUtil;
import io.cucumber.java.en.Given;

public class TravelTest extends BaseUtil {
    TravelLandingPage TLP = new TravelLandingPage(driver);

    @Given("^I am going to search where I am going to$")
    public void searchingForLocation() {
      System.out.println("I am going search BANGLADESH");
        TLP.whereYouGoingBox();

    }

}
