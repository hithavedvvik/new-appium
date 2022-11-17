package Pages.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WbSwitchAPp {
	@Test
public void webswitchApp() throws MalformedURLException 
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		cap.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
		
	
		cap.setCapability("appPackage","com.androidsample.generalstore");//these two lines can be used below
		cap.setCapability("appActivity",".SplashActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//after all the elements of generalstores
		for(String window:windows)
		{
			System.out.println("Active windows"+window);
			driver.context("WEBVIEW_com.androidsample.generalstore");
			driver.findElement(By.xpath(("//input[@name='q']"))).sendKeys("test yantra");
			
		}
		//switcching from native to web
		
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.xpath(("//input[@name='q']"))).sendKeys("test yantra");
		
		//switching from web to native
		driver.context("Native_com.androidsample.generalstore");
		//switching from web to web
		driver.navigate().to("https://www.facebook.com");
	}

}
