package org.cts.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearch {

	public HotelSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//td[@class='welcome_menu'])[1]")
	public WebElement welcomeTxtEle;
 
	@FindBy(xpath="//a[text()='Logout']")
	public WebElement logoutLink;
 
	
	public String getWelComeTxt()
	{
		String welcomeText =welcomeTxtEle.getText();
		return welcomeText;
	}
	
	public void logout()
	{
		logoutLink.click();
	}
}
