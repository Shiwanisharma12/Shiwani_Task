package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.pages.PageObject;

import java.awt.*;

public class File_OperationsStep extends PageObject {
    Pages.File_operationPage File_operationPage;


    @Given("^User is on screenFirst$")
    public void userIsOnScreenFirst()
       {
        File_operationPage.login();
        //Calling the login method using reference of fileOperationpage

       }


    @When("^user click on add more button$")
    public void userClickOnAddMoreButton()
    {

        File_operationPage.addMore();
        //calling the addmore method using reference of fileOperationpage
    }

    @And("^Pass the path of the folder in search bar of the window$")
    public void passThePathOfTheFolderInSearchBarOfTheWindow() throws Exception
    {
        File_operationPage.folderPath();
        //calling the addmore method using reference of fileOperationpage

    }

    @Then("^files will be uploaded and user move to second screen$")
    public void filesWillBeUploadedAndUserMoveToSecondScreen() {

        File_operationPage.next();
        //calling the next  method using reference of fileOperationpage


    }

    @Given("^user is on screen_two and fill the find what and replace with text$")
    public void userIsOnScreen_twoAndFillTheFindWhatAndReplaceWithText()
    {

        File_operationPage.find_what();
        //calling the find_what  method using reference of fileOperationpage
        File_operationPage.replace_with();
        //calling the replace with method using reference of fileOperationpage
    }

    @When("^user  click on Apply button,changes will be applied$")
    public void userClickOnApplyButtonChangesWillBeApplied()
    {
        File_operationPage.apply();
        //calling apply method using reference of fileOperationpage
    }

    @When("^user click on next button of screen ,redirects to last screen$")
    public void userClickOnNextButtonOfScreenRedirectsToLastScreen() throws Exception
    {
        File_operationPage.nextOfScreen2();
        //calling nextOfScreen2 method using reference of fileOperationpage

    }

    @And("^user apply prefix to the filenames$")
    public void userApplyPrefixToTheFilenames() throws Throwable
    {
       File_operationPage.prefix();
       // calling prefix method using reference of fileOperationpage
    }

    @And("^user apply suffix to the filenames$")
    public void userApplySuffixToTheFilenames() throws Throwable
    {

        File_operationPage.suffix();
        // calling suffix method using reference of fileOperationpage

    }

    @And("^click on save button, zip file with all the edit in file will be exported$")
    public void clickOnSaveButtonZipFileWithAllTheEditInFileWillBeExported() throws Throwable
    {
        File_operationPage.save();
        // calling save method using reference of fileOperationpage

    }

}

