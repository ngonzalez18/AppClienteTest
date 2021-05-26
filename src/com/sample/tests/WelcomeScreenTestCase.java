package com.sample.tests;

import com.sample.core.MobileActions;
import com.sample.pages.Login;
import com.sample.pages.WelcomeScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;

public class WelcomeScreenTestCase {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    private AndroidDriver<MobileElement> driver;
    private WelcomeScreen welcomeScreen;
    private MobileActions mobileActions;


    @BeforeSuite
    public void setUp() throws MalformedURLException {

        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.HNL.noveyloyalty");
        desiredCapabilities.setCapability("appActivity", "com.HNL.noveyloyalty.MainActivity");
        desiredCapabilities.setCapability("noReset", false);

        //  URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        //     driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @BeforeMethod
    public void spinUpAndroidDriver() {
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10000, SECONDS);
        welcomeScreen = new WelcomeScreen(driver);
        mobileActions = new MobileActions(driver);
    }

    @Test(description = "Verify Text of Welcome Screen")
    public void ValidateWelcomeScreenAllPages() throws MalformedURLException {
        welcomeScreen.ValidateFirstPageTextWelcomeScreen();
        welcomeScreen.SwipeWelcomeScreen();
        welcomeScreen.ValidateSecondPageTextWelcomeScreen();
        welcomeScreen.SwipeWelcomeScreen();
        welcomeScreen.ValidateThirdPageTextWelcomeScreen();
        welcomeScreen.ClickEmpezarButton();
        Login login = new Login(driver);
        if(login.LoginIsDisplayed() == true){
            System.out.println("pass");
        }else{
            System.out.println("Validation failed");
        }
    }

    @Test(description = "Verificar el boton saltar este funcionando ")
    public void ValidateSkipButton() throws MalformedURLException {
        welcomeScreen.ClickSkipWelcomeScreen();
        Login login = new Login(driver);
        if(login.LoginIsDisplayed() == true){
            System.out.println("pass");
        }else{
            System.out.println("Validation failed");
        }
}
}
