package com.w2a.facebook.login;

import com.w2a.facebook.core.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//Step File (Corresponding this step file we need Feature file as well!)
public class LoginTest {
	
	
	WebConnector selenium = new WebConnector();
	
	@Given("^I open \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_open(String url,String browser){
		System.out.println("I open"+url+"on"+browser);
		selenium.openBrowser(browser);
		selenium.navigate(url);
		
	}
	
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void I_enter(String object,String value){
		System.out.println("Entering in" + object+"as"+value);
		selenium.type(object, value);
		
		
	}
	
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String object){
		System.out.println("Clicking in" + object);
		
		
	}
	
	
	@Then("^login should be a \"([^\"]*)\"$")
	public void Then_Login_should_be(String expectedResult){
		System.out.println("Login is:" + expectedResult);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
