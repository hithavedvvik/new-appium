package com.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdIntDocLoginPage {
	@FindBy(xpath="//android.widget.TextView[@text='Mobile number']")
	private WebElement mobilenumberCK;
	
	

	@FindBy(xpath="//android.widget.EditText[@text='Mobile number']")
	private WebElement entermobilenumberTB;
	
	@FindBy(xpath="//android.widget.Button[@text='Continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath="//android.widget.ImageView[@text='resource-id=com.practo.fabric:id/source_arrow']")
	private WebElement searchyourlocationcancelCK;
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
	private WebElement ambercentCK;
	

	@FindBy(xpath="//android.widget.TextView[@text='Payments & HealthCash']")
	private WebElement payementandHelthCashCK;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Redeem']")
	private WebElement redeemCK;

	@FindBy(xpath="//android.widget.Button[@text='Book Now']")
	private WebElement booknowCK;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Search for tests, scans and profiles']")
	private WebElement BloodTestScreensearchTB;
	
	


	public WebElement getMobilenumberCK() {
		return mobilenumberCK;
	}


	public WebElement getEntermobilenumberTB() {
		return entermobilenumberTB;
	}


	public WebElement getContinuebutton() {
		return continuebutton;
	}


	public WebElement getSearchyourlocationcancelCK() {
		return searchyourlocationcancelCK;
	}


	public WebElement getAmbercentCK() {
		return ambercentCK;
	}


	public WebElement getPayementandHelthCashCK() {
		return payementandHelthCashCK;
	}


	public WebElement getRedeemCK() {
		return redeemCK;
	}


	public WebElement getBooknowCK() {
		return booknowCK;
	}


	public WebElement getBloodTestScreensearchTB() {
		return BloodTestScreensearchTB;
	}
	
	
	
	
	

	

}



//swipe 446 1024 2)437 326





