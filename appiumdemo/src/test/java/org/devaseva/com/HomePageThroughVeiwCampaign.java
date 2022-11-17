package org.devaseva.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class HomePageThroughVeiwCampaign {
	public AndroidDriver<MobileElement>driver;
	public AndroidTouchAction touch; 
	public Dimension dimention;
	@Test

	public void viewCamphaign() throws InterruptedException, MalformedURLException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		capabilities.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
		
	
		capabilities.setCapability("appPackage","com.devaseva.app");
		capabilities.setCapability("appActivity", ".MainActivity");
		
		URL url=new URL("http://localhost:4723/wd/hub");
	driver=new AndroidDriver<MobileElement>(url,capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.view.View[@content-desc='Skip']")).click();
		System.out.println("deva seva page should be displayed");
	
		
		touch=new AndroidTouchAction(driver);
		
		for(int i=0;i<3;i++)
		{
			Thread.sleep(7000);
	
scrolldown(driver);
		}

driver.findElement(By.xpath("//android.widget.Button[@content-desc='View all Campaigns']")).click();

	System.out.println("Featured campaigns page shpould be displayed");
	Thread.sleep(5000);
	for(int i=0;i<20;i++)
	{
		MobileElement seva = driver.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'By Satguru Charitable Trust')]/child::android.widget.Button[@content-desc='Book A Seva']"));
		Thread.sleep(5000);
		
	}
	driver.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'By Satguru Charitable Trust')]/child::android.widget.Button[@content-desc='Book A Seva']")).click();
	Thread.sleep(5000);
	
	
	String expecteddata="Annadaan for 400 Sadhus";
	for(int i=0;i<6;i++)
	{
		Thread.sleep(2000);
		scrollup(driver);
		String sevatext = driver.findElement(By.xpath("//android.view.View/child::android.widget.ImageView[contains(@content-desc,'Annadaan for 400 Sadhus')]")).getAttribute("content-desc");
		System.out.println("the seva text is"+sevatext);
		if(sevatext.contains(expecteddata))
		{
			driver.findElement(By.xpath("//android.view.View/child::android.widget.ImageView[contains(@content-desc,'Annadaan for 400 Sadhus')]/android.widget.Button[contains(@content-desc,'Book A Seva')] "))
			.click();
		}
		
	}
//	driver.findElement(By.xpath("//android.view.View/child::android.widget.ImageView[contains(@content-desc,'Annadaan for 400 Sadhus')]/android.widget.Button[contains(@content-desc,'Book A Seva')] "))
//	.click();
	
	
	
	//MobileElement profile = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Profile Tab 4 of 4']"));
	//profile.click();

		
	}
	public void scrolldown(AndroidDriver<MobileElement>driver)
	{
	dimention = driver.manage().window().getSize();
	int start_xup=(int) (dimention.width*0.5);
	int start_yup=(int) (dimention.height*0.8);
	
	int end_xup=(int) (dimention.width*0.2);
	int end_yup=(int) (dimention.height*0.2);
	touch.press(PointOption.point(start_xup, start_yup))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	.moveTo(PointOption.point(end_xup, end_yup)).release().perform();
	
	}
	public void scrollup(AndroidDriver<MobileElement>driver)
	{
	
	 dimention = driver.manage().window().getSize();
	int start_xdown=(int) (dimention.width*0.5);
	int start_ydown=(int) (dimention.height*0.2);
	
	int end_xdown=(int) (dimention.width*0.2);
	int end_ydown=(int) (dimention.height*0.8);
	touch.press(PointOption.point(start_xdown, start_ydown))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	.moveTo(PointOption.point(end_xdown, end_ydown)).release().perform();
	
	
}}

