import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PruebaCheckoutSucursal {


    private MobileElement tabSucursal = null;
    private MobileElement dropdownSucursal = null;
    private WebElement listaSucursal = null;
    private MobileElement escogerSucursal = null;
    private MobileElement sucursalScreen = null;
    private MobileElement ScrollSucursal = null;


    private AndroidDriver driver;

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
    }




    public void CheckoutSucursal() {

        try {

        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void shoppingCart() {

        MobileElement shoppingCartBtn = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Shopping-cart-btn\"]/android.view.ViewGroup[1]/android.widget.ImageView");
        shoppingCartBtn.click();
        MobileElement  btnPayGoToCheckout = (MobileElement) driver.findElementByAccessibilityId("go-to-checkout-btn");
        btnPayGoToCheckout.click();

    }
    public void tabSucursal() {

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        tabSucursal = (MobileElement) driver.findElementByAccessibilityId("metodo-envio-Retiro en sucursal-tab");

        tabSucursal.click();

    }

    public void selectSucursal() {
        String TextSucursal;
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        dropdownSucursal  = (MobileElement) driver.findElementByAccessibilityId("select-store-modal-btn");
        dropdownSucursal.click();
        listaSucursal  = driver.findElementByAccessibilityId("select-store-btn");

        listaSucursal.click();
        TextSucursal = listaSucursal.getText();
        System.out.println(TextSucursal);




        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        escogerSucursal = (MobileElement) driver.findElementByAccessibilityId("select-branch-btn");

        escogerSucursal.click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        sucursalScreen = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup");
        Assert.assertEquals(sucursalScreen.getText(), "Selecciona la fecha y hora");
//Hacer scroll


       // ScrollSucursal= (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup");


//colocar un if por si no hay

    }
    public void Scroll() {





    }
@Test
    public void test() {
    shoppingCart();
    tabSucursal();
    selectSucursal();



    }
    @After
    public void tearDown() {
        driver.quit();
    }
}

