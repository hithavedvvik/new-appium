package Pages.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParallelExecutionTest {
	@Parameters({"deviceID","port"})
	@Test
	
	public void parallelTest(String deviceID,String port) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		cap.setCapability(MobileCapabilityType.UDID,deviceID);
		
	
		cap.setCapability("appPackage","io.appium.android.apis");//these two lines can be used below
		cap.setCapability("appActivity",".ApiDemos");
		URL url=new URL("http://localhost:"+port+"/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementsByAccessibilityId("Controls");
		driver.findElementByAccessibilityId("1. Light Theme").click();
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("kavi");
		driver.findElement(By.xpath("//android.widget.CheckBox[@text='Checkbox 1']")).click();
		
		driver.findElement(By.xpath("//android.widget.CheckBox[@text='Checkbox 2']")).click();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='RadioButton 1']")).click();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='RadioButton 2']")).click();
		driver.findElement(By.xpath("//android.widget.CheckBox[@text='Star']")).click();
		driver.hideKeyboard();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView['android.widget.CheckedTextView[@text='Venus']")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		
	}

}
