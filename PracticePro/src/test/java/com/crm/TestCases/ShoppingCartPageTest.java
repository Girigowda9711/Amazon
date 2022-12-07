package com.crm.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseTest.BaseClass;
import com.crm.Pages.HomePage;
import com.crm.Pages.IndexPage;
import com.crm.Pages.LoginPage;
import com.crm.Pages.SearchPage;
import com.crm.Pages.ShoppingCartPage;



public class ShoppingCartPageTest extends BaseClass {
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	SearchPage searchpage;
	ShoppingCartPage shoppingcartpage;
	
	
	public ShoppingCartPageTest() {
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
		}
	@Test
	public void TestSuccesfullyProductBook() {
		indexpage.indextologinClick();
		loginpage.emailfieldpass(prop.getProperty("username"),prop.getProperty("password"));
		homepage.macproductsearch();
		searchpage.clickonAddToCart();
		shoppingcartpage.verifyproductBooked();
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
