import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DepartmentMenu {
    private  AndroidDriver<AndroidElement> _ad;

    MobileElement homeMenu = automation.ad.findElementByAccessibilityId("Inicio, tab, 1 of 4");
    MobileElement deparmentMenu = automation.ad.findElementByAccessibilityId("Departamentos, tab, 2 of 4");
    MobileElement offersMenu = automation.ad.findElementByAccessibilityId("Ofertas, tab, 3 of 4");
    MobileElement myAccountMenu = automation.ad.findElementByAccessibilityId("Mi Cuenta, tab, 4 of 4");

    public DepartmentMenu(AndroidDriver<AndroidElement> ad) {
        _ad = ad;




    }

    public DepartmentMenu() {

    }
}

