package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class Verification extends BrowserUtils {

    public Verification(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[@style='font-weight:300;line-height:66px;color:#555555;']")
    private WebElement headerVerification;


    public void setHeaderVerification(String expected){
        staticWait(2);
        String actualMassage = headerVerification.getText();
        Assert.assertEquals("The massage are not same as expected",actualMassage,expected);

    }


}
