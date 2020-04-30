package Pages;

import com.typesafe.config.Config;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigLoader;

public class LoginPage extends PageObject {
    static Config conf = ConfigLoader.load();

    @FindBy(name = "loginId")
    WebElementFacade LoginId;

    @FindBy(name = "password")
    WebElementFacade Pass;

    @FindBy(xpath = "//span[text()='Login']")
    WebElementFacade loginBtn;

    @FindBy(name = "blue button")
    WebElementFacade loginbtn2;

    @FindBy(xpath = "//div[@class='alert error']")
    WebElementFacade Both_empty;

    @FindBy(xpath = "//span[@class='error']")
    WebElementFacade String_empty;

    private String username;
    private String password;
    private String pass_word;
    private String user_name;


    public void navigateTourl()
    //user will fetch the url from env file and navigate to url
    {
        openUrl(conf.getString("loginTestUrl"));
        //user will be redirected to application url
        getDriver().manage().window().maximize();
        //window will be maximized

    }

    public void logins()
    //method will make username and password field visible to user after clicking on login button

    {

        waitFor(loginBtn).click();
        //user will click on login button to enter the details
        System.out.println("login passed");
    }


    public void setLoginbtn2()
    {
        //user click on login button to enter into the application
        waitFor(loginbtn2).click();
    }


    public void credentials(String username, String password)
    //user is entering the credentials into the username and password field fetching from the example table
    {

        this.user_name = username;
        //used to refer instance variable of current class
        this.pass_word = password;
        //used to refer instance variable of current class
        waitFor(LoginId).sendKeys(username);
        //sending login id fetching from table
        waitFor(Pass).sendKeys(password);
        //sending password fetching from table

    }


    public void verifyHint()
    // This method will verify the hint according to the credentials entered
    {

        {

            waitFor(String_empty);
            if (user_name.isEmpty())
            {
                Assert.assertEquals("Required", String_empty.getText());
                //Assertions has been applied to verify the hint
                System.out.println("Verified hint when username is empty");

            }
            if (pass_word.isEmpty())
            {
                waitFor(String_empty);
                Assert.assertEquals("Required", String_empty.getText());
                //Assertions has been applied to verify the hint
                System.out.println("Verified hint when password is empty");
            }


        }
    }
}