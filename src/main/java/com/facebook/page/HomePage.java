package com.facebook.page;

import com.facebook.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//button[@title = 'Accept All']")
    WebElement _accept;

    @FindBy(xpath = "//a[@id='u_0_2']")
    WebElement _createNewAccountButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")
    WebElement _logInButton;


    //method to click on accept all cookies button
    public void clickOnAcceptCookies(){
        clickOnElement(_accept);
        Reporter.log("Clicking on Accept Cookies   : " + _accept.toString() + "<br>");
        log.info("Clicking on Accept Cookies: " +_accept.toString());

    }
    //method to click on create new account button
    public void clickOnCreateNewAccount() {
        Reporter.log("Clicking on Create New Account Button  : " + _createNewAccountButton.toString() + "<br>");
        clickOnElement(_createNewAccountButton);
        log.info("Clicking on Create New Account Button: " +_createNewAccountButton.toString());
    }
    //method to click on login button
    public void clickOnLogInButton() {
        Reporter.log("Clicking on login Button : " + _logInButton.toString() + "<br>");
        clickOnElement(_logInButton);
        log.info("Clicking on login Button : " + _logInButton.toString());
    }
}
