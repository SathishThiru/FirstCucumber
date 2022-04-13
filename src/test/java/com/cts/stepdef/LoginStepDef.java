package com.cts.stepdef;

import java.util.List;
import java.util.Map;

import org.cts.base.Helper;
import org.cts.pageobjects.HotelSearch;
import org.cts.pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class LoginStepDef {
	WebDriver driver=null;
	@Given("the user opens the application in {string}")
	public void launchApp(String browser) 
	{
		driver=Helper.launchBrowser(browser);
		driver.get("https://adactinhotelapp.com/");
	}

	@When("the user enters username as {string} and password as {string}")
	public void enterCredentials(String userName, String pwd) 
	{
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.login(userName, pwd);
	}

	@Then("login should be successful with the {string}")
	public void validateLogin(String expectedMsg) 
	{
		HotelSearch search =  new HotelSearch(driver);
		Assert.assertEquals("validating welcome text ", expectedMsg, search.getWelComeTxt());		
	}

	@Given("calculate {int} numbers")
	public void calculate_numbers(Integer int1) {
		System.out.println("hello i am an integer "+int1);
	}

	@When("the user enters prints the below data")
	public void readData(DataTable dt) {

		 List<Map<String, String>> table = dt.asMaps(String.class, String.class);
		String str = table.get(0).get("Username");
		 
		 
		 
		 
		 
//		 String str =table.get("Username");
		 System.out.println(str);
		 System.out.println(table.get(0).get("DOB"));
//		 System.out.println(table.get(1).get("Username"));
//		 System.out.println(table.get(1).get("DOB"));

//
		 
		 
		 //one single outer list
		 //the outer list will contain multiple inner lists
		 //each inner list contains multiple string value
		 
		 //outer list for rows
		 //inner list for each cell values
		//System.out.println(asList);


	}

}
