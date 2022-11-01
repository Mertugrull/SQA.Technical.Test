package SQA_Technical_Test.POM;

import SQA_Technical_Test.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id="idcta-link")
    public WebElement signInIcon;

    @FindBy(linkText = "England")
    public WebElement englandLink;

    @FindBy(linkText = "N. Ireland")
    public WebElement nIrelandLink;

    @FindBy(linkText = "Scotland")
    public WebElement scotlandLink;

}
