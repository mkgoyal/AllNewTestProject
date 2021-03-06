package com.org.stepdefinition;

import com.org.base.facebookBase;
import com.org.page.loginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login extends facebookBase {

	@Given("Laund browser and url")
	public void laund_browser_and_url() {
		launchBrowserWithUrl("chrome","https://www.facebook.com");
	}

	@When("enter username and password")
	public void enter_username_and_password() {
			loginPage lpage = new loginPage();
			
			lpage.getUsername().sendKeys("manish");
			lpage.getPassword().sendKeys("12345");
			lpage.getLogin_btn().click();
	}

	@Then("check login")
	public void check_login() {

	}
}
