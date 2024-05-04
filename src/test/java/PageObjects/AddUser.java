package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser {
	
	WebDriver driver;
	
	public AddUser(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	@FindBy(xpath="//span[normalize-space()='PIM']")
	@CacheLookup
	WebElement pim;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
	@CacheLookup
	WebElement adduser;
	
	@FindBy(name="firstName")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(name="lastName")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement empid;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement save;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement dlicence;
	
	
	
	public void clickpim() {
		pim.click();
    }
	
	public void clickadduser() {
		adduser.click();
    }
	
  public void setfirstName(String fname) {
		
	firstName.sendKeys(fname);
		
		}
  
  public void setlastName(String lname) {
		
		lastName.sendKeys(lname);
			
			}
  
  public void setempid(String eid) {
		
		empid.sendKeys(String.valueOf(eid));
		
  }
  
  public void clicksave() {
		save.click();
  }
  
  public void setdrivinglicence(String dl) {
		
		empid.sendKeys(dl);
  }
  
  


		
	

}
