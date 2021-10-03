package renastech.pages;

import io.cucumber.java.an.Y;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import renastech.utils.BrowserUtils;

import java.time.Year;

public class Payment extends BrowserUtils {

    public Payment(){

        PageFactory.initElements(driver,this);
    }

   @FindBy(id="card_nmuber")

    private WebElement cNumber;

   @FindBy(xpath = "//select[@id='month']")
    private WebElement exMonth;

   @FindBy(xpath = "//select[@name='year']")
    private WebElement exYear;

   @FindBy(xpath = "//input[@name='cvv_code']")
    private WebElement cvCode;

   @FindBy(xpath = "//input[@class='button special']")
    private WebElement payButton;



   public void setcNumber (String CNumber){
       staticWait(1);
       cNumber.sendKeys(CNumber);
   }
   public void setExMonth (String Month){
       staticWait(1);
       Select select = new Select(exMonth);
       select.selectByVisibleText(Month);
   }
   public void setExYear(String Year){
       staticWait(1);
       Select select= new Select(exYear);
       select.selectByVisibleText(Year);
   }
   public void setCvCode (String cCode){
       staticWait(1);
       cvCode.sendKeys(cCode);
   }
   public void setPayButton (){
       staticWait(1);
       payButton.click();
   }



}
