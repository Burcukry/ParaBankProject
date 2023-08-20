package Pages;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends MyMethods {
    public Elements() {

        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerButton;

    @FindBy(id="customer.firstName")
    public WebElement nameInput;

    @FindBy(id="customer.lastName")
    public WebElement lastNameInput;

    @FindBy(id="customer.address.street")
    public WebElement addressInput;

    @FindBy(id="customer.address.city")
    public WebElement addressCityInput;

    @FindBy(id="customer.address.state")
    public WebElement addressStateInput;

    @FindBy(id="customer.address.zipCode")
    public WebElement adressZipCodeInput;

    @FindBy(id="customer.phoneNumber")
    public WebElement phoneNumberInput;

    @FindBy(id="customer.ssn")
    public WebElement ssnInput;

    @FindBy(xpath = "//input[@id='customer.username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='customer.password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='repeatedPassword']")
    public WebElement confirmButton;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement registerRegister;


    @FindBy(xpath = "//p[text()='Your account was created successfully. You are now logged in.']")
    public WebElement confirmRegister;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement loginButton;

    @FindBy(xpath = "//h1[text()='Error!']")
    public WebElement invalidConfirm;

    @FindBy(xpath = "//h1[text()='Accounts Overview']")
    public WebElement validConfirm;



}
