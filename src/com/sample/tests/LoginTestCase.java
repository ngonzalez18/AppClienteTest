package com.sample.tests;


import com.sample.pages.HomePage;
import com.sample.pages.LocationPermission;
import com.sample.pages.Login;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginTestCase {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    private AndroidDriver<MobileElement> driver;
    private Login login;
  // private WelcomeScreen welcomeScreen;



    @BeforeSuite
    public void setUp() throws MalformedURLException {

        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.HNL.noveyloyalty");
        desiredCapabilities.setCapability("appActivity", "com.HNL.noveyloyalty.MainActivity");
        desiredCapabilities.setCapability("noReset", true);

        //  URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        //     driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @BeforeMethod
    public void spinUpAndroidDriver() {
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(10000, SECONDS);
            login = new Login(driver);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    @Test(description = "Verify that a user can login to the application with valid credentials")
    public void testValidLogin() throws MalformedURLException {
        login.login("prueba01.hnl@gmail.com", "pruebahnl18");
        LocationPermission locationpermission = new LocationPermission(driver);
        HomePage homePage = new HomePage(driver);
        if(homePage.HomeMenuIsDisplayed() == true){
        }else{
            locationpermission.ClickAllowGps();
        }
    }

    @Test(description = "Verify that a user cannot login to the application with invalid credentials")
    public void testInvalidLogin() throws MalformedURLException {

        login.login("Osanda", "MaxSoft1234");

    }

    @AfterMethod
    public void stopAndroidDriver() {
        driver.quit();
    }

}
