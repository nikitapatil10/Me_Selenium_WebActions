package me_selenium_webactions.webdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {

	WebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 * 
	 */
	public void startBrowser() throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	/**
	 * use this method to open the url of an application
	 */
	public void openURL(String browserURL) {
		// TODO: Maximize the browser window
		System.out.println("Maximize browser window");
		driver.manage().window().maximize();

		// TODO: Open Web site denoted by "browserUrl"
		System.out.println("Opening URL ----> "+browserURL);
		driver.get(browserURL);
	}

	/**
	 * use this method to print the current url of web page.
	 */
	public String getCurrentUrl() {
		String currentUrl = null;

		// TODO : get the current page url
		currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	/**
	 * use this method to get the title of a web site
	 * 
	 * @return
	 */
	public String getPageTitle() {
		String title = null;

		// TODO: get the title of web site
		title = driver.getTitle();
		return title;
	}

	/**
	 * use this method to get page source of current web page
	 * 
	 * @return
	 */
	public void getPageSource() {
		String pageSource = null;

		// TODO : get the page source of current web page
		pageSource = driver.getPageSource();
		// TODO : Check "You need to enable JavaScript to run this app." present in page
		// source and print status
		String strToMatch = "You need to enable JavaScript to run this app.";
		boolean isPresent = pageSource.contains(strToMatch);
		System.out.println("Text is present in the page source : "+isPresent);
	}

	/**
	 * use this method to close the current window of browser
	 */
	public void closeBrowser() {
		// TODO: Close the browser window
		System.out.println("Closing the browser");
		driver.close();
	}

	public void run() throws MalformedURLException {
		
		// TODO : Call the method startBrowser
		startBrowser();

		// TODO : Call the method openURL to open https://crio-qkart-frontend-qa.vercel.app/
		openURL("https://crio-qkart-frontend-qa.vercel.app/");
		// TODO : Call the method getCurrentUrl and print the current url
		String currentPageURL = getCurrentUrl();
		System.out.println("Current page URL : "+currentPageURL);
		// TODO : call the method getPageSource
		getPageSource();
		// TODO : Call the method getPageTitle and print the title
		String title = getPageTitle();
		System.out.println("Title of the page : "+title);
		// TODO : Call the methods closeBrowser
		closeBrowser();
	}
}

