package Steps;

import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends LoginPage {
    LoginPage loginPage;

    @Given("^I am on test login page$")
    public void iAmOnTestLoginPage()
    //Calling navigateTourl method using loginPage reference
    {
        loginPage.navigateTourl();
    }

    @When("^I click on login button of application$")
    public void Login()
    //Calling logins method using loginPage reference
    {
        loginPage.logins();

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton()
    //Calling setLoginbtn2 method using loginPage reference
    {

        loginPage.setLoginbtn2();
    }


    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterAnd(String username, String password)
    //Calling credentials method using loginPage reference
    {
        System.out.println(username);
        loginPage.credentials(username,password);
        //Sending parameters
    }

    @Then("^Verify the Invalid credentials message for different scenarios$")
    public void verifyTheInvalidCredentialsMessageForDifferentScenarios()
    //Calling VerifyHint method using loginPage reference

    {
        loginPage.verifyHint();
    }
}


