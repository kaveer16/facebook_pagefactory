package com.facebook.page;

import com.facebook.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//input[@id='email']")
    WebElement _enterEmailId;



    @FindBy(xpath = "//input[@id='pass']")
    WebElement _enterPassWord;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")
    WebElement _logInButton;

    @FindBy(xpath = "//h2[@class = 'uiHeaderTitle']")
    WebElement _troubleLoggingInText;

    @FindBy(xpath = "//a[contains(text(),'Sign up for an account.')]")
    WebElement _signUpAccountText;

    //method to enter email Id
    public void enterEmailId(String email) {
        Reporter.log("Entering email address : " + email + " to email field : " + _enterEmailId.toString() + "<br>");
        sendTextToElement(_enterEmailId, email);
        log.info("Entering email address : " + email + " to email field : " + _enterEmailId.toString());
    }
    //method to enter password
    public void enterPassWord(String password) {
        Reporter.log("Entering password : " + password + " to password field : " + _enterPassWord.toString() + "<br>");
        sendTextToElement(_enterPassWord, password);
        log.info("Entering password : " + password + " to password field : " + _enterPassWord.toString());
    }
    //method to click on login button
    public void clickOnLogInButton() {
        Reporter.log("Clicking on login Button : " + _logInButton.toString() + "<br>");
        clickOnElement(_logInButton);
        log.info("Clicking on login Button : " + _logInButton.toString());
    }
    //method to verify trouble logging in text
    public String getTroubleLoggingInText() {
        Reporter.log("Getting Text From : " + _troubleLoggingInText.toString() + "<br>");
        log.info("Getting Text From : " + _troubleLoggingInText.toString());
        return getTextFromElement(_troubleLoggingInText);
    }
    //method to verify Sign UP ACCOUNT text
    public String getSignUpAccountText() {
        Reporter.log("Getting Text From : " + _signUpAccountText.toString() + "<br>");
        log.info("Getting Text From : " + _signUpAccountText.toString());
        return getTextFromElement(_signUpAccountText);
    }
}
