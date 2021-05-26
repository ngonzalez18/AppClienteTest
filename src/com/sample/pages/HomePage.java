package com.sample.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {
    private final AndroidDriver<MobileElement> driver;
    private MobileElement homeMenu;

    public HomePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        homeMenu = driver.findElementByAccessibilityId("Inicio, tab, 1 of 4");

    }
    public void ClickHomeButton() {
        homeMenu.click();
    }
    public boolean HomeMenuIsDisplayed() {
        homeMenu.isDisplayed();
       // boolean isDisplayed = homeMenu.isDisplayed();
        boolean elements = false;
        if(homeMenu.isDisplayed()) {
            elements = true;

        }
        else{
            elements = false;
        }
        return elements;


    }


}
