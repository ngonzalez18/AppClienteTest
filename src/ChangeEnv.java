import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ChangeEnv {
    private AndroidDriver<AndroidElement> _ad;


        @Before
        public void setUp() throws MalformedURLException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "android");
            desiredCapabilities.setCapability("deviceName", "emulator-5554");
            desiredCapabilities.setCapability("appPackage", "com.HNL.noveyloyalty");
            desiredCapabilities.setCapability("appActivity", "com.HNL.noveyloyalty.MainActivity");
            desiredCapabilities.setCapability("noReset", true);

            URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

            _ad = new AndroidDriver(remoteUrl, desiredCapabilities);
        }

        @Test
        public void ChagetoQA() {
            MobileElement envHome = (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView");
            envHome.click();
            envHome.click();
            envHome.click();
            envHome.click();
            envHome.click();
            MobileElement QA = (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup");
            QA.click();
        }

    public void ChagetoProd() {
        MobileElement envHome = (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.TextView");
        envHome.click();
        envHome.click();
        envHome.click();
        envHome.click();
        envHome.click();
        MobileElement Prod =    (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup");
        Prod.click();
    }

        @After
        public void tearDown() {
            _ad.quit();
        }
    }

