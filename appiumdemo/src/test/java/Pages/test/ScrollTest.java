package Pages.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollTest {
	public AndroidDriver driver;
	@Test
	public void 
	scrollTest() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		cap.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
		cap.setCapability("appPackage","io.appium.android.apis");
		cap.setCapability("appActivity",".ApiDemos");
	
		URL url=new URL("http://localhost:4723/wd/hub");
		 driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement view=(MobileElement) driver.findElementByAccessibilityId("Views");
		view.click();
		scrollToElement(driver,"text","Lists");
		
		
	//	driver.findElementsByAccessibilityId("Controls");
		
	}
	public void scrollToElement( AndroidDriver driver,String an,String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSellectable()).scrollIntoView("+an+"(\""+av+"\"))");
		
	}

}
