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

public class CountNoOfProducts {
	WebDriver driver = null;

	/**
	 * use this method to initialize the browser.
	 */
	public void startBrowser() throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// TODO - Set implicity wait for 20 seconds
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
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
	 * of product listed.
	 */
	public void totalCountOfProducts() {
		int count = 0;
		// TODO: Locate all the links available on web page and print the count
		System.out.println("Locate all the products available on the page");
		List<WebElement> totalproducts = driver.findElements(By.xpath("//div[contains(@class,'MuiGrid-root MuiGrid-item')]//child::img"));
		System.out.println("Total number of products available: "+totalproducts.size());
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
		// TODO: Call the method openURL to open
		// "https://crio-qkart-frontend-qa.vercel.app/"
		openURL("https://crio-qkart-frontend-qa.vercel.app/");
		// TODO: Call the method totalCountOfLinks
		totalCountOfProducts();
		// TODO: Call the method closeBrowser
		closeBrowser();
	}
}
