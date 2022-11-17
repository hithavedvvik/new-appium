package Pages.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.repository.GeneralLoginPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LoginUsingpom {
	public void login() throws MalformedURLException {
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.2 N2G47H");
	dc.setCapability(MobileCapabilityType.UDID, "55ca65127d93");
	dc.setCapability("appPackage", "com.androidsample.generalstore");
	dc.setCapability("appActivity", ".SplashActivity");
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	GeneralLoginPage login=new GeneralLoginPage(driver);
	login.login("kavi");
	}

}
