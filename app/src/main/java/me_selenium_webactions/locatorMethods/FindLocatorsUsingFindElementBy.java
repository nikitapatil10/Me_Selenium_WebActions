package me_selenium_webactions.locatorMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLocatorsUsingFindElementBy {
	RemoteWebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 */
	public void startBrowser() throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	/**
	 * use this method to open the url of an application
	 */
	public void openURL(String browserURL) {

		System.out.println("opening website --->" + browserURL);
		driver.get(browserURL);

		System.out.println("Maximizing window...");
		driver.manage().window().maximize();
	}

	/**
	 * use this method to locate login button and print the locator.
	 */
	public void locateWebElements() {
		// TODO : Locate the username text box on page and print the locator
		System.out.println("Locating Username TextBox");
		WebElement txtusername = driver.findElement(By.id("username"));
		System.out.println("Usernamem textbox locator value is: "+txtusername.toString());

		// TODO : Locate the password text box on page and print the locator
		System.out.println("Locating Password TextBox");
		WebElement txtpassword = driver.findElement(By.id("password"));
		System.out.println("Password textbox locator value is : "+txtpassword.toString());

		// TODO : Locate the login button on page and print the locator
		System.out.println("Locating login button...");
		WebElement loginbtn = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/button"));
		System.out.println("Login button locator value is: "+loginbtn.toString());

	}

	/**
	 * use this method to close the current window of browser
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}

	public void run() throws MalformedURLException {
	

		// TODO: Call the method startBrowser
		startBrowser();
		// TODO: Call the method openURL to open https://crio-qkart-frontend-qa.vercel.app/login
		openURL("https://crio-qkart-frontend-qa.vercel.app/login");
		// TODO: Call the method locateWebElements 
		locateWebElements();
		// TODO: Call the method closeBrowser
		closeBrowser();
	}
}
