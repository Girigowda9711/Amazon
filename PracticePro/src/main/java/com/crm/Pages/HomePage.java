package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.BaseTest.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//input[@class='form-control input-lg']")private
	WebElement searchfield;
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")private
	WebElement searchsubmit;
	@FindBy(xpath="//a[text()='Desktops']")private
	WebElement desktoplink;
	@FindBy(xpath="//a[text()='Mac (1)']")private
	WebElement maclink;
	@FindBy(xpath="//h1[text()='Search - MacBook']")private 
	WebElement macbooksearchtest;
	@FindBy(xpath="//h2[text()='Mac']")private
	WebElement mactests;
	public HomePage() {
		PageFactory.initElements(driver,this);
		
	}
	public SearchPage dataonsearch(String pass) {
		searchfield.sendKeys(pass);
		searchsubmit.click();
		return new SearchPage();
		}
	public SearchPage macproductsearch() {
		Actions act=new Actions(driver);
		act.moveToElement(desktoplink).build().perform();
		maclink.click();
		return new SearchPage();
		
		
	}
	
	public boolean macdisplay() {
		return mactests.isDisplayed();
	}
	
	
	
	

}
