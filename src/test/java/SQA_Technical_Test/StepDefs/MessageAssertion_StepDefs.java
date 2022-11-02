package SQA_Technical_Test.StepDefs;

import SQA_Technical_Test.POM.SignInPage;
import SQA_Technical_Test.Utilities.ConfigurationReader;
import SQA_Technical_Test.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MessageAssertion_StepDefs {

    SignInPage signInPage= new SignInPage();

    @Given("user is on the sign in page")
    public void user_is_on_the_sign_in_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        signInPage.signInLink.click();

    }

    @And("user inputs password and clicks sign in button")
    public void userInputsPasswordAndClicksSignInButton() {

        signInPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        signInPage.signInButton.click();

    }

    @Then("user should  see;Something’s missing. Please check and try again.")
    public void userShouldSeeSomethingSMissingPleaseCheckAndTryAgain() {

       Assert.assertTrue("Message should be displayed",signInPage.passwordMessage.isDisplayed());
    }

    @And("user inputs the invalid password and clicks sign in button")
    public void userInputsTheInvalidPasswordAndClicksSignInButton() {

        signInPage.passwordBox.sendKeys(ConfigurationReader.getProperty("invalid.password"));
        signInPage.signInButton.click();
    }

    @Then("user is able to see; Sorry, that password is too short. It needs to be eight characters or more.")
    public void user_is_able_to_see_sorry_that_password_is_too_short_it_needs_to_be_eight_characters_or_more() {

        Assert.assertTrue("Message should be displayed",signInPage.formMessage.isDisplayed());
    }

}
