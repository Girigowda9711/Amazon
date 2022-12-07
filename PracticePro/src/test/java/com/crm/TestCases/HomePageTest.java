package com.crm.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.BaseTest.BaseClass;
import com.crm.Pages.HomePage;
import com.crm.Pages.IndexPage;
import com.crm.Pages.LoginPage;

public class HomePageTest extends BaseClass {
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intilization();
		indexpage=new IndexPage();
		loginpage=new LoginPage(); 
		homepage=new HomePage();


	}
	@Test(groups= {"smoke testing"})
	public void HomepageverifyTest() {
		indexpage.indextologinClick();
		loginpage.emailfieldpass(prop.getProperty("username"),prop.getProperty("password"));
		homepage.dataonsearch("mac");
		homepage.macproductsearch();
		boolean macpro = homepage.macdisplay();
		Assert.assertTrue(macpro);
		System.out.println("product is successfully displayed");



	}






	@AfterMethod
	public void tearDown() {
		driver.quit();
	}








}
