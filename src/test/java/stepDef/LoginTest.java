package stepDef;

import POM.BookingLandingPage;
import POM.MyProfilePage;
import base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class LoginTest extends BaseUtil {
    BookingLandingPage loginPage = new BookingLandingPage(driver);
    MyProfilePage profilePage = new MyProfilePage(driver);

    @Given("^I am on Booking.com homepage$")
    public void iAmAtHomePage() {
      System.out.println("I am at Booking.com HOME PAGE - This is login test");

    }


    @Then("^I enter my username as (.*) and password as (.*)$")
    public void iShouldEnterMyUserNameAsAndPasswordAs(String userName, String password) {
        System.out.println("enter user-name as " + userName + " and password is " + password);
    }

    @Then("^I start filling out the form with following data$")
    public void iEnterFollowing(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        for (int i = 1; i < data.size(); i++) { //i starts from 1 because i=0 represents the header
            System.out.println("FirstName - " + data.get(i).get(0));
            System.out.println("LastName - " + data.get(i).get(1));
            System.out.println("dob - " + data.get(i).get(2));
            System.out.println("gender - " + data.get(i).get(3));
        }
    }

    @Then("^I enter following (.*) and (.*)$")
    public void iEnterFollowingUserNameAndPassword(String username, String password) {
        System.out.println("User name is " + username);
        System.out.println("Password is " + password);
    }

    @And("^I click on Sign in link$")
    public void clickSignInLink() {
        System.out.println("I clicked on sign in link");
        loginPage.signInLink.click();
    }

    @And("^I click on next button$")
    public void clickEmailButton() {
        System.out.println("I Clicked next button after enter the email address");
        loginPage.clickNextButtonAfterEnterEmail.click();
    }

    @And("I enter my email address as (.*)$")
    public void iEnterEmailAddress(String email) {
        System.out.println("I enter email address " + email);
        loginPage.enterEmail.sendKeys(email);
    }

    @And("I enter my password as (.*)$")
    public void iEnterPassword(String pass) {
        System.out.println("I enter password as " + pass);
        loginPage.enterPassword.sendKeys(pass);

    }

    @And("I click on Sign in button")
    public void iClickOnSignInButton() {
        System.out.println("I click on Sign in button after enter password");
        loginPage.clickNextButtonAfterEnterPassword.click();
    }

    @Then("I will see my full name in header")
    public void iWillSeeMyFullNameInHeader() {
        System.out.println("I will check my name appears after sign in");
        String actualFullName = profilePage.myActualFullNameLoc.getText();
        System.out.println (actualFullName);
        Assert.assertEquals(actualFullName, "TalentTEK Consulting");
    }
}
