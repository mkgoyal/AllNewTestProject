package org.facebook.stepdefinition;

import org.facebook.base.BaseFile;
import org.facebook.page.FaceBookLoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookLogin extends BaseFile {

	@Given("Launch application and load URL")
	public void launch_application_and_load_URL() {
		
		
		browseLaunch("chrome", "https://www.facebook.com");

	}

	@When("Enter given username and password")
	public void enter_given_username_and_password() {
		FaceBookLoginPage loginPage = new FaceBookLoginPage();
		loginPage.getUsername().sendKeys("maish");
		loginPage.getPassword().sendKeys("12345");
		
		delay_Wait(10,loginPage.getLogin_btn());
		mouseLeft_Click(loginPage.getLogin_btn());
	}

	@Then("Check if login success")
	public void check_if_login_success() {

	}

}
