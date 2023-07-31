package me_selenium_webactions.browserInit;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserInit {

	/**
	 * use this method to initialize the browser.
	 */
	public void startBrowser() throws MalformedURLException {
		// TODO : Initialise and start a Chrome window using RemoteWebDriver class
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}





	public void run() throws MalformedURLException {
		this.startBrowser();
	}

}
