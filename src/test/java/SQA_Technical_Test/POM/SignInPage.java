package SQA_Technical_Test.POM;

import SQA_Technical_Test.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public SignInPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="idcta-link")
    public WebElement signInLink;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(id="submit-button")
    public WebElement signInButton;

    @FindBy(xpath = "//span[text()='Need help signing in?']")
    public WebElement helpSignInLink;

    @FindBy(xpath = "//p[@class='form-message__text']")
    public WebElement passwordMessage;

    @FindBy(xpath ="/p[@class='form-message__text']")
    public WebElement usernameMessage;

    @FindBy(id="form-message-password")
    public WebElement formMessage;





}
