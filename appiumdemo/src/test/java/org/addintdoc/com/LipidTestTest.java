package org.addintdoc.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import appiumdemo.MobileDriverUtility;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LipidTestTest 
{
	@Test
	public void lipidtestValidateTest() throws MalformedURLException
	{
		MobileDriverUtility mobiledriverutility = new MobileDriverUtility();
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1");
		cap.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		
	
		cap.setCapability("appPackage","com.practo.fabric");//these two lines can be used below
		cap.setCapability("appActivity",".module.order.serviceability.OrderServicebilityActivity");
		URL url=new URL("http://localhost:4724/wd/hub");
		AndroidDriver<MobileElement>driver=new AndroidDriver<MobileElement>(url,cap);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//android.widget.TextView[@text='Mobile number']")).click();
//		driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='com.practo.fabric:id/mobile_number_field']")).sendKeys("9611262398");
//		driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
//		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")).click();
//		
//		

	}

}
