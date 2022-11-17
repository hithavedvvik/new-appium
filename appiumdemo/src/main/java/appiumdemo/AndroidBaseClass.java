package appiumdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AndroidBaseClass  {
	public AndroidDriver driver;
public	AppiumDriverLocalService service;
public MobilePropertyFile mobilePropertyFile;
public MobileUtility mobileUtility;
public JavaUtility javaUtility;
//	@BeforeSuite
//	public void databaseSetup() {
//		System.out.println("open database");
//	}
	
	@BeforeClass
	public void startServerSetup()
	{
		 service= AppiumDriverLocalService.buildDefaultService();
		service.start();
		 mobilePropertyFile = new MobilePropertyFile();
		 mobileUtility = new MobileUtility();
		 javaUtility = new JavaUtility();
		//mobileExcelUtility= new MobileExcelUtility();
		mobilePropertyFile.intializePropetiesFile(IpathConstant.MOBILEPROPERTIYFILE);
		//mobileExcelUtility.initializeExcelFile(IpathConstant.MOBILEEXCELFILE);
		Url = mobilePropertyFile.getDataFromProperty("url");
		platformName = mobilePropertyFile.getDataFromProperty("PLATFORM_NAME");
		platformVersion = mobilePropertyFile.getDataFromProperty("PLATFORM_VERSIONReal");
		//udid = mobilePropertyFile.getDataFromProperty("UDIDDevice");
		timeout = mobilePropertyFile.getDataFromProperty("Timeouts");
		time = javaUtility.convertStringToLong(timeout);
	}
	@BeforeMethod
	public void launchAppSetup() throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); 
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.2 N2G47H");
		cap.setCapability(MobileCapabilityType.UDID,"55ca65127d93");
		
	
		cap.setCapability("appPackage","com.devaseva.app");
		cap.setCapability("appActivity", ".MainActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,cap);
		System.out.println("launch app");
	}
	@AfterMethod
	public void closeAppTearDown()
	{
		driver.closeApp();
		System.out.println("close app");
	}
	@AfterClass
	public void stopServerTearDown() {
		service.stop();
		System.out.println("close server");
	}
	@AfterSuite
	public void databaseTearDown() {
		System.out.println("close database");
	}

}
