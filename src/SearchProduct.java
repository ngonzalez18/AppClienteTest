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
    private AndroidDriver<AndroidElement> _ad;
    String sku;
    String productName;
   private MobileElement searchBarBtn = null;
    private MobileElement searchBarInput = null;
    private MobileElement productDetailBtn = null;
    private MobileElement deparmentMenu = null;
    private MobileElement addToCartFromListBtn = null;




    public SearchProduct(AndroidDriver<AndroidElement> ad) {
        _ad = ad;
        try {



        searchBarBtn  = automation.ad.findElementByAccessibilityId("Search-bar-btn");
     /*   searchBarInput = automation.ad.findElementByAccessibilityId("Search-bar-input");
        productDetailBtn  =  _ad.findElementByAccessibilityId("go-to-product-detail-btn");
        deparmentMenu = _ad.findElementByAccessibilityId("Departamentos, tab, 2 of 4");

*/
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void productDepartment() throws MalformedURLException {
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);



        //deparmentMenu.click();

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

    public void searchBarSKU() throws MalformedURLException {
        try {
        sku = "I3090045";
        searchBarBtn.click();
        searchBarInput = _ad.findElementByAccessibilityId("Search-bar-input");
         searchBarInput.sendKeys(sku);
         Assert.assertEquals(sku, searchBarInput.getText());
        _ad.pressKey(new KeyEvent(AndroidKey.ENTER));
         Assert.assertEquals(productDetailBtn.getText(), sku);
         addToCartFromListBtn = _ad.findElementByAccessibilityId("add-to-card-from-list-btn");
         addToCartFromListBtn.click();

        }catch (Exception e){
            System.out.println(e);
        }


    }

  /*  public void SearchBarProductName() throws MalformedURLException {
        productName = "escoba";

        searchBarBtn.click();
        searchBarInput.sendKeys(productName);
        Assert.assertEquals(productName, searchBarInput.getText());
        _ad.pressKey(new KeyEvent(AndroidKey.ENTER));

        Assert.assertEquals(productDetailBtn.getText(), productName);
           }

*/




    public void SearchBarSugested() throws MalformedURLException {
        MobileElement inputSearchBar = _ad.findElementByAccessibilityId("Search-bar-btn");
        inputSearchBar.sendKeys("");

    }

    public void Execution() throws MalformedURLException {
        MobileElement inputSearchBar = _ad.findElementByAccessibilityId("Search-bar-btn");
        inputSearchBar.sendKeys("");

    }





}
