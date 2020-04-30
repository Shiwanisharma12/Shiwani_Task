package Pages;


import com.typesafe.config.Config;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigLoader;

import javax.xml.ws.FaultAction;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class File_operationPage extends PageObject {
    private static Config conf = ConfigLoader.load();

    @FindBy(xpath = "//span[text()='Login']")
    WebElementFacade loginBtn;

    @FindBy(name = "loginId")
    WebElementFacade LoginId;

    @FindBy(name = "password")
    WebElementFacade Pass;

    @FindBy(xpath = "//button[text()=' Login']")
    WebElementFacade loginbtn2;

    @FindBy(className = "plus-icon")
    WebElementFacade plus_icon;

    @FindBy(xpath = "//img[@class='file-upload-icon small-file-upload']")
    WebElementFacade file;

    @FindBy(xpath = "//span[text()= ' Next']")
    WebElementFacade next;

    @FindBy(xpath = "//*[@id='findWhat0']")
    WebElementFacade find_what;


    @FindBy(xpath = "(//*[@class='mat-raised-button mat-button-base mat-accent']//*[text()= ' Apply ' ])[1]")
    WebElementFacade Apply;


    @FindBy(xpath = "//*[@id='replaceWithText0']")
    WebElementFacade replace_with;

    @FindBy(xpath = "//span[text()=' NEXT CHANGE']")
    WebElementFacade Next_Change;

    @FindBy(xpath = "//span[text()= ' Next']")
    WebElementFacade next2;

    @FindBy(xpath = "//input[@id='mat-input-2']")
    WebElementFacade prefix;

    @FindBy(id = "mat-input-3")
    WebElementFacade suffix;

    @FindBy(xpath = "//span[text()= \' Save\']")
    WebElementFacade save;

        public void apply()
        {
        waitFor(Apply).click();
        //wait for apply button to display and then click
        waitABit(30000);
        // This wait has been applied so that user can see changes have ben applied
        System.out.println("Changes have been applied");
        for (int i = 0; i <= 10; i++)
            //To view all the changes user have to click on next button again and again and panel will scroll down showing all the changes

           {

               Next_Change.waitUntilEnabled().click();
               System.out.println("User can click next change button to see all the changes");

           }


    }

    public void find_what()
    //user will enter the text which he wants to replace
    {

        waitFor(find_what).click();
        find_what.sendKeys("Walmart");
        //user want to replace walmart from files

      }


    public void login()
    //user will log into the application

    {
            openUrl(conf.getString("loginTestUrl"));
            // user is redirected to welcome screen page
            getDriver().manage().window().maximize();
            //Window will be maximised.
            waitFor(loginBtn).click();
            //user click on login button
            waitFor(LoginId).sendKeys("Shiwani@officeanddragons.com");
            //user enters login in Id field
            waitFor(Pass).sendKeys("Test@1234");
            //user enters password in password field
            loginbtn2.click();
            //user click on login button

    }

    public void addMore()
    {

        waitFor(plus_icon).click();
        //user click on "Add more" button
        waitFor(file).click();
        //user will click on file button
        waitABit(5000);
        // when user click on file button,window takes time to appear


    }

    public void folderPath() throws Exception
    //file will be uploaded using this method
    {
        //To upload a file from system ,robot class will be used
        Robot robot = new Robot();
        StringSelection path = new StringSelection("C:\\Users\\shivanis\\Documents\\Find&Replace\\Comp Plans\\Exec Retirement Plan.docx");
        //file path has been stored
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //path will be copied to clipboard
        clipboard.setContents(path, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        //user will press keys and url will be pasted in search bar of the window
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        //user will release  keys
        robot.keyPress(KeyEvent.VK_ENTER);
        //user will be press enter and file will be uploaded
        robot.keyRelease(KeyEvent.VK_ENTER);
        //user will release the enter key

    }

    public void next()
    //user is at screen 1 and user will click on next to move to screen 2
    {

        next.waitUntilEnabled().click();
        System.out.println("User has reached to screen 2");

    }

    public void replace_with()
    //user is entering the text in replace with field
    {
        waitFor(replace_with).click();
        //user click on replace with field so that user can start writing
        replace_with.sendKeys("Successive technology");
        //user want to replace walmart with successive technologies

    }

    public void nextOfScreen2()
    //user is on screen 2 and moving to screen 3 by clicking on next button
    {
        waitFor(next2).click();

    }

    public void prefix()
     //user will add prefix to all the filenames
    {
        waitFor(prefix).click();
        //user will click on prefix field to start writing
        prefix.sendKeys("Applied prefix");
        //user is entering the prefix
        waitABit(3000);
        //this wait is applied because prefix are applied after 3 seconds

    }



    public void suffix()
    {
       //user will add suffix to all the filenames
        waitFor(suffix).sendKeys("Suffix applied");
        waitABit(3000);
        //this wait is applied because prefix are applied after 3 seconds
    }

    public void save()
    //user will click on Save button of screen 3 to download the zip containing all edited files
    {
        waitFor(save).click();
        waitABit(8000);
        //This wait has been applied so that user can see zip is downloading
        System.out.println("Files with all the changes is downloaded");
    }
}
