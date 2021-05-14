package Cochez;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.After;
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

    private AndroidDriver<AndroidElement> driver;
    String titleFirstScreen = "Conveniente para tus proyectos";
    String descripcionFistScreen = "Busca tu productos, agrégalos al carrito y elige el método de pago y entrega que más te convenga.";
    private MobileElement WelcomeScreenBtnSkip = null;
    private MobileElement email = null;
    private MobileElement passwordInput = null;
    private MobileElement iniciarSesionBtn = null;

    String UserEmail;
    String UserPassword;

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
    public void TextoWelcomeScreen() {
        try {

            //   MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[1]");
       /* MobileElement el1 = (MobileElement) driver.findElementByClassName("android.widget.TextView");
        String text = el1.getText();*/
            MobileElement el1 = (MobileElement) driver.findElementByClassName("android.widget.TextView");
            String el1GetTitle = el1.getText();
           // Assert.assertEquals(el1GetTitle, titleFirstScreen);
            if (el1GetTitle.equals(titleFirstScreen))
            {
                System.out.println(el1GetTitle + "es igual a " + titleFirstScreen);
            }else{
                System.out.println("Fallido " + titleFirstScreen);
            }
           // System.out.println(el1GetTitle + "es igual a" + titleFirstScreen);
            MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[2]");
            String el2GetDescText = el2.getText();
            Assert.assertEquals(el2GetDescText, descripcionFistScreen);
      //      System.out.println(el1GetTitle + "es igual a " + titleFirstScreen);
            if (el2GetDescText.equals(descripcionFistScreen))
            {
                System.out.println(el2GetDescText + "es igual a " + descripcionFistScreen);
            }else{
                System.out.println("Fallido " + descripcionFistScreen);
            }
             WelcomeScreenBtnSkip = driver.findElementByAccessibilityId("welcome-btn-skip");
            WelcomeScreenBtnSkip.click();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
/*
        MobileElement.getAttribute(“text”);
        Assert.assertEquals(el1, titleFirstScreen);
*/

    }
    @Test
    public void LoginIncorrecto() {
        try {
            WelcomeScreenBtnSkip = driver.findElementByAccessibilityId("welcome-btn-skip");
            WelcomeScreenBtnSkip.click();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            iniciarSesionBtn.click();
            MobileElement AlertLogin = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[2]");
            AlertLogin.isDisplayed();


            MobileElement WelcomeScreenBtnSkip = (MobileElement) driver.findElementByAccessibilityId("welcome-btn-skip");
            WelcomeScreenBtnSkip.click();

            email = (MobileElement) driver.findElementByAccessibilityId("Email-input");
            passwordInput = (MobileElement) driver.findElementByAccessibilityId("Password-input");
            iniciarSesionBtn = (MobileElement) driver.findElementByAccessibilityId("signIn-btn");


            //  _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            UserEmail = "prueba01.hnl@gmail.com";
            UserPassword = "pruebahnl01";
            //  boolean isElementPresent = WelcomeScreen.isDisplayed();
            //emailInput
            email.click();
            email.sendKeys(UserEmail);
            Assert.assertEquals(UserEmail, email.getText());
            //passwordInput
            passwordInput.click();
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            passwordInput.sendKeys(UserPassword);
            Assert.assertEquals(UserPassword, passwordInput.getText());

            //boton iniciar sesion

            iniciarSesionBtn.click();


        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
     @Test
    public void LoginCorrecto() {
        try {
            WelcomeScreenBtnSkip = driver.findElementByAccessibilityId("welcome-btn-skip");
            WelcomeScreenBtnSkip.click();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            MobileElement WelcomeScreenBtnSkip = (MobileElement) driver.findElementByAccessibilityId("welcome-btn-skip");
            WelcomeScreenBtnSkip.click();

            email = (MobileElement) driver.findElementByAccessibilityId("Email-input");
            passwordInput = (MobileElement) driver.findElementByAccessibilityId("Password-input");
            iniciarSesionBtn = (MobileElement) driver.findElementByAccessibilityId("signIn-btn");


            //  _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            UserEmail = "prueba01.hnl@gmail.com";
            UserPassword = "pruebahnl01";
            //  boolean isElementPresent = WelcomeScreen.isDisplayed();
            //emailInput
            email.click();
            email.sendKeys(UserEmail);
            Assert.assertEquals(UserEmail, email.getText());
            //passwordInput
            passwordInput.click();
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            passwordInput.sendKeys(UserPassword);
            Assert.assertEquals(UserPassword, passwordInput.getText());

            //boton iniciar sesion

            iniciarSesionBtn.click();


        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
        }



    /*
@Test
    public static void assertEquals(Object el2GetDescText, Object descripcionFistScreen, boolean stopOnError = true)throws Exception {
        if (!el2GetDescText.equals(descripcionFistScreen))
        {
            // take screenshot
            if (stopOnError)
            {
                throw new Exception();
            }
        }
    }

*/

    @Test
    public void Crearcuenta() {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

            WelcomeScreenBtnSkip = driver.findElementByAccessibilityId("welcome-btn-skip");
            WelcomeScreenBtnSkip.click();
            driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            MobileElement crearCuentaBtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[1]");
            crearCuentaBtn.click();
            MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.TextView[2]");
            el2.click();
            MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]");
            el3.click();
            MobileElement el4 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"welcome-btn-skip\"]/android.widget.TextView");
            el4.click();
            MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView");
            el10.click();
            MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]");
            el11.click();
            MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText");
            el12.sendKeys("prueba appium");
            MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText");
            el13.sendKeys("usuario uno");
            MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText");
            el14.sendKeys("2214545");
            MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.Spinner");
            el15.click();
            MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
            el16.click();
            MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");
            el17.sendKeys("100058");
            MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.EditText");
            el18.sendKeys("prueba1@hypernovalabs.com");
            MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.CheckBox/android.widget.TextView[1]");
            el19.click();
            MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]");
            el20.click();
            MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]");

            MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]");

            MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup");

            el23.click(); //este clic llleva al login



    }
    @After
    public void tearDown() {
        driver.quit();
    }
}