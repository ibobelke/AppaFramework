package renastech.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import renastech.stepsDefinitions.Guru99Login;
import renastech.stepsDefinitions.Hooks;
import renastech.utils.BrowserUtils;

public class Guru99Page extends BrowserUtils {

    public Guru99Page(){
        PageFactory.initElements(driver,this);


    }
    private static final Logger logger = Logger.getLogger(Guru99Page.class);

  @FindBy(xpath = "//input[@name='uid']")

    private WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='btnLogin']")
    private WebElement Login;


    public void setUsername (String username){
        staticWait(1);
        usernameBox.sendKeys(username);
    }

    public void setPassword (String passwordBox){
        staticWait(1);
        logger.info("Entering the password");
        password.sendKeys(passwordBox);
    }

    public void setLogin(){
        staticWait(1);
        logger.info("clicking button");
        Login.click();

    }
    public void switchToAlert(String expectedMessage){
        staticWait(2);
        String alertText=driver.switchTo().alert().getText();
        logger.info("switching the alert ");
        Assert.assertEquals("The alert message are not same",expectedMessage,alertText);
    }




}
