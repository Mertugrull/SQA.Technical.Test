package SQA_Technical_Test.StepDefs;

import SQA_Technical_Test.POM.SignInPage;
import SQA_Technical_Test.Utilities.ConfigurationReader;
import SQA_Technical_Test.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignIn_StepDefs {

    SignInPage signInPage=new SignInPage();

    @Given("user is on the Home Page")
    public void user_is_on_the_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user click on the Sign In icon")
    public void user_click_on_the_sign_in_icon()  {

        signInPage.signInLink.click();

    }
    @Then("user is able to see Email or Username, Password, Sign in, Need help signing in?")
    public void user_is_able_to_see_email_or_username_password_sign_in_need_help_signing_in() {

        System.out.println("signInPage.usernameBox.isDisplayed() = " + signInPage.usernameBox.isDisplayed());
        System.out.println("signInPage.passwordBox.isDisplayed() = " + signInPage.passwordBox.isDisplayed());
        System.out.println("signInPage.signInButton.isDisplayed() = " + signInPage.signInButton.isDisplayed());
        System.out.println("signInPage.helpSignInLink.isDisplayed() = " + signInPage.helpSignInLink.isDisplayed());

    }

    @When("user click the Sign In icon")
    public void userClickTheSignInIcon() {

        signInPage.signInLink.click();
    }

    @When("user input password")
    public void userInputPassword() {

        signInPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @And("user click sign in button")
    public void userClickSignInButton() {

        signInPage.signInButton.click();
    }

    @Then("user is able to see Something’s missing. Please check and try again.")
    public void userIsAbleToSeeSomethingSMissingPleaseCheckAndTryAgain() {

        String expectedMessage="Something’s missing. Please check and try again.";
        String actualMessage=signInPage.message.getText();
       //Assert.assertEquals("Expected and actual does not match",actualMessage, expectedMessage );
        Assert.assertEquals(actualMessage,expectedMessage);
    }


    @Then("user is able to see Sorry, that password is too short. It needs to be eight characters or more.")
    public void userIsAbleToSeeSorryThatPasswordIsTooShortItNeedsToBeEightCharactersOrMore() {

        String expectedMessage="Sorry, that password is too short. It needs to be eight characters or more.";
        String actualMessage=signInPage.message.getText();
        Assert.assertEquals(actualMessage,expectedMessage);

    }


    @Then("Sorry, that password isn't valid. Please include a letter.")
    public void sorryThatPasswordIsnTValidPleaseIncludeALetter() {

        String expectedMessage="Sorry, that password isn't valid. Please include a letter.";
        String actualMessage=signInPage.message.getText();
        Assert.assertEquals(actualMessage,expectedMessage);

    }
}