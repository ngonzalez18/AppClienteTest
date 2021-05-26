package com.sample.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Login {

    private final AndroidDriver<MobileElement> driver;
    private MobileElement emailInput;
    private MobileElement passwordInput;
    private MobileElement iniciarSesionBtn;


    public Login(AndroidDriver<MobileElement> driver) {

        this.driver = driver;
        emailInput =  driver.findElementByAccessibilityId("Email-input");
        passwordInput =  driver.findElementByAccessibilityId("Password-input");
        iniciarSesionBtn =  driver.findElementByAccessibilityId("signIn-btn");

    }

    public void setUsername(String username) {
        emailInput.sendKeys(username);
    }
    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }
    public void clickLoginButton() {
        iniciarSesionBtn.click();
    }
    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }
    public boolean LoginIsDisplayed() {
        emailInput.isDisplayed();
        // boolean isDisplayed = homeMenu.isDisplayed();
        boolean elements = false;
        if (emailInput.isDisplayed()) {
            if (passwordInput.isDisplayed()) {
                if (iniciarSesionBtn.isDisplayed()) {
                }
            }
            elements = true;

        } else {
            elements = false;
        }
        return elements;
    }



    }

