package org.devaseva.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Scenario1Test {
	@Test

	public void Scenario1Test() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		capabilities.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
		
	
		capabilities.setCapability("appPackage","com.devaseva.app");
		capabilities.setCapability("appActivity", ".MainActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement mobilenumber1 = (MobileElement) driver.findElementByAccessibilityId("Enter Mobile Number");
		mobilenumber1.tap(1, 3000);
	//	MobileElement mobilenumber = (MobileElement) driver.findElement(By.xpath("//android.view.View[@content-desc='Enter Mobile Number']"));
	//	mobilenumber1.tap(1, 300);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Phone Number']")).sendKeys("9611262398");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Continue']")).click();
		Thread.sleep(2000);
		driver.openNotifications();
		Thread.sleep(2000);
		String otptext = driver.findElement(By.xpath("//android.widget.EditText[contains(text,'Your Devaseva verification code]")).getText();
		System.out.println( otptext);
		//driver.findElement(By.xpath("//android.widget.Button[@text='SHOW APP NOTIFICATION']")).click();
		
//		for(int i=0;i<2;i++) {
//			driver.swipe(553, 2005, 553, 586,500);
}
	

}
