import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;

import java.net.MalformedURLException;

public class ShoppingCart {
    private String sku;
    private AndroidDriver<AndroidElement> _ad;
    private MobileElement shoppingCartProduct = null;
    private MobileElement btnPayGoToCheckout = null;
    private MobileElement deleteProduct = null;
    private MobileElement createQuotation = null;
    private MobileElement shoppingCartBtn = null;


    public ShoppingCart(AndroidDriver<AndroidElement> ad) {
        _ad = ad;
        try {

            shoppingCartBtn = _ad.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Shopping-cart-btn\"]/android.view.ViewGroup[1]/android.widget.ImageView");


        }catch (Exception e){
        System.out.println(e);
    }

    }
    public void addProduct() throws MalformedURLException {
        try {
           /* shoppingCartProduct = _ad.findElementByAccessibilityId("go-to-product-detail-btn");
            sku = "I3090045";
            Assert.assertEquals(sku, shoppingCartProduct.getText());
           // shoppingCartProduct.click();*/
            shoppingCartBtn.click();





        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void comparePrice() throws MalformedURLException {
        sku = "I3090045";
        //Cart encontrar el precio y colocar equal debe ser igual al producto del precio



    }

    public void increaseProduct() throws MalformedURLException {

    }

    public void deleteProduct() throws MalformedURLException {
        Assert.assertEquals(sku, shoppingCartProduct.getText());
        deleteProduct  =  _ad.findElementByAccessibilityId("delete-shopping-list-btn");
        deleteProduct.click();
      //  Assert.assertEquals(sku, shoppingCartProduct.getText());
      //  Assert.assertFalse(sku, shoppingCartProduct.getText());


    }

    public void deleteAllProduct() throws MalformedURLException {

    }
    public void btnGoToCheckout() throws MalformedURLException {
        //clic al boton pagar
        try {
        btnPayGoToCheckout = _ad.findElementByAccessibilityId("go-to-checkout-btn");
        btnPayGoToCheckout.click();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public void Cotizacion() throws MalformedURLException {
        createQuotation = _ad.findElementByAccessibilityId("quote-btn");
        createQuotation.click();

    }




}

