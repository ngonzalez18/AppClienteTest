import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class WelcomeScreen {

        private  AndroidDriver<AndroidElement> _ad;

    public WelcomeScreen(AndroidDriver<AndroidElement> ad) {

        try {

        _ad = ad;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void SkipWelcomeScreen() throws MalformedURLException {
        try {
        _ad.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        MobileElement WelcomeScreenBtnSkip = automation.ad.findElementByAccessibilityId("welcome-btn-skip");
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







