package Pages.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartServer {
	@Test
	public void startServer() throws MalformedURLException, InterruptedException
	{
		//to start the server by appiumdriverlocalservice it is a default server use 4723 port
		//AppiumDriverLocalService service= AppiumDriverLocalService.buildDefaultService();
		//or we can use//
		//this is acusumised server where it overrides the default server which is already running.it is afinanalclass
		AppiumDriverLocalService service1= AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE).usingPort(4723)
				.withLogFile(new File("../AppiumSDE#/Logs.txt")));
		service1.start();
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		cap.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
		cap.setCapability("noREset", "true");
		cap.setCapability("appPackage","io.appium.android.apis");//these two lines can be used below
		cap.setCapability("appActivity","ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");//connecting the server
		AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.closeApp();
		Thread.sleep(2000);
		service1.stop();
		
		
		
		


	
		
		
		
	}

}
