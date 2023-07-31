package me_selenium_webactions.webdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {
	WebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 */
	public void startBrowser() throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
	}

	/**
	 * use this method to open the url of an application
	 */
	public void openURL(String browserURL) {

		System.out.println("Opening website --->" + browserURL);
		driver.get(browserURL);

		System.out.println("Maximizing window...");
		driver.manage().window().maximize();
	}
	
	/**
	 * use this method to open new url
	 * @param url
	 */
	public void navigateToUrl(String url) {
		// TODO - open the url in browser using to()
		driver.navigate().to(url);
		// TODO - print the cureent url
		System.out.println(driver.getCurrentUrl());
	}
	
	/**
	 * use this method to click on back 
	 * button on browser
	 */
	public void backToPreviousUrl() {
		//TODO - go back to previous url
		driver.navigate().back();
		//TODO - print the current url
		System.out.println(driver.getCurrentUrl());
	}
	
	/**
	 * use this method to click on forward 
	 * button on browser
	 */
	public void goToNextUrl() {
		// TODO - go to next/forward url
		driver.navigate().forward();
		// TODO - print the current url
		System.out.println(driver.getCurrentUrl());
	}
	
	/**
	 * use this method to click on refresh button
	 * on browser
	 */
	public void refreshPage() {
		//TODO - refresh the web page
		driver.navigate().refresh();
	}
	
	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		driver.close();
	}
	
	public  void run() throws MalformedURLException {
		
		startBrowser();
		// TODO: Call the method openURL to open
		// https://crio-qkart-frontend-qa.vercel.app/
		openURL("https://crio-qkart-frontend-qa.vercel.app/");
		// TODO: Call the method navigateToUrl to navigate to
		// https://crio-qkart-frontend-qa.vercel.app/login
		navigateToUrl("https://crio-qkart-frontend-qa.vercel.app/login");
		// TODO: Call the method backToPreviousUrl 
		backToPreviousUrl();
		// TODO: Call the method goToNextUrl 
		goToNextUrl();
		// TODO: Call the method refreshPage
		refreshPage();
		// TODO: Call the methods closeBrowser
		closeBrowser();
	}
}
