package Inicio;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;


public class Scroll2 {

    private AndroidDriver driver;
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
        desiredCapabilities.setCapability("appPackage", "com.HNL.noveyloyalty");
        desiredCapabilities.setCapability("appActivity", "com.HNL.noveyloyalty.MainActivity");
        desiredCapabilities.setCapability("noReset", true);
        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);

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
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        MobileElement WelcomeScreenBtnSkip = (MobileElement) driver.findElementByAccessibilityId("welcome-btn-skip");
        WelcomeScreenBtnSkip.click();

        //Vertical swipe
        double startPercentage = 0.8;
        double endPercentage = 0.3;
        double anchorPercentage = 0.5;
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);

        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
       MobileElement env = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView");

        env.click();
        env.click();
        env.click();
        env.click();
        MobileElement selectEnvQa = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup");

        selectEnvQa.click();
    }

     /*   email = (MobileElement) driver.findElementByAccessibilityId("Email-input");
        passwordInput = (MobileElement) driver.findElementByAccessibilityId("Password-input");
        iniciarSesionBtn = (MobileElement) driver.findElementByAccessibilityId("signIn-btn");


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
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        passwordInput.sendKeys(UserPassword);




        //boton iniciar sesion

        iniciarSesionBtn.click();

*/



    public void swipe() throws MalformedURLException {
     /*   Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int x = width/2;
        int top_y = (int)(height*0.80);
        int bottom_y = (int)(height*0.20);
        System.out.println("coordinates :" + x + "  "+ top_y + " "+ bottom_y);
        TouchAction ts = new TouchAction(driver);
        ts.press(x, top_y).moveTo(x, bottom_y).release().perform();

        //driver.findElementByAndroidUIAutomator(“new UiScrollable(new UiSelector()).scrollIntoView(text(“Enter your element”))”);
*/
}


}
