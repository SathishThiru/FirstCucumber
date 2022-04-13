package org.cts.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
	public static final Logger logger = LoggerFactory.getLogger(Helper.class);
	public static WebDriver driver;
	public static WebDriver launchBrowser(String browserName) {

		//switch(browserName)
		{
		//case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("chrome browser launched successfully");
			
		//	break;
		//case "firefox":
			//WebDriverManager.firefoxdriver().setup();
			//driver = new FirefoxDriver();
			//break;
		//default: System.out.println("Accepted browsernames =chrome or firefox. but u have entered"+browserName);
		}

		return driver;
	}







}
