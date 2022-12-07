package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.BaseTest.BaseClass;

public class SuccessMessage extends BaseClass{
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement
	succesfullMessageVerify;
	public SuccessMessage() {
		PageFactory.initElements(driver,this);
	}
	public boolean verifysuccessmessage() {
		return succesfullMessageVerify.isDisplayed();
		
		
		
	}
	

}
