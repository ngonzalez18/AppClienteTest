import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class SearchProduct {
    public AndroidDriver<AndroidElement> _ad;
    String sku;
    String productName;
    MobileElement inputSearchBtn = (MobileElement) automation.ad.findElementByAccessibilityId("Search-bar-btn");
    MobileElement inputSearchBar = automation.ad.findElementByAccessibilityId("Search-bar-input");
    MobileElement cartPriceList = (MobileElement) automation.ad.findElementByAccessibilityId("go-to-product-detail-btn");
    MobileElement deparmentMenu = automation.ad.findElementByAccessibilityId("Departamentos, tab, 2 of 4");

    public void productDepartment() throws MalformedURLException {
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);



        deparmentMenu.click();

        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        MobileElement departmentOptions = (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView");
        TouchActions action = new TouchActions(_ad);
        action.scroll(departmentOptions, 10, 100);
        action.perform();


        MobileElement pinturaDep = (MobileElement) _ad.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"department-btn\"])[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageVi");
        pinturaDep.click();

        MobileElement tapesSubc = (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
        tapesSubc.click();

        //Clic en el producto   **  Pendiente validar que muestre el boton agregar al carrito o que busque otro producto
        MobileElement productTape = (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup");
        productTape.click();

    }

    public String searchBarSKU() {
        String sku = "I3090045";
        inputSearchBtn.click();
        inputSearchBar.click();
        inputSearchBar.sendKeys("sku");
        Assert.assertEquals(sku, inputSearchBar.getText());
        _ad.pressKey(new KeyEvent(AndroidKey.ENTER));

        Assert.assertEquals(cartPriceList.getText(), sku);

        return (sku);

    }

    public void SearchBarProductName() throws MalformedURLException {
        productName = "escoba";

        inputSearchBtn.click();
        inputSearchBar.click();
        inputSearchBar.sendKeys(productName);
        Assert.assertEquals(productName, inputSearchBar.getText());
        _ad.pressKey(new KeyEvent(AndroidKey.ENTER));

        Assert.assertEquals(cartPriceList.getText(), productName);


        inputSearchBar.sendKeys("escoba");

    }

    public void SearchBarSugested() throws MalformedURLException {
        MobileElement inputSearchBar = _ad.findElementByAccessibilityId("Search-bar-btn");
        inputSearchBar.sendKeys("");

    }





}
