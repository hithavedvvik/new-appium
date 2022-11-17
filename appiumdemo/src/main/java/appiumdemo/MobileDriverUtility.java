package appiumdemo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class MobileDriverUtility {
	public DesiredCapabilities capability;
	public AndroidDriver driver;
	public Connection connection;
	public AppiumDriverLocalService service;
	public AppiumDriverLocalService service1;
	public Dimension dimention;
	public TouchAction touchaction;
	public URL url;


	public AppiumDriverLocalService startserverByDefaultLocalService() 
	{
		return service= AppiumDriverLocalService.buildDefaultService();
	}

	public AppiumDriverLocalService  startServerByCustomisedBuildServer(int defaultport,String projectfilepath) 
	{
		return service1= AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE).usingPort(defaultport)
				.withLogFile(new File(projectfilepath)));
	}
	public void startserviceByDefaultLocalService(AppiumDriverLocalService service) 
	{
		service.start();
	}
	public void startServiceByCustomisedBuildServer(AppiumDriverLocalService service1) 
	{
		service1.start();
	}
	public void stopserviceByDefaultLocalService(AppiumDriverLocalService service) 
	{
		service.stop();
	}
	public void stopServiceByCustomisedBuildServer(AppiumDriverLocalService service1) 
	{
		service1.stop();
	}
public DesiredCapabilities desiredCapabilities()
{
	return capability=new DesiredCapabilities();
}
	public URL url(String localhostServerUrl) throws MalformedURLException
	{
		return  url=new URL(localhostServerUrl);
	}
	
	public  AndroidDriver androidDriver(URL url,DesiredCapabilities capability)
	{
		driver=new AndroidDriver<WebElement>(url ,capability);
		return driver;
}
	
	public void setPlatformName(String platformname)
	{
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME,platformname); 
	}
	public void setPlatformVersion(String platformnamevertion)
	{
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformnamevertion);
	}
	public void setDevicUdid(String deviceID)
	{
		capability.setCapability(MobileCapabilityType.UDID,deviceID);
	}
	
	public boolean isAppInstalled(String apppackagename)
	{
		return driver.isAppInstalled( apppackagename);
	}
	public void installApp(String apppath)
	{
		driver.installApp(apppath);
		driver.launchApp();
	}
	public void appPackage(String CapabilityName ,String apppackagename)
	{
		capability.setCapability(CapabilityName,apppackagename);
	}
	
	public void appActivity(String CapabilityName ,String appactivityname)
	{
		capability.setCapability(CapabilityName,appactivityname);
	}

	public void installAppByCapabilities(String appPackage,String  appActivity ,String apppackagename,String appactivityname)
	{
		capability.setCapability(appPackage,apppackagename);
		capability.setCapability(appActivity,appactivityname);

	}
	public void installAppByCapabilities(String apkpath)
	{
		capability.setCapability(MobileCapabilityType.APP,apkpath);
	}

	public void uninstallByFullReset(DesiredCapabilities capability) 
	{
		capability.setCapability(MobileCapabilityType.FULL_RESET,"true"); //this statement or
	}
	public void activateApp(String apppackagename)
	{
		((MobileDriverUtility) driver).activateApp(apppackagename);
	}	
	public void terminateApp(String apppackagename)
	{
		MobileDriverUtility terminate = ((MobileDriverUtility) (driver).terminateApp(apppackagename);	
	}

	
	public void removeApp(String apppackagename)
	{
		driver.removeApp(apppackagename);//this statement can be usde
	}


	public void hideKeyboard() 
	{
		driver.hideKeyboard();
	}
	public Connection getConnectio()
	{
		connection = driver.getConnection();	
		return connection;
	}
	public void setConnectionAirplane() {
		driver.setConnection(connection.AIRPLANE);

	}
	public void setConnectionData() {
		driver.setConnection(connection.DATA);
	}
	public void setConnectionWiFi() {
		driver.setConnection(connection.WIFI);
	}

	public void pressKeyCodeCamera()
	{
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	}
	public void pressKeyCodeVolumeUp()
	{
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);

	}
	public void pressKeyCodeVolumeDown()
	{
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);

	}
	public void pressKeyCodeVolumeBack()
	{
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);

	}
	public void pressKEyCodeVolumeEnter()
	{
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);

	}	
	public void pressKeyCodeBrightnessUp()
	{
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);

	}
	public void pressKeyCodeBrightnessDown()
	{
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);

	}
	public void openNotificationPopup()
	{
		driver.openNotifications();
	}
	public void rotateLanddscape()
	{
		driver.rotate(ScreenOrientation.LANDSCAPE);
	}

	public void rotatePotrait() 
	{
		driver.rotate(ScreenOrientation.PORTRAIT);
	}
	
	public Dimension getDimention()
	{
		return  dimention = driver.manage().window().getSize();
	}
	public int getWidth() 
	{
		return dimention.getWidth();
	}
	
	public int getHeight() 
	{
		return dimention.getHeight();
	}
	
	public void swipevertically(int startXWidth,int endxWidth,int startYHeight,int endYHeight,int TimeDuration)
	{
		driver.swipe(startXWidth, startYHeight, endxWidth, endYHeight, TimeDuration);
	}
	
	
	//verticall
	//driver.swipe(width/2,(int)( height*0.25), width/2, (int)( height*0.25),500);
	public void navigaeTo(String url)
	{
		driver.navigate().to("https://www.facebook.com");
	}
	
	public void switchNativeApp(String nativePackageName) 
	{
		driver.context(nativePackageName);
	}
	public void switchWebAppApp(String Webviewpackagename) 
	{
		driver.context(Webviewpackagename);
	}
	public void zoomImg(WebElement element) 
	{
		driver.zoom(element);
	}
	public void pinchImg(WebElement element) 
	{
		driver.pinch(element);
	}
	public TouchAction initialiseTouchAction(AndroidDriver driver)
	{
		 return touchaction=new TouchAction(driver);
	}
	
	public void	dragAndDrop(WebElement srcelement,WebElement dstWebelement,int duration)
	{
		
		touchaction.longPress(srcelement).waitAction(duration).moveTo(dstWebelement).release().perform();
	}
	
	public void scrollToElement( AndroidDriver driver,String attributename,String attributevalue) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSellectable()).scrollIntoView("+attributename+"(\""+attributevalue+"\"))");

	}

}





















