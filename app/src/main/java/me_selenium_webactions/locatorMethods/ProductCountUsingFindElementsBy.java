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

public class ProductCountUsingFindElementsBy {
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

		System.out.println("");
		driver.manage().window().maximize();
	}

	/**
	 * use this method to locate all the products on page and print the total number
	 * of products available.
	 */
	public void totalProducts() {
		int count = 0;
		// TODO: Locate all the products available on web page and print the count
		System.out.println("Locating all the total number of elements on the web page");
		List<WebElement> totalproduct = driver.findElements(By.xpath("//div[contains(@class,'MuiGrid-root MuiGrid-item')]//child::img"));
		count = totalproduct.size();
		System.out.println("Total number of product available: "+count);
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
		// TODO: Call the method openURL to open https://crio-qkart-frontend-qa.vercel.app
		openURL("https://crio-qkart-frontend-qa.vercel.app");
		// TODO: Call the method totalProducts
		totalProducts();
		// TODO: Call the method closeBrowser
		closeBrowser();
	}
}
