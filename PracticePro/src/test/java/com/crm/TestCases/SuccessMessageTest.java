package com.crm.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.crm.BaseTest.BaseClass;
import com.crm.Pages.HomePage;
import com.crm.Pages.IndexPage;
import com.crm.Pages.LoginPage;
import com.crm.Pages.SearchPage;
import com.crm.Pages.ShoppingCartPage;
import com.crm.Pages.SuccessMessage;





public class SuccessMessageTest extends BaseClass {
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	SearchPage searchpage;
	ShoppingCartPage shoppingcartpage;
	SuccessMessage successmessage;
	
	public SuccessMessageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		intilization();
		 indexpage=new IndexPage();
		 loginpage=new LoginPage();
		 homepage=new HomePage();
		 searchpage=new SearchPage();
		 shoppingcartpage=new ShoppingCartPage();
		  successmessage=new SuccessMessage();
		}
	@Test
	public void validatesuccesMessage() {
		indexpage.indextologinClick();
		loginpage.emailfieldpass(prop.getProperty("username"),prop.getProperty("password"));
		homepage.macproductsearch();
		searchpage.clickonAddToCart();
		
		shoppingcartpage.verifyproductBooked();
		successmessage.verifysuccessmessage();
		System.out.println("successfully booked message is verified ");
		
		
		
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
