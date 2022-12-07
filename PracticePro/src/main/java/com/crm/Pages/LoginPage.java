package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.BaseTest.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy(id="input-email")private WebElement emailfield;
	@FindBy(id="input-password")private WebElement passwordfield;
	@FindBy(xpath="//input[@class='btn btn-primary']")private WebElement loginbtn;
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	public HomePage emailfieldpass(String usname,String pwd) {
		emailfield.sendKeys(usname);
		passwordfield.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
		}
	public String titleverify() {
		
		return driver.getTitle();
		
	}
	
	
	

}
