package com.cts.stepdef;

import org.cts.base.Helper;
import org.cts.pageobjects.HotelSearch;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;

public class HotelSearchStepDef {
	//	WebDriver driver;
	@Then("logout of the application")
	public void logout() 
	{
		HotelSearch search = new HotelSearch(Helper.driver);
		search.logout();
	}
}
