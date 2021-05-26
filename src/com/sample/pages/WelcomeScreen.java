package com.sample.pages;

import com.sample.core.MobileActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class WelcomeScreen {
    private final AndroidDriver<MobileElement> driver;
    

     public WelcomeScreen(AndroidDriver<MobileElement> driver) {
        
        this.driver = driver;

     }
        public void ClickSkipWelcomeScreen() throws MalformedURLException {
            MobileElement WelcomeScreenBtnSkip = driver.findElementByAccessibilityId("welcome-btn-skip");
            WelcomeScreenBtnSkip.click();
        }


        public void SwipeWelcomeScreen() throws MalformedURLException {
            try {

                MobileActions mobileActions = new MobileActions(driver);
                mobileActions.horizontalSwipeByPercentage(0.9, 0.2, 0.5);
                driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);


            } catch (Exception e) {

                System.out.println(e.getMessage());

        }
    }
         public void ValidateFirstPageTextWelcomeScreen() {

                String textFirstPageDescripcionWS = "Es simple, agrega tus productos al carrito y selecciona Pagar.";
                String textFirstPageTitleWS = "Compra rápido y fácil";

                MobileElement firstPageTitleWS = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[1]");
                Assert.assertEquals(firstPageTitleWS.getText(), textFirstPageTitleWS);

                MobileElement firstPageDescripcionWS = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[2]");
                Assert.assertEquals(firstPageDescripcionWS.getText(), textFirstPageDescripcionWS);

        }

        public void ValidateSecondPageTextWelcomeScreen() {

            String textSecondPageDescripcionWS = "Escanea un código de barra, nuestro buscador inteligente te ayuda a encontrar el producto";
            String textSecondPageTitleWS = "Búsqueda inteligente";

            MobileElement secondPageTitleWS = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[1]");
            Assert.assertEquals(secondPageTitleWS.getText(), textSecondPageTitleWS);

            MobileElement secondPageDescripcionWS = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[2]");
            Assert.assertEquals(secondPageDescripcionWS.getText(), textSecondPageDescripcionWS);

        }

        public void ValidateThirdPageTextWelcomeScreen() {

            String textThirdPageDescripcionWS = "Selecciona tu método de pago: tarjeta de crédito, Puntos Gordos, certificado de regalo o ACH";
            String textThirdPageTitleWS = "Paga como quieras";

            MobileElement thirdPageTitleWS = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[1]");
            Assert.assertEquals(thirdPageTitleWS.getText(), textThirdPageTitleWS);

            MobileElement thirdPageDescripcionWS = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[2]");
            Assert.assertEquals(thirdPageDescripcionWS.getText(), textThirdPageDescripcionWS);

        }
        public void ClickEmpezarButton() {
            MobileElement empezarBtn = driver.findElementByAccessibilityId("welcome-btn-pressed");
            empezarBtn.click();

        }



}





