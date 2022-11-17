
package org.devaseva.com;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import appiumdemo.AndroidBaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class HomeTest {
	public AndroidTouchAction touch;
	public Dimension dimention;
	public AndroidDriver<MobileElement> driver;

	@Test
	public void homeTest() throws MalformedURLException, InterruptedException
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
	
		List<MobileElement> element = driver.findElements(By.xpath("//android.widget.ScrollView/following-sibling::android.widget.ImageView"));
		MobileElement booknow = driver.findElement(By.xpath("//android.widget.ScrollView/following-sibling::android.widget.ImageView[contains(@content-desc,'Book A Seva')]"));
		
		touch=new AndroidTouchAction(driver);
		
		for(MobileElement set:element)
		{
			System.out.println(set.getAttribute("content-desc"));
			
			
			if(set.getAttribute("content-desc").contains("Book A Seva"))
			{
				
				touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(booknow))).perform();
				System.out.println("Featured campaigns page should be displayed");
				break;
				
			}
			
		}
		
		 
		Thread.sleep(3000);
		
		//String elementbooknow = driver.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'By Devaseva')]")).getAttribute("content-desc");

		//element=(List<MobileElement>) driver.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'By Satguru Charitable Trust')]"));
		
	
		String replaceddata="By Satguru Charitable Trust";
		
		for(int i=0;i<5;i++)
	{
			
		Thread.sleep(3000);
		scrolldown(driver);
		
		String elementbooknow1 = driver.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'By Satguru Charitable Trust')]")).getAttribute("content-desc");

		if(elementbooknow1.contains(replaceddata))
		{
			
			clickparticulareditbutton(replaceddata);
			

			Thread.sleep(6000);
			System.out.println("the seva is booked");
			break;
		}
		System.out.println("deva seva is checked");
	
		
	}
		
		String expecteddata="Annadaan for 400 Sadhus";
		Thread.sleep(9000);
		Thread.sleep(6000);
		for(int i=0;i<6;i++)
		{
			
			scrolldown(driver);
			String sevatext = driver.findElement(By.xpath("//android.view.View/child::android.widget.ImageView[contains(@content-desc,'for 400 Sadhus')]")).getAttribute("content-desc");
			System.out.println("the seva text is"+sevatext);
			if(sevatext.contains(expecteddata))
			{
				clickparticulareditbutton(expecteddata);
				System.out.println("the seva is booked");
			}}
		Thread.sleep(3000);
		//  driver.findElementByAccessibilityId("Enter Mobile Number").click();
			driver.findElement(By.xpath("//android.widget.EditText[@text='Phone Number']")).sendKeys("9611262398");
			driver.findElement(By.xpath("//android.widget.Button[@content-desc='Continue']")).click();
			Thread.sleep(2000);
			//driver.activateApp("com.android.mms");
			driver.openNotifications();
			
	}
	public void takescreenShot(String screenfilepath) throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trgFile=new File(screenfilepath);
		FileUtils.copyFile(scrFile, trgFile, true);
	}

	private WebElement convertFromDynamicXpathToWebElement(String elementPaticulrxpath, String replaceData) {
		String xpath = String.format(elementPaticulrxpath, replaceData);
		return driver.findElement(By.xpath(xpath));
	}

	/**
	 * 
	 */
	private By convertFromDynamicXpathtoBy(String elementPartialxpath, String replacedate) {
		String xpath = String.format(elementPartialxpath, replacedate);
		return By.xpath(xpath);
	}

	public void clickparticulareditbutton(String replacedata) {
		String particularbookxpath = "//android.widget.ImageView[contains(@content-desc,'%s')]/child::android.widget.Button[contains(@content-desc,'Book A Seva')]";
		convertFromDynamicXpathToWebElement(particularbookxpath, replacedata).click();
	}

	public void scrolldown(AndroidDriver<MobileElement> driver) {
		dimention = driver.manage().window().getSize();
		int start_xup = (int) (dimention.width * 0.5);
		int start_yup = (int) (dimention.height * 0.8);

		int end_xup = (int) (dimention.width * 0.5);
		int end_yup = (int) (dimention.height * 0.6);
		touch.press(PointOption.point(start_xup, start_yup)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_xup, end_yup)).release().perform();
	}

	public void scrolldown1(AndroidDriver<MobileElement> driver) {
		dimention = driver.manage().window().getSize();
		int start_xup = (int) (dimention.width * 0.5);
		int start_yup = (int) (dimention.height * 0.8);

		int end_xup = (int) (dimention.width * 0.5);
		int end_yup = (int) (dimention.height * 0.2);
		touch.press(PointOption.point(start_xup, start_yup)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_xup, end_yup)).release().perform();
	}
	public void scrollup1(AndroidDriver<MobileElement> driver) {

		dimention = driver.manage().window().getSize();
		int start_xdown = (int) (dimention.width * 0.5);
		int start_ydown = (int) (dimention.height * 0.2);

		int end_xdown = (int) (dimention.width * 0.2);
		int end_ydown = (int) (dimention.height * 0.8);
		touch.press(PointOption.point(start_xdown, start_ydown))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_xdown, end_ydown)).release().perform();
	}


	public void scrollup(AndroidDriver<MobileElement> driver) {

		dimention = driver.manage().window().getSize();
		int start_xdown = (int) (dimention.width * 0.5);
		int start_ydown = (int) (dimention.height * 0.2);

		int end_xdown = (int) (dimention.width * 0.2);
		int end_ydown = (int) (dimention.height * 0.8);
		touch.press(PointOption.point(start_xdown, start_ydown))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
				.moveTo(PointOption.point(end_xdown, end_ydown)).release().perform();

	}
}

//		System.out.println("Phone no text field should be displayed");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//android.view.View[@content-desc='Verify Phone Number Please enter a Phone Number to continue']/android.widget.EditText")).sendKeys("8972328656");

//		for(int i=0;i<2;i++)
//		{
//			Thread.sleep(7000);
//	driver.swipe(335, 1135, 335, 111, 500);
//
//		}
//
//driver.findElement(By.xpath("//android.widget.Button[@content-desc='View all Campaigns']")).click();
//
//	System.out.println("Featured campaigns page should be displayed");
//	Thread.sleep(5000);
//	
//	
//	

//	
//public void scrollToElement(AndroidDriver<MobileElement> driver,String an,String av)
//{
//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSellectable()).scrollIntoView("+an+"(\""+av+"\"))");
//	
//}
//	}
//		
//		//driver.findElement(By.xpath("//android.widget.Button[@content-desc='Book A Seva']")).click();
