package Pages;

import com.typesafe.config.Config;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigLoader;

public class Profile_VerificationPage extends PageObject {
    static Config conf = ConfigLoader.load();

    @FindBy(xpath = "//h3[text()='Drag your documents and folders here']")
    WebElementFacade Scree1_text;

    @FindBy(name = "loginId")
    WebElementFacade LoginId;

    @FindBy(name = "password")
    WebElementFacade Pass;

    @FindBy(xpath = "//span[text()='Login']")
    WebElementFacade loginBtn;

    @FindBy(xpath = "//button[text()=' Login']")
    WebElementFacade loginbtn2;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    WebElementFacade Icon;


    @FindBy(id = "btnLogout")
    WebElementFacade logout;

    @FindBy(className = "mat-card-lg-image")
    WebElementFacade logo12;


    @FindBy(xpath = "//h1[text()='Welcome!']")
    WebElementFacade welcome_text;

    public void verify_logoutBtn()
    //user is verifying the components after logout

    {

        boolean Component2 = waitFor(loginBtn).isVisible();
        //user is verifying the login button on welcome screen
        System.out.println("Verified component2 after logout==" + Component2);

    }


    public void verify_logo()
    //user is verifying the office and dragon logo after logout
    {
        boolean Component1 = waitFor(logo12).isDisplayed();
        System.out.println("Verified component1 after logout==" + Component1);

    }


    public void verify_text()
    //Verifying user has reached to screen 1 after login
    {
        Scree1_text.waitUntilVisible();
        System.out.println("Verified user is at screen 1");
    }

    public void login()
    //user will login through this method
    {
        openUrl(conf.getString("loginTestUrl"));
        //url will be taken from env file
        getDriver().manage().window().maximize();
        //window will be maximised.
    }


    public void credentials()
    //user is entering the login id and password to login

    {
        loginBtn.click();
        waitFor(LoginId).sendKeys("Shiwani@officeanddragons.com");
        waitFor(Pass).sendKeys("Test@1234");
        loginbtn2.click();
    }

    public void icon()
    //user will click on icon to see the profile of the user
    {
        waitFor(Icon).click();
        System.out.println("User successfully clicked the icon");
    }

    public void logout()
    //user will logout from the application
    {
        waitFor(logout).click();
        System.out.println("Logout successfully");
    }

    public void verify_welcome()
    //user is verifying the welcome text after logout
    {
        boolean Screen1 = waitFor(welcome_text).isVisible();
        System.out.println("Verified component3 after logout==" + Screen1);

    }


}
