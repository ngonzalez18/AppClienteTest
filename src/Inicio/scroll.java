package Inicio;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class scroll {

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


    /*public void sampleTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
     //    MobileElement panel = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup");
     //   MobileElement panel2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup");
        //MobileElement panel = (MobileElement) driver.findElementByClassName("android.view.ViewGroup");
      //  Dimension dimension = panel.getSize();
      //  Dimension dimension2 = panel2.getSize();
       // Dimension dimension = panel.getSize();
       int anchor = panel.getSize().getHeight() / 2;
        Double ScreenWidthStart = dimension.getWidth() * 0.8;
        int scrollStart = ScreenWidthStart.intValue();

        Double ScreenWidthEnd = dimension.getWidth() * 0.2;
        int scrollEnd = ScreenWidthStart.intValue();

       try {
            new TouchAction(driver)
                    .press(PointOption.point( anchor, scrollStart))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                    .moveTo(PointOption.point(anchor, scrollEnd))
                    .release().perform();

            Thread.sleep(3000);
    /*  TouchActions action = new TouchActions(driver);
        action.scroll(element, 10, 100);
        action.perform();*/
/*} catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());

        }


 /* Dime* size = driver.manage().window().getSize();
    int endPoint = (int) (size.height * 0.80);
    int startPoint = (int) (size.height * 0.40);
    int anchor = size.width/3;
new TouchAction(driver).press(anchor, startPoint).waitAction(Duration.ofSeconds(1)).moveTo(anchor, endPoint).release().perform();
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);




    }*/
@Test
public void horizontalSwipeByPercentage()  {
    double startPercentage = 0.8;
    double endPercentage = 0.3;
    double anchorPercentage = 0.5;
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



/*

@Test
    public void swipeByElements (MobileElement startElement, MobileElement endElement) {

    int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);

        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

        new TouchAction(driver)
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
    }

    @Test
    public void swipeDownAndClickToJob() {

        scroll.horizontalSwipeByPercentage(0.6, 0.3, 0.5);

        mobileActions.swipeByElements((AndroidElement) waitAndFindElements(jobsBy).get(1),
                (AndroidElement) waitAndFindElements(jobsBy).get(0));

        mobileActions.swipeByElements((AndroidElement) waitAndFindElements(jobsBy).get(0),
                (AndroidElement) waitAndFindElements(jobsBy).get(1));

        mobileActions.tapByElement((AndroidElement) waitAndFindElements(jobsBy).get(1));
    }
*/
    @After
    public void tearDown() {

        driver.quit();
    }
}



