import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class CheckoutSucursal {
    private AndroidDriver<AndroidElement> _ad;
    private MobileElement tabSucursal = null;
    private MobileElement dropdownSucursal = null;
    private MobileElement listaSucursal = null;
    private MobileElement escogerSucursal = null;
    private MobileElement sucursalScreen = null;


    public CheckoutSucursal(AndroidDriver<AndroidElement> ad) {
        _ad = ad;
        try {
            tabSucursal =  _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.View[2]");
            dropdownSucursal  = _ad.findElementByAccessibilityId("select-store-modal-btn");
            listaSucursal  = _ad.findElementByAccessibilityId("select-store-btn");
            escogerSucursal = _ad.findElementByAccessibilityId("select-branch-bt");
            sucursalScreen = _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup");

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void tabSucursal() {

        _ad.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        tabSucursal.click();

    }

    public void selectSucursal() {
        _ad.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        dropdownSucursal.click();
        listaSucursal.click();
        _ad.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        escogerSucursal.click();
        _ad.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Assert.assertEquals(sucursalScreen.getText(), "Selecciona la fecha y hora");
//Hacer scroll




    }
}
