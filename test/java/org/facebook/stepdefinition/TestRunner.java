package org.facebook.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Feature",
				 glue="./src/test/java/org/facebook/stepdefinition",
				 plugin= {"html:./target","json:./target"}
				)
public class TestRunner {

}
