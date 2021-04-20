import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Login {
    private AndroidDriver<AndroidElement> _ad;
 //public  MobileElement env = automation.ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]");
    //MobileElement env = (MobileElement) automation.ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView");
   // MobileElement env = (MobileElement) automation.ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView");

    MobileElement email = automation.ad.findElementByAccessibilityId("Email-input");
    MobileElement passwordInput = automation.ad.findElementByAccessibilityId("Password-input");
    MobileElement iniciarSesionBtn = automation.ad.findElementByAccessibilityId("signIn-btn");
   // MobileElement selectEnvQa = (MobileElement) automation.ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup");

    String UserEmail;
    String UserPassword;



    public Login(AndroidDriver<AndroidElement> ad) {

        _ad = ad;



    }

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

    public void correctLogin() throws MalformedURLException {

        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        UserEmail = "prueba01.hnl@gmail.com";
        UserPassword = "pruebaHNL01";

        //  boolean isElementPresent = WelcomeScreen.isDisplayed();
        //emailInput
        email.click();
        email.sendKeys(UserEmail);
        Assert.assertEquals(UserEmail, email.getText());
        //passwordInput
        passwordInput.click();
        File scrFile = ((TakesScreenshot)_ad).getScreenshotAs(OutputType.FILE);
        passwordInput.sendKeys(UserPassword);




        //boton iniciar sesion

        iniciarSesionBtn.click();


    }

    public void incorrectEmail() throws MalformedURLException {

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
    public void incorrectPassword() throws MalformedURLException {

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
