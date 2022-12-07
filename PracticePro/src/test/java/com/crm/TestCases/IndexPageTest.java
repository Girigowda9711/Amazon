package com.crm.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.BaseTest.BaseClass;
import com.crm.Pages.IndexPage;
import com.crm.Pages.LoginPage;


public class IndexPageTest extends BaseClass {


	IndexPage indexpage;
	LoginPage loginpage;
	
	
   public IndexPageTest() {
		super();
	}
 
 
	
	@BeforeMethod
	public void setUp() {
		
		intilization();
	 indexpage=new IndexPage();
		}
	@Test(groups = {"smoke testing","regression testing"})
	public void titleTest() {
		
		String title = indexpage.cartTitleTest();
		if(title.contains("Your Store")) {
		System.out.println("title is verified ");
			}
		else {
			System.out.println("title is not verified");
		}
		
		
		}
	@Test(groups= {"smoke testing"})
	public void shoppingclick() {
		 boolean flag = indexpage.shoppingcarttest();
		 Assert.assertTrue(flag);
		
		}
	@Test
	public void myaccountclik() {
		boolean account = indexpage.myaccounttest();
		Assert.assertTrue(account);
		}
	@Test
	public void Loignclick() {
		 indexpage.indextologinClick();

	}
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	

}
