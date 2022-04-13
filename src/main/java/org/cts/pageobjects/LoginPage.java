package org.cts.pageobjects;

import org.apache.log4j.PropertyConfigurator;
import org.cts.base.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class LoginPage {
	public static final Logger logger = LoggerFactory.getLogger(LoginPage.class);


	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username") 
	public WebElement userNameTxt;

	@FindBy(id="password") 
	public WebElement passwordTxt;

	@FindBy(id="login") 
	public WebElement loginBtn;



	public void login(String userName, String pwd)
	{
		PropertyConfigurator.configure("C:\\Users\\Sathish\\eclipse-workspace\\FirstCucumber\\src\\main\\resources\\log4j.properties");

		logger.warn("entering username as "+userName);
		userNameTxt.sendKeys(userName);
		logger.error("entering password as "+userName);
		passwordTxt.sendKeys(pwd);
		logger.info("clicking login button");
		loginBtn.click();
	}



}
