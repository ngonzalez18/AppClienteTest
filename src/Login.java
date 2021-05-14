import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Login {

    private AndroidDriver _ad;
    private MobileElement email = null;
    private MobileElement passwordInput = null;
    private MobileElement iniciarSesionBtn = null;
    String UserEmail;
    String UserPassword;

    public Login(AndroidDriver<AndroidElement> ad) {
        _ad = ad;
    }


    @Before

    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.HNL.noveyloyalty");
        desiredCapabilities.setCapability("appActivity", "com.HNL.noveyloyalty.MainActivity");
        desiredCapabilities.setCapability("noReset", true);
        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        _ad = new AndroidDriver(remoteUrl, desiredCapabilities);

        // _ad = new AndroidDriver(remoteUrl, desiredCapabilities);

    }
 //public  MobileElement env = automation.ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]");
    //MobileElement env = (MobileElement) automation.ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView");
   // MobileElement env = (MobileElement) automation.ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView");





   // MobileElement selectEnvQa = (MobileElement) automation.ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup");








/*
    public void changeEnv() throws MalformedURLException {
 //       MobileElement env = (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView");

        env.click();
        env.click();
        env.click();
        env.click();
        selectEnvQa.click();
    }

*/
@Test
    public void correctLogin() throws MalformedURLException {
    _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    MobileElement WelcomeScreenBtnSkip = (MobileElement) _ad.findElementByAccessibilityId("welcome-btn-skip");
    WelcomeScreenBtnSkip.click();

    email = (MobileElement) _ad.findElementByAccessibilityId("Email-input");
    passwordInput = (MobileElement) _ad.findElementByAccessibilityId("Password-input");
    iniciarSesionBtn = (MobileElement) _ad.findElementByAccessibilityId("signIn-btn");


      //  _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        UserEmail = "prueba01.hnl@gmail.com";
        UserPassword = "pruebaHNL01";

      //  boolean isElementPresent = WelcomeScreen.isDisplayed();
        //emailInput
        email.click();
        email.sendKeys(UserEmail);
      //  Assert.assertEquals(UserEmail, email.getText());
        //passwordInput
        passwordInput.click();
        File scrFile = ((TakesScreenshot)_ad).getScreenshotAs(OutputType.FILE);
        passwordInput.sendKeys(UserPassword);




        //boton iniciar sesion

        iniciarSesionBtn.click();


    }
    @Test
    public void incorrectEmail() throws MalformedURLException {
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        MobileElement WelcomeScreenBtnSkip = (MobileElement) _ad.findElementByAccessibilityId("welcome-btn-skip");
        WelcomeScreenBtnSkip.click();

        email = (MobileElement) _ad.findElementByAccessibilityId("Email-input");
        passwordInput = (MobileElement) _ad.findElementByAccessibilityId("Password-input");
        iniciarSesionBtn = (MobileElement) _ad.findElementByAccessibilityId("signIn-btn");


        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        UserEmail = "pruebaerr02.hnl@gmail.com";
        UserPassword = "pruebahnl18";

        //  boolean isElementPresent = WelcomeScreen.isDisplayed();
        //emailInput
        email.click();
        email.sendKeys(UserEmail);
        Assert.assertEquals(UserEmail, email.getText());
        //passwordInput
        passwordInput.click();
        passwordInput.sendKeys(UserPassword);
        Assert.assertEquals(UserPassword, passwordInput.getText());

        //boton iniciar sesion

        iniciarSesionBtn.click();


    }
    @Test
    public void incorrectPassword() throws MalformedURLException {
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        MobileElement WelcomeScreenBtnSkip = (MobileElement) _ad.findElementByAccessibilityId("welcome-btn-skip");
        WelcomeScreenBtnSkip.click();
        email = (MobileElement) _ad.findElementByAccessibilityId("Email-input");
        passwordInput = (MobileElement) _ad.findElementByAccessibilityId("Password-input");
        iniciarSesionBtn = (MobileElement) _ad.findElementByAccessibilityId("signIn-btn");


        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        UserEmail = "prueba02.hnl@gmail.com";
        UserPassword = "pruebahnl18a";

        //  boolean isElementPresent = WelcomeScreen.isDisplayed();
        //emailInput
        email.click();
        email.sendKeys(UserEmail);
        Assert.assertEquals(UserEmail, email.getText());
        //passwordInput
        passwordInput.click();
        passwordInput.sendKeys(UserPassword);
        Assert.assertEquals(UserPassword, passwordInput.getText());

        //boton iniciar sesion

        iniciarSesionBtn.click();


    }
}
