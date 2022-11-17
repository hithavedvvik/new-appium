package com.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GeneralLoginPage {
//	//    @AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
//	private MobileElement countrydd;
//  @AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
//  private MobileElement nametf;
//  @AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
//  private MobileElement malerbtn;
//  @AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
//  private MobileElement femalerbtn;
//  @AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
//  private MobileElement letsbtn;
//  
  @FindBy(id="com.androidsample.generalstore:id/spinnerCountry")
 	private WebElement countrydd;
     @FindBy(id="com.androidsample.generalstore:id/nameField")
     private WebElement nametf;
     @FindBy(id="com.androidsample.generalstore:id/radioMale")
     private WebElement malerbtn;
     @FindBy(id="com.androidsample.generalstore:id/radioFemale")
     private WebElement femalerbtn;
     @FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
     private WebElement letsbtn;
	

	public WebElement getCountrydd() {
		return countrydd;
	}

	public WebElement getNametf() {
		return nametf;
	}

	public WebElement getMalerbtn() {
		return malerbtn;
	}

	public WebElement getFemalerbtn() {
		return femalerbtn;
	}

	public WebElement getLetsbtn() {
		return letsbtn;
	}

	//    public LoginGenral(AndroidDriver driver) {
//  	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//  }
  public GeneralLoginPage (WebDriver driver) {
  	//this.driver= driver;
  	PageFactory.initElements(driver, this);
  }
	 
  public void login() {
  	nametf.sendKeys("ker");
  	femalerbtn.click();
  	letsbtn.click();
  }
  public void login(String name) {
  	nametf.sendKeys(name);
  	letsbtn.click();
  }

}
