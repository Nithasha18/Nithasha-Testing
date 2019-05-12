import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class ValidLogin {
	
	protected static AppiumDriver<MobileElement> driver = null;

    /**
     * Return current instance of Appium driver
     */
    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }
   
    @Test
   public void ValidLogin() throws MalformedURLException{
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator-5554");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Ramana.Sadaneni\\Downloads\\Csp-Sms-dev-release.apk");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.royalmail.csp.sms.dev");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.royalmail.csp.sms.presentation.main.MainActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		
	
}

}
