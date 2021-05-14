import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class TransaccionCulminada {
    private AndroidDriver<AndroidElement> _ad;
    private MobileElement btnKeepShopping = null;
    private MobileElement btnSeeOrders = null;

    public TransaccionCulminada(AndroidDriver<AndroidElement> ad) {
        _ad = ad;
        btnKeepShopping = _ad.findElementByAccessibilityId("go-home-after-purchase-btn");
        btnSeeOrders = _ad.findElementByAccessibilityId("go-home-after-purchase-btn");
    }


    public void BotonSeguirCompando() throws MalformedURLException {
        btnKeepShopping.click();


    }

    public void BotonVerOrdenes() throws MalformedURLException {
        btnSeeOrders.click();

    }
}