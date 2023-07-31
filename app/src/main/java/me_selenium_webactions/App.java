package me_selenium_webactions;

import java.net.MalformedURLException;

import me_selenium_webactions.browserInit.*;
import me_selenium_webactions.exceptions.*;
import me_selenium_webactions.locatorMethods.*;
import me_selenium_webactions.webActions.*;
import me_selenium_webactions.webdriverMethods.*;

public class App {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        System.out.println("From App.java");

        // TODO1 - Uncomment for Milestone 3 Activity - Add the RemoteWebDriver config
        BrowserInit browserInit = new BrowserInit();
        browserInit.run();

        // TODO2 - Uncomment for Milestone 4 Activity - Automate BrowserActions
        // BrowserActions browserActions = new BrowserActions();
        // browserActions.run();

        // TODO3 - Uncomment for Milestone 6 Activity - Automate NavigationCommands
        // NavigationCommands navigationCommands = new NavigationCommands();
        // navigationCommands.run();

        // TODO4 - Uncomment for Milestone 7 Activity - findElement (FindLocators.java)
        // FindLocators findLocators = new FindLocators();
        // findLocators.run();

        // TODO5 - Uncomment for Milestone 7 Activity - findElements (CountNoOfProducts.java)
        // CountNoOfProducts countNoOfProducts = new CountNoOfProducts();
        // countNoOfProducts.run();

        // TODO6 - Uncomment for Milestone 7 Activity - findElementByXX (FindLocatorsUsingFindElementBy.java)
        // FindLocatorsUsingFindElementBy findLocatorsUsingFindElementBy = new FindLocatorsUsingFindElementBy();
        // findLocatorsUsingFindElementBy.run();

        // TODO7 - Uncomment for Milestone 7 Activity - findElementsByXX (ProductCountUsingFindElementsBy.java)
        // ProductCountUsingFindElementsBy productCountUsingFindElementsBy = new ProductCountUsingFindElementsBy();
        // productCountUsingFindElementsBy.run();
        
        // TODO8 - Uncomment for Milestone 8 Activity - Web Elements Action
        // WebElementAction webElementAction = new WebElementAction();
        // webElementAction.run();

        // TODO9 - Uncomment for Milestone 9 Activity - WebDriverException
        // WebDriverException webDriverException = new WebDriverException();
        // webDriverException.run();

        // TODO10 - Uncomment for Milestone 9 Activity - WebElementException
        // WebElementException webElementException = new WebElementException();
        // webElementException.run();
    }
}
