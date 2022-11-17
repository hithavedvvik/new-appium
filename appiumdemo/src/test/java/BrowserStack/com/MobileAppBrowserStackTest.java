package BrowserStack.com;


	import java.net.URL;
	import java.util.List;
	import java.util.function.Function;
	import java.net.MalformedURLException;
	import io.appium.java_client.MobileBy;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
	public class MobileAppBrowserStackTest {
		
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
	    	DesiredCapabilities caps = new DesiredCapabilities();
	    	
	    	// Set your access credentials
	    	caps.setCapability("browserstack.user", "kavithabl_UG6NVx");
	    	caps.setCapability("browserstack.key", "WJsE7xy5d8TaSzAuq1fE");
	    	
	    	// Set URL of the application under test
	    	caps.setCapability("app", "bs://68a2254e322b0de2046dfd65830d33d24fe8e697");
	    	
	    	// Specify device and os_version for testing
	        caps.setCapability("device", "Google Pixel 3");
	        caps.setCapability("os_version", "9.0");
	        
	    	// Set other BrowserStack capabilities
	    	caps.setCapability("project", "First Java Project");
	    	caps.setCapability("build", "browserstack-build-1");
	    	caps.setCapability("name", "first_test");
	       
	    	
	    	// Initialise the remote Webdriver using BrowserStack remote URL
	    	// and desired capabilities defined above
	      
	        caps.setCapability("appPackage","io.appium.android.apis");//these two lines can be used below
			caps.setCapability("appActivity",".ApiDemos");
			//URL url=new URL("http://localhost:4723/wd/hub");
			  AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
		        		new URL("http://hub.browserstack.com/wd/hub"), caps);
			driver.findElementByAccessibilityId("Views").click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Controls']")).click();
			driver.tap(1, 133, 608, 500);
			driver.findElement(By.xpath("//android.widget.TextView[@text='1. Light Theme']")).click();
			driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("kavi");
			driver.findElement(By.xpath("//android.widget.CheckBox[@text='Checkbox 1']")).click();
			
			driver.findElement(By.xpath("//android.widget.CheckBox[@text='Checkbox 2']")).click();
			driver.findElement(By.xpath("//android.widget.RadioButton[@text='RadioButton 1']")).click();
			driver.findElement(By.xpath("//android.widget.RadioButton[@text='RadioButton 2']")).click();
			driver.findElement(By.xpath("//android.widget.CheckBox[@text='Star']")).click();
			driver.hideKeyboard();
			driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
			driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Venus']")).click();
			driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
//	         Test case for the BrowserStack sample Android app. 
//	         If you have uploaded your app, update the test case here. 
//	        AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//	            ExpectedConditions.elementToBeClickable(
//	            		MobileBy.AccessibilityId("Search Wikipedia")));
//	        searchElement.click();
//			AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//	             ExpectedConditions.elementToBeClickable(
//	            		 MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
//	        insertTextElement.sendKeys("BrowserStack");
//	        Thread.sleep(5000);
//	        List<AndroidElement> allProductsName = driver.findElementsByClassName(
//	        		"android.widget.TextView");
//	        assert(allProductsName.size() > 0);
//	        
	        
	        // Invoke driver.quit() after the test is done to indicate that the test is completed.
	        driver.quit();
			
		}
	}


