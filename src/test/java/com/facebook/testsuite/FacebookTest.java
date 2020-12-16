package com.facebook.testsuite;

import com.facebook.page.HomePage;
import com.facebook.page.LoginPage;
import com.facebook.page.SignUpPage;
import com.facebook.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest extends TestBase {
    HomePage homePage;
    SignUpPage signuppage;
    LoginPage loginPage;

    @BeforeMethod
    public void openBrowser(){
        homePage = new HomePage();
        signuppage = new SignUpPage();
        loginPage = new LoginPage();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserIsOnSignUpPageSuccessfully() {
        homePage.clickOnAcceptCookies();
        homePage.clickOnCreateNewAccount();
        signuppage.getItsEQuickEasyText();
        String expectedMessage = "It's quick and easy.";
        String actualMessage = signuppage.getItsEQuickEasyText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserEnterRegisterDetailsSuccessfully()  {
        homePage.clickOnAcceptCookies();
        homePage.clickOnCreateNewAccount();
        signuppage.enterFirstName("Kaveer");
        signuppage.enterSurname("Aryan");
        int num = generateRandomNumber();
        signuppage.enterEmailAddress("kaveer" + num + "@gmail.com");
        signuppage.reEnterEmailAddress("kaveer" + num + "@gmail.com");
        signuppage.enterPassword("Hellofacebook11");
        signuppage.enterDay("12");
        signuppage.enterMonth("December");
        signuppage.enterYear("1985");
        signuppage.selectMale();
        signuppage.clickOnSignUpButton();
    }
    @Test(groups = {"sanity","smoke"})
    public void verifyUserShouldNotLoginWithoutEnteringEmailId(){
        homePage.clickOnAcceptCookies();
        loginPage.enterPassWord("Hellofacebook11");
        loginPage.clickOnLogInButton();
        loginPage.getSignUpAccountText();
        String expectedMessage = "Sign up for an account.";
        String actualMessage = loginPage.getSignUpAccountText();
        Assert.assertEquals(actualMessage, expectedMessage);


    }

    }

