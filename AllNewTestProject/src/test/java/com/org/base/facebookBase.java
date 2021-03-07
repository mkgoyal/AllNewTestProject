package com.org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookBase {

	public static WebDriver driver;

	public WebDriver launchBrowserWithUrl(String browser, String url) {
		if (browser == "chrome") {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser == "firefox") {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser == "ie") {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

		driver.get(url);

		return driver;
	}

	public void deley_Wait(int t, WebElement ele) {
		WebDriverWait w = new WebDriverWait(driver, t);
		w.until(ExpectedConditions.elementToBeClickable(ele));
	}

}
