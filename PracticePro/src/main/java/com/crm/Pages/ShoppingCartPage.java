package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.BaseTest.BaseClass;
import com.crm.Utility.TestUtil;

public class ShoppingCartPage extends BaseClass {
	@FindBy(xpath="//a[text()='Use Coupon Code ']")private WebElement usecoupanScroll;
	@FindBy(xpath="//a[text()='Estimate Shipping & Taxes ']")private WebElement estimatedropclick;
	@FindBy(xpath="//select[@id='input-country']")private WebElement countrydropdown;
	@FindBy(id="input-zone")private WebElement statedropdown;
	@FindBy(id="input-postcode")private WebElement postcodefield;
	@FindBy(id="button-quote")private WebElement Getquotes;
	@FindBy(xpath="//input[@name='shipping_method']")private WebElement flatcheckBox;
	@FindBy(xpath="//input[@id='button-shipping']")private WebElement Applyingshopingbtn;
	
	public ShoppingCartPage() {
		PageFactory.initElements(driver,this);
	}
	public SuccessMessage verifyproductBooked() {
		TestUtil.scrollIntoView(usecoupanScroll);
		TestUtil.click(estimatedropclick);
		
	TestUtil.selectByIndex(countrydropdown,106);
		TestUtil.selectByVisibleText(statedropdown,"Karnataka");
		TestUtil.sendkeys(postcodefield,"560058");
		TestUtil.click(Getquotes);
		TestUtil.click(flatcheckBox);
		TestUtil.click(Applyingshopingbtn);
		System.out.println("product is successfully added to cart");
		return new SuccessMessage();
		
		}
	
	
	

}
