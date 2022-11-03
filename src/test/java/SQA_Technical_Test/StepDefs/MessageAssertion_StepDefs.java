package SQA_Technical_Test.StepDefs;

import SQA_Technical_Test.POM.SignInPage;
import SQA_Technical_Test.Utilities.ConfigurationReader;
import SQA_Technical_Test.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MessageAssertion_StepDefs {

    SignInPage signInPage= new SignInPage();

    @Given("user is on the sign in page")
    public void user_is_on_the_sign_in_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        signInPage.signInLink.click();

    }

    @When("User blank the username field and input {string}")
    public void userBlankTheUsernameFieldAndInput(String password) {

        signInPage.passwordBox.sendKeys(password);
    }

    @And("user clicks sign in button")
    public void userClicksSignInButton() {
        signInPage.signInButton.click();
    }

    @Then("user should  see; {string}")
    public void userShouldSee(String expectedResult) {
        Assert.assertTrue("The error message should be displayed",signInPage.passwordMessage.isDisplayed());
        Assert.assertTrue("The error message should be displayed",signInPage.formMessage.isDisplayed());
    }
}
