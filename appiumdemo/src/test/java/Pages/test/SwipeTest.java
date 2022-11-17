package Pages.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeTest {
	@Test
	public void seipeTest() throws MalformedURLException
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		cap.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
		cap.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");//these two lines can be used below
		cap.setCapability("appActivity",".TouchScreenTestActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement>driver=new AndroidDriver<WebElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Dimension dimention = driver.manage().window().getSize();
		int width = dimention.getWidth();
		int height = dimention.getHeight();
		//verticall
		driver.swipe(width/2,(int)( height*0.25), width/2, (int)( height*0.25),500);
		driver.swipe((int)(width*0.1),(int) (height*0.2),(int)( width*0.1),(int)( height*0.8), 500);
		
		driver.swipe((int)(width*0.5),(int) (height*0.2),(int)( width*0.5),(int)( height*0.8), 500);
		driver.swipe((int)(width*0.9),(int) (height*0.2),(int)( width*0.9),(int)( height*0.8), 500);
		
		driver.swipe((int)(width*0.25),( height/2), (int)(width*0.80),( height/2),500);
driver.swipe((int)(width*0.1),(int) (height*0.8),(int)( width*0.9),(int)( height*0.8), 500);
driver.swipe((int)(width*0.1),(int) (height*0.2),(int)( width*0.9),(int)( height*0.2), 500);
driver.swipe((int)(width*0.1),(int) (height*0.5),(int)( width*0.9),(int)( height*0.5), 500);



		
		
		
	}

}
