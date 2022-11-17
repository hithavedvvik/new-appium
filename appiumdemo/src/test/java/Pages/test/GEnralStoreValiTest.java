package Pages.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GEnralStoreValiTest {
	@Test
	public void validationTest() throws MalformedURLException {
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.2 N2G47H");
	dc.setCapability(MobileCapabilityType.UDID, "55ca65127d93");
	dc.setCapability("appPackage", "com.androidsample.generalstore");
	dc.setCapability("appActivity", ".SplashActivity");
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("gayatri");
	driver.hideKeyboard();
	driver.findElement(By.id("c")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
	driver.findElement(By.xpath("(//android.widget.TextView[@text='ADD TO CART'])[last()]")).click();
	driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']")).click();
	String totalPurchageAmt = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/totalAmountLbl']")).getText();
	String expAmt="$280";
	SoftAssert s=new SoftAssert();
	s.assertEquals(expAmt, totalPurchageAmt);
	System.out.println(totalPurchageAmt);
	
	driver.findElement(By.xpath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']")).click();
	driver.findElement(By.xpath("//android.widget.Button[@text='Visit to the website to complete purchase']")).click();
}

}
