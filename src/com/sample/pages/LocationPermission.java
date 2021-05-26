package com.sample.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

import java.net.MalformedURLException;

public class LocationPermission {
    private final AndroidDriver<MobileElement> driver;
    private MobileElement btnDenyGps;
    private MobileElement btnAllowGps;

    public LocationPermission(AndroidDriver<MobileElement> driver) {
        this.driver = driver;


    }

    public void ClickAllowGps() throws MalformedURLException {
        btnAllowGps = driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
        Assert.assertEquals(btnAllowGps.getText(), "Allow only while using the app");
        btnAllowGps.click();
    }

    public void ClickDeniedGps() throws MalformedURLException {
        btnDenyGps = driver.findElementById("com.android.permissioncontroller:id/permission_deny_button");
        btnDenyGps.click();
        Assert.assertEquals(btnDenyGps.getText(), "Deny");

    }

    public boolean LocationPermissionIsDisplayed() {
        btnDenyGps = driver.findElementById("com.android.permissioncontroller:id/permission_deny_button");
        btnAllowGps = driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");

        boolean elements = false;
        if (btnAllowGps.isDisplayed()) {
            if (btnDenyGps.isDisplayed()) {

            }
            elements = true;

        } else {
            elements = false;
        }
        return elements;
    }


}
