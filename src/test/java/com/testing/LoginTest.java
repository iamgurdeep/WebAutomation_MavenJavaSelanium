package com.testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objects.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage loginpage;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		loginpage = new LoginPage(driver);
		loginpage.getChromeSession();
		
	}
	
	@Test
	public void loginTest() {
		loginpage.login("siddharth.mewada@wealthy.in", "Sid@wealthy");
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
