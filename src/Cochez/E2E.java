package Cochez;




    import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class E2E {

        private AndroidDriver driver;

        @Before
        public void setUp() throws MalformedURLException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "android");
            desiredCapabilities.setCapability("deviceName", "emulator-5554");
            desiredCapabilities.setCapability("appPackage", "com.cochezycia.cochez");
            desiredCapabilities.setCapability("appActivity", "com.HNL.noveyloyalty.SplashActivity");
            desiredCapabilities.setCapability("noReset", true);

            URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        }

        @Test
        public void ComprarPorCategoria() {
            //falta agregar login

            MobileElement el1 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Inicio, tab, 1 of 4\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
            el1.click();
            MobileElement el2 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Productos, tab, 2 of 4\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");
            el2.click();
            MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Productos, tab, 2 of 4\"]/android.view.ViewGroup/android.view.ViewGroup");
            el3.click();
            MobileElement el4 = (MobileElement) driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"department-btn\"])[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView");
            el4.click();
            el4.click();
            MobileElement el5 = (MobileElement) driver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"subcategory-btn\"])[5]/android.view.ViewGroup/android.view.ViewGroup[2]");
            el5.click();


            //Agregar al carrito

        }

        @After
        public void tearDown() {
            driver.quit();
        }
    }


