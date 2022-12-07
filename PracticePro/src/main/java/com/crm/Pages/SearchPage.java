package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.BaseTest.BaseClass;
import com.crm.Utility.TestUtil;

public class SearchPage extends BaseClass{
	@FindBy(xpath="//title[text()='Mac']")private WebElement MacTitle;
	@FindBy(xpath="//h2[text()='Mac']")private WebElement MacContentverify;
	@FindBy(xpath="//h5[text()='My Account']")private WebElement myaccountScroll;
	@FindBy(xpath="//span[text()='Add to Cart']")private WebElement addtocartbtn;
	@FindBy(xpath="//span[text()='Shopping Cart']")private WebElement shoppingcartclick;
	@FindBy(xpath="//title[text()='Shopping Cart']")private WebElement shoppingcarttitleverifyy;
	public SearchPage() {
		PageFactory.initElements(driver,this);
		
	}
	public String searchpageTitleTest() {
		return driver.getTitle();
	}
	public boolean maccontentverificationTest() {
		return MacContentverify.isDisplayed();
		
	}
	public ShoppingCartPage clickonAddToCart() {
		TestUtil.scrollIntoView(myaccountScroll);
		addtocartbtn.click();
		shoppingcartclick.click();
		return new ShoppingCartPage();
		}
	
	public String titleverifiedofShoppingcartPage() {
		return driver.getTitle();
	}
	
	
	
	
	

}
