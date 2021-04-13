import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Permission {
    private AndroidDriver<AndroidElement> _ad;

    private MobileElement btnAllowGps = automation.ad.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    MobileElement btnDenyGps = automation.ad.findElementById("com.android.permissioncontroller:id/permission_deny_button");
    MobileElement btnAllowTakePic = automation.ad.findElementById("com.android.permissioncontroller:id/permission_allow_button");
    MobileElement btnDeniedTakePic = automation.ad.findElementById("com.android.permissioncontroller:id/permission_deny_button");


    public Permission(AndroidDriver<AndroidElement> ad) {
    }

    public Permission() {

    }

    public void AllowGps() throws MalformedURLException {

        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        getBtnAllowGps().click();

    }


    public void deniedGps() throws MalformedURLException {
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        btnDenyGps.click();

    }

    public void allowTakePicture() throws MalformedURLException {
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        btnAllowTakePic.click();

    }

    public void deniedTakePicture() throws MalformedURLException {
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        btnDeniedTakePic.click();


    }

    public MobileElement getBtnAllowGps() {
        return btnAllowGps;
    }

    public void setBtnAllowGps(MobileElement btnAllowGps) {
        this.btnAllowGps = btnAllowGps;
    }
}