package Pages.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumuninstallClass {
	@Test
	public void setup() throws MalformedURLException
	{
		//uninstall the app
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		cap.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
		cap.setCapability("appPackage","com.androidsample.generalstore");
		cap.setCapability("appActivity",".SplashActivity");
	cap.setCapability(MobileCapabilityType.FULL_RESET,"true"); //this statement or
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		//driver.removeApp("com.androidsample.generalstore");//this statement can be usde
		boolean value = driver.isAppInstalled("com.androidsample.generalstore");
		System.out.println(value);
		
		
		
	}
	}
	

