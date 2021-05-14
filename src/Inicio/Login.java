package Inicio;

 import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class Login {

    private AndroidDriver _ad;

    @Before
    public void setUp() throws MalformedURLException {
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "android");
            desiredCapabilities.setCapability("deviceName", "emulator-5554");
            desiredCapabilities.setCapability("appPackage", "com.HNL.noveyloyalty");
            desiredCapabilities.setCapability("appActivity", "com.HNL.noveyloyalty.MainActivity");
            desiredCapabilities.setCapability("noReset", true);
            URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
            _ad = new AndroidDriver(remoteUrl, desiredCapabilities);
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
        // _ad = new AndroidDriver(remoteUrl, desiredCapabilities);
    }


}
