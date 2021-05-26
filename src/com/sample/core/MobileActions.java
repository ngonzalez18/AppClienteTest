package com.sample.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;

import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class MobileActions {
    private final AndroidDriver<MobileElement> driver;

    public MobileActions(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }


    public void horizontalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {  {

        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endPoint, anchor))
                .release().perform();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

    }
    }

}
