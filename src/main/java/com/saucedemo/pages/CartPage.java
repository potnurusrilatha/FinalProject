package com.saucedemo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.saucedemo.drivermanager.AllDriverManager;
//import com.saucedemo.drivermanager.WebDriverManager;
import com.saucedemo.utility.Utility;

public class CartPage extends AllDriverManager {

    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public CartPage(WebDriver webDriver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 15), this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOutButton;

    public void clickOnCheckOut() {
        log.info("Clicking on the check-out button: " + checkOutButton.getText());
        checkOutButton.click();
    }
}



