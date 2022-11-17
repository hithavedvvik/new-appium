package Pages.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.PowerACState;
import io.appium.java_client.appmanagement.ApplicationState;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppMethods {
	@Test
	public void appMethods() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		cap.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
		
	
		cap.setCapability("appPackage","com.androidsample.generalstore");//these two lines can be used below
		cap.setCapability("appActivity",".SplashActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		///Activates the given app if it installed, but not running or if it is running or if it is running in thebackgroung
		
		//driver.activateApp("io.appium.android.apis");
		
		//Terminate the particular application if it is running
		driver.terminateApp("com.androidsample.generalstore");
		
		//queries the state of an application
		//NOT_INSALLEd,NOT_RUNNING,RUNNING_IN_BACKGROUND_SUSPENDED,RUNNING_IN_BACKGROUND,RUNNING_IN_FOOREGROUND
		ApplicationState be=driver.queryAppState("io.appium.android.apis");
		System.out.println(be);
		driver.installApp("apk path");
		
		//REset the currently running app together with the session.
		driver.resetApp();
		driver.closeApp();
		driver.launchApp();
		
		//check if the app is installed on the device
		boolean app = driver.isAppInstalled("io.appium.android.apis");
		System.out.println(app);
		
		
		//Emulate power state change on connected emultor version7.6
		
		driver.setPowerAC(PowerACState.OFF);
		driver.setPowerAC(PowerACState.ON);
		
		
		
		
		
	}
	

}
