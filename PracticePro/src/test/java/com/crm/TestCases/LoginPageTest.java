package com.crm.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseTest.BaseClass;
import com.crm.Pages.IndexPage;
import com.crm.Pages.LoginPage;




public class LoginPageTest extends BaseClass {
	IndexPage indexpage;
	LoginPage loginpage;
	public  LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		intilization();
		indexpage=new IndexPage();
		loginpage=new LoginPage(); 

	}
	@Test(priority=0)
	public void logintest() {
		indexpage.indextologinClick();
		loginpage.emailfieldpass(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test(priority=1)
	public void logintitleTest() {
		indexpage.indextologinClick();
		//loginpage.emailfieldpass(prop.getProperty("username"),prop.getProperty("password"));
		loginpage.titleverify();

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
