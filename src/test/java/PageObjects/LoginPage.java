package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver){
		
		driver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement btnlogin;
	

	
	public void setUserName(String uname) {
		
		username.sendKeys(uname);
		
		}
	
       public void setPassword(String pwd) {
		
		password.sendKeys(pwd);
		
		}
       
       public void clickLogin() {
    	   btnlogin.click();
       }
       
       
       
	
	
	
	

}
