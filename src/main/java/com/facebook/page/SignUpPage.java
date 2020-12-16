package com.facebook.page;

import com.facebook.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class SignUpPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());

    @FindBy(xpath = "//div[contains(text(),\"It's quick and easy.\")]")
    WebElement _itsQuickAndEasyText;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement _enterFirstName;

    @FindBy(xpath = "//input[@name ='lastname']")
    WebElement _enterSurname;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement _enterEmailAddress;

    @FindBy(xpath = "//input[@name ='reg_email_confirmation__']")
    WebElement _reEnterEmailAddress;

    @FindBy(xpath = "//input[@id='password_step_input']")
    WebElement _enterPassword;

    @FindBy(xpath = "//select[@id='day']")
    WebElement _enterDay;

    @FindBy(xpath = "//select[@id='month']")
    WebElement _enterMonth;

    @FindBy(xpath = "//select[@id='year']")
    WebElement _enterYear;

    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement _genderMale;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[10]/button[1]")
    WebElement _signUpButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement _facebookText;

    //method to verify its quick and easy text
    public String getItsEQuickEasyText() {
        Reporter.log("Getting Text From : " + _itsQuickAndEasyText.toString() + "<br>");
        log.info("Getting Text From : " + _itsQuickAndEasyText.toString());
        return getTextFromElement(_itsQuickAndEasyText);
    }

    //method to enter first name
    public void enterFirstName(String firstname) {
        Reporter.log("Enter First Name: " + firstname + "to firstname field" + _enterFirstName.toString() + "<br>");
        sendTextToElement(_enterFirstName, firstname);
        log.info("Enter First Name: " + firstname + "to firstname field" + _enterFirstName.toString());
    }

    //method to enter Surname
    public void enterSurname(String surname) {
        Reporter.log("Enter Surname: " + surname + "to surname field" + _enterSurname.toString() + "<br>");
        sendTextToElement(_enterSurname, surname);
        log.info("Enter Surname: " + surname + "to surname field" + _enterSurname.toString());
    }
    //method to enter email address
    public void enterEmailAddress(String email) {
        Reporter.log("Entering email address : " + email + " to email field : " + _enterEmailAddress.toString() + "<br>");
        sendTextToElement(_enterEmailAddress, email);
        log.info("Entering email address : " + email + " to email field : " + _enterEmailAddress.toString());
    }
    //method to re-enter email address
    public void reEnterEmailAddress(String email) {
        Reporter.log("Re-entering email address : " + email + " to email field : " + _reEnterEmailAddress.toString() + "<br>");
        sendTextToElement(_reEnterEmailAddress, email);
        log.info("Re-entering email address : " + email + " to email field : " + _reEnterEmailAddress.toString());
    }

    //method to enter password
    public void enterPassword(String password) {
        Reporter.log("Entering password : " + password + " to password field : " + _enterPassword.toString() + "<br>");
        sendTextToElement(_enterPassword, password);
        log.info("Entering password : " + password + " to password field : " + _enterPassword.toString());
    }
    //method to enter day
    public void enterDay(String day) {
        Reporter.log("Entering day : " + day + " to day field : " + _enterDay.toString() + "<br>");
        sendTextToElement(_enterDay, day);
        log.info("Entering day : " + day + " to day field : " + _enterDay.toString());
    }
    //method to enter month
    public void enterMonth(String month) {
        Reporter.log("Entering Month : " + month + " to month field : " + _enterMonth.toString() + "<br>");
        sendTextToElement(_enterMonth, month);
        log.info("Entering month : " + month + " to month field : " + _enterMonth.toString());
    }
    //method to enter year
    public void enterYear(String year) {
        Reporter.log("Entering Year : " + year + " to year field : " + _enterYear.toString() + "<br>");
        sendTextToElement(_enterYear, year);
        log.info("Entering year : " + year + " to year field : " + _enterYear.toString());
    }
    //method to select male
    public void selectMale() {
        Reporter.log("selecting male : " + _genderMale.toString() + "<br>");
        clickOnElement(_genderMale);
        log.info("selecting male : " + _genderMale.toString());
    }
    //method to click on sign Up button
    public void clickOnSignUpButton() {
        Reporter.log("Clicking on sign up Button  : " + _signUpButton.toString() + "<br>");
        clickOnElement(_signUpButton);
        log.info("Clicking on sign up Button: " + _signUpButton.toString());
    }
    //method to verify the facebook text
    public String getFacebookText(){
        Reporter.log("Getting Text From : " + _facebookText.toString() + "<br>");
        log.info("Getting Text From : " + _facebookText.toString());
        return getTextFromElement(_facebookText);

    }

}
