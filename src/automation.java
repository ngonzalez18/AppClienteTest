import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class automation {

    public static AndroidDriver<AndroidElement> ad;
    private static Object By;

    public static MobileElement mobileElement;

    public automation(AndroidDriver<AndroidElement> ad) {
    }


    public  void ConfigInit() throws MalformedURLException {
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

       /* //Caso 1 - E2E
        automation myConfigInit= new automation(ad);
        myConfigInit.ConfigInit();


        WelcomeScreen MyWelcomeScreen = new WelcomeScreen(ad);
        MyWelcomeScreen.SkipWelcomeScreen();


       /* Login MyLogin = new Login(ad);
        MyLogin.correctLogin();*/

      /*  Permission MyPermission = new Permission(ad);
        MyPermission.AllowGps();

        SearchProduct MySearchProduct = new SearchProduct(ad);
        MySearchProduct.searchBarSKU();

        ShoppingCart MyShopingCart = new ShoppingCart(ad);

        MyShopingCart.addProduct();
        MyShopingCart.btnGoToCheckout();

        CheckoutDelivery MyCheckout = new CheckoutDelivery(ad);
        MyCheckout.SelectAddress();
        MyCheckout.SelectShippingDate();
        MyCheckout.AceptarFecha();
        MyCheckout.GoToPaymentMethod();

        PaymentMethodCard MyPaymentMethodCard = new PaymentMethodCard(ad);
        MyPaymentMethodCard.NewCard();

        TransaccionCulminada MyTransaccionCulminada = new TransaccionCulminada(ad);
        MyTransaccionCulminada.BotonSeguirCompando();
*/
    }

        public  void Quit() throws MalformedURLException {

      ad.quit();

  }


        //Caso #2

/*
        CheckoutSucursal MyCheckoutSucursal = new CheckoutSucursal(ad);
        MyCheckoutSucursal.tabSucursal();
        MyCheckoutSucursal.selectSucursal();
        MyCheckoutSucursal.Scroll();


        PaymentMethodCard MyPaymentMethodCard = new PaymentMethodCard(ad);
        MyPaymentMethodCard.NewCard();

*/



       /* Sucursal MySucursal = new Sucursal(ad);
        MySucursal.ValidarSucursal();*/


    }


