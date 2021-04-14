import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class automation {
    public static AndroidDriver<AndroidElement> ad;
    // protected AndroidDriver driver;

    private Object By;

    public static MobileElement mobileElement;


    public static void ConfigInit() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.HNL.noveyloyalty");
        dc.setCapability("unicodeKeyboard", "true");
        dc.setCapability("resetKeyboard", "true");
        dc.setCapability("appActivity", "com.HNL.noveyloyalty.SplashActivity");
        ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
    }

    public static void main(String args[]) throws MalformedURLException {


        //Caso 1 - E2E
        ConfigInit();

        WelcomeScreen MyWScreen = new WelcomeScreen(ad);
        MyWScreen.SkipWelcomeScreen();



        Login MyLogin = new Login(ad);
      //  MyLogin.changeEnv();
        MyLogin.correctLogin();

        MobileElement el5 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
        el5.click();
       /* MobileElement el4 = (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout");
        el4.click();*/
        //  MyPermission.getBtnAllowGps().click();
        MobileElement el6 = (MobileElement) ad.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
        el6.click();

        Sucursal MySucursal = new Sucursal(ad);
        MySucursal.ValidarSucursal();



    /*   Login MyLogin = new Login(ad);
        MyLogin.correctLogin();
    }

    SearchProduct MySearchProduct = new SearchProduct(ad);
        MySearchProduct.correctLogin();*/
    }
}



