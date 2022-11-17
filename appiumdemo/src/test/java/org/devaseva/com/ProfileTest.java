package org.devaseva.com;

import java.net.MalformedURLException;
import java.net.URL;
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
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class ProfileTest {
	public AndroidTouchAction touch;
	public Dimension dimention;
	public AndroidDriver<MobileElement>driver;

	@Test
	public void profileTest() throws MalformedURLException, InterruptedException 
	{
		
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
					
			List<MobileElement> element = driver.findElements(By.xpath("//android.widget.ScrollView/following-sibling::android.widget.ImageView"));
			MobileElement profil = driver.findElement(By.xpath("//android.widget.ScrollView/following-sibling::android.widget.ImageView[contains(@content-desc,'Profile')]"));
			//MobileElement prprofile.click();
			touch=new AndroidTouchAction(driver);
			
			for(MobileElement set:element)
			{
				System.out.println(set.getAttribute("content-desc"));
				
				
				if(set.getAttribute("content-desc").contains("Profile"))
				{
					
					touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(profil))).perform();
					System.out.println("Featured campaigns page should be displayed");
					break;
					
				}
				
			}
			
			Thread.sleep(3000);
		//  driver.findElementByAccessibilityId("Enter Mobile Number").click();
			driver.findElement(By.xpath("//android.widget.EditText[@text='Phone Number']")).sendKeys("9611262398");
			driver.findElement(By.xpath("//android.widget.Button[@content-desc='Continue']")).click();
			Thread.sleep(2000);
			//driver.activateApp("com.android.mms");
			driver.openNotifications();
			
		  
			
			
		
	}

}
