package Steps;

import Pages.Profile_VerificationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Profile_VerificationSteps extends Profile_VerificationPage
{
    Profile_VerificationPage profile_verificationPage;


    @Given("^User login$")
    public void userLogin()
    //calling login method using reference of profile_verificationPage
    {
        profile_verificationPage.login();

    }

    @And("^enter valid credentials$")
    public void enterValidCredentials()
    //calling credentials method using reference of profile_verificationPage
    {
        profile_verificationPage.credentials();

    }

    @Given("^I am on the first screen$")
    public void iAmOnTheFirstScreen()
    //calling verify text method using reference of profile_verificationPage
    {

        profile_verificationPage.verify_text();
        System.out.println("User successfully reached to screen 1");

    }

    @When("^user click on office and dragon, icon popup comes up$")
    public void userClickOnOfficeAndDragonIconPopupComesUp()
    //calling icon method using reference of profile_verificationPage
    {

        profile_verificationPage.icon();
    }


    @Then("^User logout from the application$")
    public void userLogoutFromTheApplication()
    //calling logout method using reference of profile_verificationPage
    {

        profile_verificationPage.logout();
    }

    @Given("^I am on the welcome screen again$")
    public void iAmOnTheWelcomeScreenAgain()
    //calling verify welcome method using reference of profile_verificationPage
    {
        profile_verificationPage.verify_welcome();
        waitABit(5000);
    }



    @And("^user verify the project icon and login button\\.$")
    public void userVerifyTheProjectIconAndLoginButton()
    //calling vweify logout button and verify logo button method using reference of profile_verificationPage
    {

        profile_verificationPage.verify_logoutBtn();
        profile_verificationPage.verify_logo();
    }

    @And("^Verify user is on first_screen$")
    public void verifyUserIsOnFirst_screen() throws Throwable {

        //calling verify welcome method using reference of profile_verificationPage
        {
            profile_verificationPage.verify_welcome();
            waitABit(5000);
        }

    }
}


