package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.BaseTest.BaseClass;

public class IndexPage extends BaseClass {
	@FindBy(xpath="//span[text()='My Account']")private WebElement myaccount;
	@FindBy(xpath="//span[text()='Shopping Cart']")private WebElement shoppingcart;
	@FindBy(xpath="//a[text()='Login']")private WebElement loginlink;
	
	public IndexPage() {
		PageFactory.initElements(driver,this);
	}
	public boolean myaccounttest() {
	return	myaccount.isDisplayed();
		
	}
	public boolean shoppingcarttest() {
		return shoppingcart.isDisplayed();
		
	}
	public String cartTitleTest() {
		return driver.getTitle();
	}
	public LoginPage indextologinClick() {
		myaccount.click();
		loginlink.click();
		return new LoginPage();
		
	}
	
	
	
	
	

}
