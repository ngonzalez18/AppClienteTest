import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Sucursal {



    private AndroidDriver<AndroidElement> _ad;




    public Sucursal(AndroidDriver<AndroidElement> ad) {
        _ad = ad;
    }

        /*
    }
        try {
            System.out.println("pr");
        _ad = ad;
    }catch (Exception e){
        System.out.println(e);
    }
    }
*/
    public void ValidarSucursal() throws MalformedURLException {
        try {
            Permission MyPermission = new Permission(_ad);
     /*   MobileElement el5 = (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
        el5.click();
       /* MobileElement el4 = (MobileElement) _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout");
        el4.click();*/
            //
       /* MobileElement el6 = (MobileElement) _ad.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
        el6.click();*/

           MyPermission.AllowGps();
        }catch(Exception e){

            System.out.println(e);

        }
            DepartmentMenu MyDepartmentMenu = new DepartmentMenu();
            MyDepartmentMenu.myAccountMenu.click();
        }

    }


