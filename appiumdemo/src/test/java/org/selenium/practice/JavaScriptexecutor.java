package org.selenium.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptexecutor {
	public void flashElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String bgcolour = element.getCssValue("bacakgroundcolor");
	}

}
