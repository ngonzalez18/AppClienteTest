import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class automation {

    public static AndroidDriver<AndroidElement> ad;
    private static Object By;

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

        WelcomeScreen MyWelcomeScreen = new WelcomeScreen(ad);
        MyWelcomeScreen.SkipWelcomeScreen();

        Login MyLogin = new Login(ad);
        MyLogin.correctLogin();

        Permission MyPermission = new Permission(ad);
        MyPermission.AllowGps();

        SearchProduct MySearchProduct = new SearchProduct(ad);
        MySearchProduct.searchBarSKU();

        ShoppingCart MyShopingCart = new ShoppingCart(ad);
        MyShopingCart.addProduct();
        MyShopingCart.btnGoToCheckout();

        CheckoutDelivery MyCheckout = new CheckoutDelivery(ad);
        MyCheckout.SelectAddress();

        CheckoutSucursal MyCheckoutSucursal = new CheckoutSucursal(ad);
        MyCheckoutSucursal.tabSucursal();





       /* Sucursal MySucursal = new Sucursal(ad);
        MySucursal.ValidarSucursal();*/







    }
}
