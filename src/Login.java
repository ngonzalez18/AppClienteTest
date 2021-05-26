

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Login {

    private final AndroidDriver<MobileElement> driver;



    public Login(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        MobileElement emailInput =  driver.findElementByAccessibilityId("Email-input");
        emailInput.sendKeys(username);
    }
    public void setPassword(String password) {
        MobileElement  passwordInput =  driver.findElementByAccessibilityId("Password-input");
        passwordInput.sendKeys(password);
    }
    public void clickLoginButton() {
        MobileElement iniciarSesionBtn =  driver.findElementByAccessibilityId("signIn-btn");
        iniciarSesionBtn.click();
    }
    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }

}

