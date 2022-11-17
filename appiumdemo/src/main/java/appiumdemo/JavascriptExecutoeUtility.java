package appiumdemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutoeUtility {
	public void flashElementBackground(WebDriver driver,WebElement element)
	{
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
		String bgcolour = element.getCssValue("backgroundcolour");
		for (int i=0;i<bgcolour.length();i++)
		{
			changeColor("#000000",element,driver);
		}
	}

}
