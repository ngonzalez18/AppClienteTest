package com.sample.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.Assert;

public class SearchBar {
    private final AndroidDriver<MobileElement> driver;
    private MobileElement searchBarBtn;
    private MobileElement searchBarInput;
    private MobileElement productDetailBtn;
    private MobileElement deparmentMenu;
    private MobileElement addToCartFromListBtn;
    private String searchText;


    public SearchBar(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        deparmentMenu = driver.findElementByAccessibilityId("Departamentos, tab, 2 of 4");

    }
    public String getSearchText(){
        return this.searchText;
    }

    public void setSearchText(String search) {

        searchBarInput = driver.findElementByAccessibilityId("Search-bar-input");
        searchBarInput.sendKeys(search);
        this.searchText = search;
        Assert.assertEquals(searchBarInput.getText(), search);



    }


    public void clickSearchBar() {
        searchBarBtn  = driver.findElementByAccessibilityId("Search-bar-btn");
        searchBarBtn.click();

    }
    public void EnterSearchTextInput() {
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }
    public void ValidateSKU() {
        productDetailBtn  = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"go-to-product-detail-btn\"]/android.widget.TextView[3]");
        Assert.assertEquals(productDetailBtn.getText(), searchText);
    }

    public void ValidateProductName() {
        productDetailBtn  = driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"go-to-product-detail-btn\"]/android.widget.TextView[1]");
        Assert.assertEquals(productDetailBtn.getText(), searchText);
    }
    public void AddToCartButtonIsDisplayed() {
        addToCartFromListBtn = driver.findElementByAccessibilityId("add-to-card-from-list-btn");
        addToCartFromListBtn.isDisplayed();
    }

    public void addToCartClick() {
        addToCartFromListBtn = driver.findElementByAccessibilityId("add-to-card-from-list-btn");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        addToCartFromListBtn.click();
    }






}
