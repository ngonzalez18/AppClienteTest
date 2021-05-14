package Inicio;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Inicio {

    private AndroidDriver<AndroidElement> _ad;

    /*public WelcomeScreen(AndroidDriver ad) {
        _ad = ad;
    }*/
    public static void main(String args[]) throws MalformedURLException {


    }
    @Before


    public void setUp() throws MalformedURLException {
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "android");
            desiredCapabilities.setCapability("deviceName", "emulator-5554");
            desiredCapabilities.setCapability("appPackage", "com.HNL.noveyloyalty");
            desiredCapabilities.setCapability("appActivity", "com.HNL.noveyloyalty.MainActivity");
            desiredCapabilities.setCapability("noReset", true);
            URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
            _ad = new AndroidDriver(remoteUrl, desiredCapabilities);
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
        // _ad = new AndroidDriver(remoteUrl, desiredCapabilities);
    }


    @Test
    public void SkipWelcomeScreen() throws MalformedURLException {
        try {
            // _ad.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            MobileElement WelcomeScreenBtnSkip = _ad.findElementByAccessibilityId("welcome-btn-skip");
            WelcomeScreenBtnSkip.click();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    @After
    public void tearDown() {
        _ad.quit();
    }

    @Test
    public void Execution() throws MalformedURLException {

        try {
            _ad.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            MobileElement WelcomeScreenBtnSkip = _ad.findElementByAccessibilityId("welcome-btn-skip");
            WelcomeScreenBtnSkip.click();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }


}


/*
    public void CompareTextWelcomeScreen() throws MalformedURLException {

        //Comparar el texto del welcome screen
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    public void SwipeWelcomeScreen() throws MalformedURLException {

        //Navegar entre las pantallas del welcome screen y dar clic en el boton comenzar
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }*/








