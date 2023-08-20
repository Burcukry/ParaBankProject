package StepDefinitions;

import Pages.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;


public class _02_LoginStep {
    Elements elements=new Elements();

    @Given("Enter username as a{string} enter as a {string}")
    public void enterUsernameAsAEnterAsA(String username, String password) {

        elements.sendKeysMethod(elements.loginUsername,username);
        elements.sendKeysMethod(elements.loginPassword,password);

    }

    @And("click the login button")
    public void clickTheLoginButton() {

        elements.clickMethod(elements.loginButton);
    }

    @And("Confirm that Login step is unsuccessful")
    public void confirmThatLoginStepIsUnsuccessful() {
        elements.assertText(elements.invalidConfirm,"Error!");

    }

    @And("Confirm that Login Step is Successfull")
    public void confirmThatLoginStepIsSuccessfull() {
        elements.assertText(elements.validConfirm, "Accounts Overview");

    }

}