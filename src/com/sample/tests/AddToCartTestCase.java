package com.sample.tests;

import com.sample.pages.SearchBar;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;

public class AddToCartTestCase {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    private AndroidDriver<MobileElement> driver;
    private SearchBar searchBar;

    @BeforeSuite
    public void setUp() throws MalformedURLException {

        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appPackage", "com.HNL.noveyloyalty");
        desiredCapabilities.setCapability("appActivity", "com.HNL.noveyloyalty.MainActivity");
        desiredCapabilities.setCapability("noReset", true);

        //  URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        //     driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @BeforeMethod
    public void spinUpAndroidDriver() {
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(10000, SECONDS);
            searchBar = new SearchBar(driver);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
        @Test(description = "Verificar la busqueda por SKU desde el home")
        public void SkuSearchFromHome() throws MalformedURLException {
        String search = searchBar.getSearchText();
        searchBar.clickSearchBar();
        searchBar.setSearchText("X052-000008");
        searchBar.EnterSearchTextInput();
        searchBar.ValidateSKU();
        searchBar.AddToCartButtonIsDisplayed();
        searchBar.addToCartClick();



    }

    @AfterMethod
    public void stopAndroidDriver() {
        driver.quit();
    }

}
