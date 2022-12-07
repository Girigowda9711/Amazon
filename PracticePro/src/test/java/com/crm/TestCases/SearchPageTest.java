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





public class SearchPageTest extends BaseClass {
	SearchPage searchpage;
	IndexPage indexpage;
	 LoginPage loginpage;
	 HomePage homepage;
	public SearchPageTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() {
		intilization();
		 searchpage=new SearchPage();
		 indexpage=new IndexPage();
		 loginpage=new LoginPage();
	     homepage=new HomePage();
		}
	@Test(priority=0)
	public void searchtitletest() {
		indexpage.indextologinClick();
		loginpage.emailfieldpass(prop.getProperty("username"),prop.getProperty("password"));
		homepage. macproductsearch();
		driver.getTitle();
	
		System.out.println("Mac title is successfully verified");
		
	}
	@Test(priority=1)
	public void titleverifyTEST() {
		indexpage.indextologinClick();
		loginpage.emailfieldpass(prop.getProperty("username"),prop.getProperty("password"));
		homepage. macproductsearch();
		 homepage.macdisplay();
		
		System.out.println("Mac content is succesfully displaying in searchpage");
		}
	@Test(priority=2)
	public void AddproductToCartTest() {
		indexpage.indextologinClick();
		loginpage.emailfieldpass(prop.getProperty("username"),prop.getProperty("password"));
		homepage. macproductsearch();
		 searchpage.clickonAddToCart();
		 System.out.println("product is succesfully added to cart");
		}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
