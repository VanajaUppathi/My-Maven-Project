package Testcases;


import org.testng.annotations.Test;

import PageObjects.LoginPage;


public class LoginTest_1 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException {
		
		
		
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(username);
		
		logger.info("username entered");
		
		lp.setPassword(password);
		
		logger.info("username entered");
		
		lp.clickLogin();
		
		Thread.sleep(2000);
		logger.info("login successful");
		Thread.sleep(2000);
		
		
		
		 
		
	}

}
