package com.facebook.testbase;

import com.facebook.propertyreader.PropertyReader;
import com.facebook.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod(groups = {"sanity","smoke","regression"})
    public void tearDown() {
        closeBrowser();
    }
}

