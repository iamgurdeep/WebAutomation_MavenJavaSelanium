package com.objects;


import org.openqa.selenium.WebDriver;

import com.locators.FDLocators;
import com.resources.Utils;

public class FixedDepositePage extends Utils implements FDLocators {

	public FixedDepositePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void fdRateCalculator() {
		try {
			getElement(ExploreStore).click();
			getElement(FixedDeposites).click();
			getElement(TenureEdit).click();
			getElement(TenurePeriod).clear();
			getElement(TenurePeriod).sendKeys("24");
			getElement(Gender).click();
			getElement(SeniorCitizen).click();
			// getElement(Provider).click();
			getElement(ContinueBTN).click();

		} catch (Exception e) {
			System.out.println("Exception Caught : " + e.getMessage());
		}
	}

	public void fdCreateProposal() {
		try {
			Thread.sleep(5000);
			switchWindowTo("Fixed Deposit | Wealthy");
			Thread.sleep(5000);
			getElement(DepositAmount).click();
			getElement(DepositAmount).clear();
			getElement(DepositAmount).sendKeys("17000");
			getElement(PayoutFeqField).click();
			getElement(SelectPayoutFeq).click();
			getElement(TenureYearsField).click();
			getElement(SelectTenureYears).click();
			getElement(TenureMonthsField).click();
			getElement(SelectTenureMonths).click();
			getElement(GenderF).click();
			getElement(SCYes).click();
			getElement(ConfirmBTN).click();
			getElement(CreateProposalLink).click();
			getElement(SelectClientBTN).click();
			getElement(ChooseClient).click();
			getElement(ShareDirectlyBTN).click();
//			getElement(ChooseClient).click();
			driver.close();
			switchWindowTo("We Build Wealthy");
			getElement(ExploreStore).click();
	
		} catch (Exception e) {
			System.out.println("Exception Caught : " + e.getMessage());
		}
	}

}
