package com.org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="./src/test/resources/Features",
				glue="./src/test/java/com/org/stepdefinition",
				plugin= {"html:C:/Users/GOYAL/git/AllNewTestProject/AllNewTestProject/target"}
				)
public class testRunner {

}
