package Pages.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.sun.jdi.connect.spi.Connection;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiGEtConnectionTest {
	@Test
	public void getConnection() throws MalformedURLException
	{
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
	cap.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
	
	URL url=new URL("http://localhost:4723/wd/hub");
	
	AndroidDriver driver=new AndroidDriver(url,cap);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	io.appium.java_client.android.Connection connect = driver.getConnection();
	driver.setConnection(connect.AIRPLANE);

	//driver.setConnection(connect.DATA);
//	driver.setConnection(connect.WIFI);
	
	}
	

}
