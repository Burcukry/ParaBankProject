package StepDefinitions;

import Pages.Elements;
import Utilities.BaseDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _01_RegisterStep {

    Elements elements=new Elements();

    @Given("Navigate to Para bank website")
    public void navigateToParaBankWebsite() {
        BaseDriver.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @And("Create an account")
    public void createAnAccount() {
        elements.clickMethod(elements.registerButton);
        elements.sendKeysMethod(elements.nameInput,"Ahmet");
        elements.sendKeysMethod(elements.lastNameInput,"Demir");
        elements.sendKeysMethod(elements.addressInput,"USA");
        elements.sendKeysMethod(elements.addressCityInput,"Houston");
        elements.sendKeysMethod(elements.addressStateInput,"Texas");
        elements.sendKeysMethod(elements.adressZipCodeInput,"77865");
        elements.sendKeysMethod(elements.phoneNumberInput,"3567897586");
        elements.sendKeysMethod(elements.ssnInput,"35670");
        elements.sendKeysMethod(elements.username,"brck");
        elements.sendKeysMethod(elements.password,"123");
        elements.sendKeysMethod(elements.confirmButton,"123");
        elements.clickMethod(elements.registerRegister);


    }

    @Then("Confirm your account is created successfully")
    public void confirmYourAccountIsCreatedSuccessfully() {
         elements.assertText(elements.confirmRegister,"successfully");
    }
}
