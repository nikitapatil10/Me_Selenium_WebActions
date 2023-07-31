package me_selenium_webactions.webActions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.w3c.dom.UserDataHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementAction {
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
		System.out.println("opening website --->" + browserURL);
		driver.get(browserURL);

		System.out.println("");
		driver.manage().window().maximize();
	}

	/**
	 * use this method to get text
	 * 
	 * @return
	 */
	public String getLoginBtnText() {
		String text = null;

		// TODO : get the text on login button
		text=driver.findElement(By.xpath("//button[text()='Login']")).getText();
		System.out.println("LOGIN BUTTON TEXT: "+text);
		return text;
	}

	/**
	 * use this method to perform click on button
	 */
	public void clickOnLoginBtn() {
		// TODO : click on login button
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		

	}

	/**
	 * use this method to enter user name
	 * 
	 * @param userName
	 */
	public void enterUserName(String userName) {
		// TODO : enter username "admin"
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	/**
	 * use this method to enter password
	 * 
	 * @param password
	 */
	public void enterPassWord(String password) {
		// TODO : enter password "admin"
		driver.findElement(By.id("password")).sendKeys(password);

	}

	/**
	 * use this method to click on LOGIN TO QKART button
	 */
	public void clickOnLoginToQKart() {
		// TODO : click on "LOGIN TO QKART"
		driver.findElement(By.xpath("//button[text()='Login to QKart']")).click();
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
		// TODO: Call the method openURL
		openURL("https://crio-qkart-frontend-qa.vercel.app/");
		// TODO: Call the method getLoginBtnText
		String text = getLoginBtnText();
		System.out.println("Title of Login button is: "+text);
		// TODO: Call the method clickOnLoginBtn
		clickOnLoginBtn();
		// TODO: Call the method enterUserName
		enterUserName("admin123");
		// TODO: Call the method enterPassWord
		enterPassWord("admin123");
		// TODO: Call the method clickOnLoginToQKart
		clickOnLoginToQKart();
		// TODO: Call the method closeBrowser
		closeBrowser();
	}
}
