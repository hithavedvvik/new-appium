package org.addintdoc.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appiumdemo.MobileDriverUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumAdIntdocappiumTest {
	@Test
	public void practoLogin() throws MalformedURLException {
		MobileDriverUtility mobiledriverutility=new MobileDriverUtility();
		DesiredCapabilities capability = mobiledriverutility.desiredCapabilities();
		
		//AndroidDriver driver = mobiledriverutility.mobileDriver("https://localhost:4723/wd/hub");
		mobiledriverutility.setPlatformName("Android");
		mobiledriverutility.capability.setVersion("7.1.2 N2G47H");
		mobiledriverutility.setDevicUdid("55ca65127d93");
		URL url = mobiledriverutility.url("http://localhost:4723/wd/hub");
		
		mobiledriverutility.androidDriver(url, capability);
		mobiledriverutility.installAppByCapabilities("appPackage","appActivity","com.practo.fabric",".module.order.serviceability.OrderServicebilityActivity");
mobiledriverutility.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//mobiledriverutility.driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='com.practo.fabric:id/mobile_number_field']")).sendKeys("9611262398");

	//mobiledriverutility.driver.findElement(By.xpath("//android.widget.Button[@text='Continue']")).click();
	mobiledriverutility.driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")).click();
	mobiledriverutility.driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Next']")).click();
	mobiledriverutility.driver.findElement(By.xpath("//android.view.View[@text='Live Chat Support']")).click();
	String welcomemsg= mobiledriverutility.driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.practo.fabric:id/salesforce_received_message_text']")).getText();
	System.out.println(welcomemsg);
	String Actualmsg="Please hold while chat is being transferred to the product specialist.";
	SoftAssert soft=new SoftAssert();
	soft.assertTrue(Actualmsg.contains(welcomemsg));
	System.out.println("tc passed");
	soft.assertAll();
	mobiledriverutility.driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='End chat session']")).click();
	mobiledriverutility.driver.findElement(By.xpath("//android.widget.Button[@text='END SESSION']")).click();
	mobiledriverutility.driver.findElement(By.xpath("//android.view.View[@content-desc='Back Button']")).click();	
	mobiledriverutility.driver.findElement(By.xpath("//android.widget.Button[@text='END SESSION']")).click();
	
	mobiledriverutility.driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();
	
	mobiledriverutility.driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Next']")).click();
	
	mobiledriverutility.driver.findElement(By.xpath("//android.widget.Button[@text='Order medicines']")).click();
	
	
String deliverylocation = mobiledriverutility.driver.findElement(By.xpath("//android.widget.TextView[@text='Set delivery location']")).getText();

System.out.println(deliverylocation);
String Actualmsglocation="Set delivery location";
soft.assertTrue(Actualmsg.contains( Actualmsglocation));
System.out.println("tc passed");
soft.assertAll();
mobiledriverutility.driver.findElement(By.xpath("(//android.widget.ImageButton)[0]")).click();
mobiledriverutility.driver.findElement(By.xpath("(//android.widget.ImageButton)[0]")).click();
mobiledriverutility.driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();
mobiledriverutility.driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.practo.fabric:id/image_view_home_nav_next']")).click();

mobiledriverutility.driver.tap(1, 239, 1067, 500);
mobiledriverutility.driver.findElement(By.xpath("//android.widget.Button[@text='Add a record']")).click();

mobiledriverutility.driver.findElement(By.xpath("//android.widget.TextView[@text='Upload files']")).click();


}
}
