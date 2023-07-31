package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objects.FixedDepositePage;
import com.objects.LoginPage;

public class FDProposalCreationTest {
	WebDriver driver;
	LoginPage loginpage;
	FixedDepositePage fdpage;

	@BeforeMethod
	public void setup() {
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("debuggerAddress", "localhost:9022");
		driver = new ChromeDriver(option);
		loginpage = new LoginPage(driver);
		fdpage = new FixedDepositePage(driver);
		loginpage.getChromeSession();
	}
	
	@Test
	public void fdProposalCreation() {
//		loginpage.login("siddharth.mewada@wealthy.in", "Sid@wealthy");
		fdpage.fdRateCalculator();
		fdpage.fdCreateProposal();
		
	}
	
//	@AfterMethod
//	public void teardown() {
//		driver.close();
//	}
}
