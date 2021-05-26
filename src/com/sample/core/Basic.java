package com.sample.core;

import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

import java.net.MalformedURLException;
import java.net.URL;

public class Basic {


    private DesiredCapabilities capabilities = new DesiredCapabilities();
    private static AndroidDriver driver = null;
    private String appiumPort;
    private String serverIp;



    @BeforeClass
    public void setup() throws MalformedURLException {
        initDriver();
    }

    public AndroidDriver getDriver() {
        return driver;
    }

    private void initDriver() throws MalformedURLException {
        System.out.println("Inside initDriver method");

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.HNL.noveyloyalty");
        desiredCapabilities.setCapability("appActivity", "com.HNL.noveyloyalty.MainActivity");
        desiredCapabilities.setCapability("noReset", true);

        String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        try
        {
            System.out.println("Argument to driver object : " + serverUrl);
            driver = new AndroidDriver(new URL(serverUrl), capabilities);

        }
        catch (NullPointerException | MalformedURLException ex) {
            throw new RuntimeException("appium driver could not be initialised for device ");
        }
        System.out.println("Driver in initdriver is : "+ driver);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    }
