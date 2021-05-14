import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.time.LocalDate;

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
        try {
            selectAddress.click();
             //   boolean isSelected = selectAddress.isSelected();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void SelectShippingDate() throws MalformedURLException {
            try {
                //Usar esto en una variable para traer la fecha y luego seleccionarla enocntrandola por texto on un contains
                System.out.println("La fecha dentro de 10 días: " + LocalDate.now().plusDays(10) );
                fechaEnvio = _ad.findElementByAccessibilityId("open-date-calendar-modal-btn");
                fechaEnvio.click();
                diaEnvio = _ad.findElementByAccessibilityId("30 April 2021");
                diaEnvio.click();
            } catch (Exception e) {
                System.out.println(e);
            }
    }
    public void AceptarFecha() throws MalformedURLException {

            try {
        btnOkSelectedDate = _ad.findElementById("android:id/button1");
        btnOkSelectedDate.click();
            } catch (Exception e) {
                System.out.println(e);
            }
    }
    public void CancelarFecha() throws MalformedURLException {
        btnCancelSelectedDate = _ad.findElementById("android:id/button2");
        btnCancelSelectedDate.click();

    } public void GoToPaymentMethod() throws MalformedURLException {
            try {
                goToPaymentMethod = _ad.findElementByAccessibilityId("go-to-payment-btn");
                goToPaymentMethod.click();
            } catch (Exception e) {
                System.out.println(e);
            }
    }




    }
