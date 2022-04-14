package com.cts.testrunner;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features= {"src/test/resources"},
		dryRun=false, //dryRun = true will generate misiing steps snippets
		
		//dryRun =false -> it will execute the steps in the scenaios. 
		//If there is any missing step->it will generate snippet to implement it
		glue= {"com.cts.stepdef"},
		tags= {"@login"}, //OR condition
		monochrome=true,
		plugin= {"html:C:\\Users\\Sathish\\eclipse-workspace\\FirstCucumber\\src\\test\\resources\\Reports"},
		strict=true
		)
public class TestRunner {}
