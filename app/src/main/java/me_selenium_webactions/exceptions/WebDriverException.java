package me_selenium_webactions.exceptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverException {
	WebDriver driver = null;

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

		System.out.println("Opening website --->" + browserURL);
		driver.get(browserURL);

		System.out.println("Maximize browser window");
		driver.manage().window().maximize();
	}
	
	/**
	 * use this method to locate login button
	 * and print the locator.
	 */
	public void locateLoginBtn() {
		try
		{
			System.out.println("Locating login button on page");
			WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
			System.out.println("Locator value : "+loginButton.toString());
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("Element not found on page.");
		}
	}

	/**
	 * use this method to close the current window of browser 
	 */
	public void closeBrowser() {
		System.out.println("Closing the browser window");
		driver.close();
	}
	
	public void run() throws MalformedURLException {

		//Call the method startBrowser
		this.startBrowser();
		
		//Call the method openURL
		this.openURL("https://crio-qkart-frontend-qa.vercel.app/");
		
		//Call the method locateLoginBtn 
		this.locateLoginBtn();
		
		//Call the method closeBrowser
		this.closeBrowser();

	}
}
