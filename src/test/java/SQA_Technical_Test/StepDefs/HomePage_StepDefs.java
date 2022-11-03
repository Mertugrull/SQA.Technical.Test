package SQA_Technical_Test.StepDefs;

import SQA_Technical_Test.POM.HomePage;
import SQA_Technical_Test.Utilities.ConfigurationReader;
import SQA_Technical_Test.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePage_StepDefs {

    HomePage homePage= new HomePage();


    @When("user goes to Home Page")
    public void user_goes_to_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Then("user is able to see Sign In Icon at the top of the screen")
    public void user_is_able_to_see_sign_in_icon_at_the_top_of_the_screen() {

        System.out.println("homePage.signInIcon.isDisplayed() = " + homePage.signInIcon.isDisplayed());

    }

    @Then("England, N.Ireland and Scotland on the home page")
    public void england_n_ireland_and_scotland_on_the_home_page() {

        Assert.assertTrue("The country name should be displayed",homePage.englandLink.isDisplayed());
        System.out.println("homePage.scotlandLink.isDisplayed() = " + homePage.scotlandLink.isDisplayed());
        System.out.println("homePage.nIrelandLink.isDisplayed() = " + homePage.nIrelandLink.isDisplayed());

    }

}
