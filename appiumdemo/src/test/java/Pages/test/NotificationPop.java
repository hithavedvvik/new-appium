package Pages.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class NotificationPop {
	public void Notification() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		cap.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
		
	
		cap.setCapability("appPackage","io.appium.android.apis");//these two lines can be used below
		cap.setCapability("appActivity",".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='App']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Notification']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='IncomingMessage']")).click();
		Thread.sleep(2000);
		driver.openNotifications();
		driver.findElement(By.xpath("//android.widget.Button[@text='SHOW APP NOTIFICATION']")).click();
	}

}
