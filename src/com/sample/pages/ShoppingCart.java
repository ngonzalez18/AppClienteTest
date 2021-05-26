package com.sample.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ShoppingCart {
    private final AndroidDriver<MobileElement> driver;
    private String searchText;
    private SearchBar searchBar;
    private MobileElement shoppingCartProduct = null;
    private MobileElement btnPayGoToCheckout = null;
    private MobileElement deleteProduct = null;
    private MobileElement createQuotation = null;
    private MobileElement shoppingCartBtn = null;

    public ShoppingCart(AndroidDriver<MobileElement> driver) {
        this.driver = driver;

    }

    public void setButtonGoToKart(){
        shoppingCartBtn = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Shopping-cart-btn\"]/android.view.ViewGroup[1]/android.widget.ImageView");
        shoppingCartBtn.click();
    }

    public void comparePrice(){

    }
    public void increaseProduct(){

    }

    public void deleteProduct(){

    }
    public void deleteAllProduct(){

    }
    public void btnGoToCheckout(){

    }
    public void Cotizacion(){

    }
}
