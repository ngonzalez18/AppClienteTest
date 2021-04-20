import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class CheckoutDelivery {
    private AndroidDriver<AndroidElement> _ad;
    private MobileElement addNewAddressBtn = null;
    private MobileElement selectAddress = null;
    private MobileElement fechaEnvio = null;
    private MobileElement diaEnvio = null;
    private MobileElement btnOkSelectedDate = null;
    private MobileElement btnCancelSelectedDate = null;
    private MobileElement goToPaymentMethod = null;




    public CheckoutDelivery(AndroidDriver<AndroidElement> ad) {
        _ad = ad;
        try {

            addNewAddressBtn = _ad.findElementByAccessibilityId("add-new-address-btn");
            selectAddress = _ad.findElementByAccessibilityId("select-address-btn");




        }catch (Exception e){
            System.out.println(e);
        }

    }

    public void AddHomeAddressFromCheckout() throws MalformedURLException {


    }
    public void retiroDomicilioToPaymentMethod() throws MalformedURLException {

    }
    public void SucursalTab() throws MalformedURLException {

    }
    public void RetiroDomicilioTab() throws MalformedURLException {

    }

    public void SelectAddress() throws MalformedURLException {
        selectAddress.click();
        boolean isSelected = selectAddress.isSelected();
    }
    public void SelectShippingDate() throws MalformedURLException {
        fechaEnvio = _ad.findElementByAccessibilityId("open-date-calendar-modal-btn");
        diaEnvio = _ad.findElementByAccessibilityId("30 April 2021");
        fechaEnvio.click();

    }
    public void AceptarFecha() throws MalformedURLException {
        btnOkSelectedDate = _ad.findElementById("android:id/button1");
        btnOkSelectedDate.click();

    }
    public void CancelarFecha() throws MalformedURLException {
        btnCancelSelectedDate = _ad.findElementById("android:id/button2");
        btnCancelSelectedDate.click();

    } public void GoToPaymentMethod() throws MalformedURLException {
        goToPaymentMethod = _ad.findElementByAccessibilityId("go-to-payment-btn");
        goToPaymentMethod.click();

    }




    }
