import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class PaymentMethodCard {
    private AndroidDriver<AndroidElement> _ad;
    private MobileElement PagosEnLineaCheckbox = null;
    private MobileElement CreditCardCheckBox = null;
    private MobileElement btnAddNewCard = null;
    private MobileElement cardNumberInput = null;
    private MobileElement newCardExpirationMonths = null;
    private MobileElement newCardExpirationMonthsDrop = null;
    private MobileElement expirationYear = null;
    private MobileElement expirationYearDrop = null;
    private MobileElement cardCVVInput = null;
    private MobileElement cardNameInput = null;
    private MobileElement checkTermsAndConditions = null;
    private MobileElement btnPay = null;
    private String visaNumber = "4120520145691254";
    private String visaCVV = "123";
    private String visaNameUser = "Prueba Appium";



    public PaymentMethodCard(AndroidDriver<AndroidElement> ad) {
        _ad = ad;
        PagosEnLineaCheckbox = _ad.findElementByXPath("//android.widget.CheckBox[@content-desc=\"paymethod-Pagos en línea-checkbox\"]/android.widget.TextView[1]");

    }


    public void GoBackToCheckout() throws MalformedURLException {

    }
    public void CheckCreditCard() throws MalformedURLException {
        _ad.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        CreditCardCheckBox = _ad.findElementByXPath("//android.widget.CheckBox[@content-desc=\"submethod-Tarjeta de crédito-checkbox\"]/android.widget.TextView[1]");
        CreditCardCheckBox.click();

    }
    public void CheckOnlinePayments() throws MalformedURLException {
        _ad.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        PagosEnLineaCheckbox.click();

    }
    public void NewCard() throws MalformedURLException {

        CheckOnlinePayments();
        CheckCreditCard();
        btnAddNewCard=  _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup");
        btnAddNewCard.click();
        cardNumberInput = _ad.findElementByAccessibilityId("CardNumber-input");
        cardNumberInput.sendKeys(visaNumber);
        Assert.assertEquals(visaNumber, cardNumberInput.getText());
        newCardExpirationMonths = _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]");
        newCardExpirationMonths.click();
        newCardExpirationMonthsDrop = _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup");
        newCardExpirationMonthsDrop.click();
        expirationYear = _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]");
        expirationYear.click();
        expirationYearDrop  = _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup");
        expirationYearDrop.click();
        cardCVVInput = _ad.findElementByAccessibilityId("CardCvv-input");
        cardCVVInput.sendKeys(visaCVV);
        Assert.assertEquals(visaCVV, cardCVVInput.getText());
        cardNameInput = (MobileElement) _ad.findElementByAccessibilityId("cardName-input");
        cardNameInput.sendKeys(visaNameUser);
        Assert.assertEquals(visaNameUser, cardNameInput.getText());
        CheckTermsAndConditions();
        Pay();

    }
    public void UsedSaveCard() throws MalformedURLException {

    }
    public void AceptTermsAndCondition() throws MalformedURLException {

    }
    public void checkSaveCard() throws MalformedURLException {

    }
    public void CreateTransaction() throws MalformedURLException {

    }
    public void Pay() throws MalformedURLException {
         btnPay = _ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup");
         btnPay.click();

    }
    public void CheckTermsAndConditions() throws MalformedURLException {
       checkTermsAndConditions = _ad.findElementByXPath("//android.widget.CheckBox[@content-desc=\"checkConditionsCredit-8-checkconditions\"]/android.widget.TextView[1]");
       checkTermsAndConditions.click();

    }





}
