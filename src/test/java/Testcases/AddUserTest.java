package Testcases;

import org.testng.annotations.Test;

import PageObjects.AddUser;
import PageObjects.LoginPage;

public class AddUserTest extends BaseClass {
	
	@Test
	
	public void addusertest() throws InterruptedException {
	
	driver.get(baseURL);
	Thread.sleep(2000);
	
	logger.info("URL is opened");
	
	LoginPage lp=new LoginPage(driver);
	
	lp.setUserName(username);
	
	logger.info("username entered");
	
	lp.setPassword(password);
	
	logger.info("username entered");
	
	lp.clickLogin();
	
	Thread.sleep(1000);
	logger.info("login successful");
	Thread.sleep(2000);
	
	AddUser au=new AddUser(driver);
	
	au.clickpim();
	logger.info("clicked on pim");
	Thread.sleep(2000);
	
	au.clickadduser();
	logger.info("clicked on add");
	Thread.sleep(2000);
	
	au.setfirstName("Jhon");
	au.setlastName("Crystal");
	logger.info("first and last name entered");
	//Thread.sleep(2000);
	
	au.setempid("0234");
	logger.info("employee id entered");

	au.clicksave();
	
	au.setdrivinglicence("1");
	logger.info("user Details are saved");
	
	
}
}
