package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.UsersPage;

public class LoginTest extends TestBase {
	
	LoginPage lp=null;
	DashboardPage dp=null;
	UsersPage up=null;
	WebDriver driver=null;
	
	@BeforeSuite
	public void setup() {
		driver=initialization();
		lp=new LoginPage(driver);
	}
	
	@Test
	public void test01() {
		dp=lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test
	public void test02() {
		up=dp.clickUser();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
	}
	
	/*@Test 
	public void verifyTable()
	{
	up.printRows();	
	}*/

}
