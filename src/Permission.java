import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Permission {

    private AndroidDriver<AndroidElement> _ad;
    private MobileElement btnAllowGps = null;
    private MobileElement btnDenyGps = null;
    private MobileElement btnAllowTakePic = null;
    private MobileElement btnDeniedTakePic = null;



    public Permission(AndroidDriver<AndroidElement> ad) {
        try {
        _ad = ad;

        }catch (Exception e){
            System.out.println(e);
        }
    }



    public void AllowGps() throws MalformedURLException {
    try {
        btnAllowGps = _ad.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");

        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        btnAllowGps.click();
    }catch (Exception e){
        System.out.println(e);
    }
    }


    public void deniedGps() throws MalformedURLException {
        btnDenyGps = _ad.findElementById("com.android.permissioncontroller:id/permission_deny_button");
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        btnDenyGps.click();

    }

    public void allowTakePicture() throws MalformedURLException {
        btnAllowTakePic = _ad.findElementById("com.android.permissioncontroller:id/permission_allow_button");
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        btnAllowTakePic.click();

    }

    public void deniedTakePicture() throws MalformedURLException {
        btnDeniedTakePic = _ad.findElementById("com.android.permissioncontroller:id/permission_deny_button");
        _ad.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        btnDeniedTakePic.click();


    }
/*
    public MobileElement getBtnAllowGps() {
        return btnAllowGps;
    }

    public void setBtnAllowGps(MobileElement btnAllowGps) {
        this.btnAllowGps = btnAllowGps;
    }*/
}