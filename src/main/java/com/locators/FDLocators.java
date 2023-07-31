package com.locators;
import org.openqa.selenium.By;

public interface FDLocators {
	
	By ExploreStore= By.className("store-link");
	By FixedDeposites= By.linkText("Fixed Deposits");
	By TenureEdit= By.cssSelector("img[alt='Edit']");
	By TenurePeriod= By.xpath("//input[@max='60']");
	By Gender= By.xpath("//img[@alt='Female']");
	By SeniorCitizen= By.xpath("//div[contains(text(),'Yes')]");
	By Provider=By.xpath("//label[@for='ShriramFD']");  //PNBHousing,ShriramFD,BajajFD,ICICIHousing
	By ContinueBTN= By.xpath("//div[@class='ws-continue-button']");
	//Following Locators are to create Proposal Pages
	By DepositAmount= By.name("deposit_amount");
	By PayoutFeqField= By.xpath("//div[contains(@class,'native-select-interest_payout_frequency')]");
	By SelectPayoutFeq= By.xpath("//li[text() = 'Annual']");
	By TenureYearsField= By.xpath("//div[contains(@class,'native-select-tenure_years')]");
	By SelectTenureYears= By.xpath("//li[text() = '4']");
	By TenureMonthsField= By.xpath("//div[contains(@class,'native-select-tenure_months')]");
	By SelectTenureMonths= By.xpath("//li[text() = '6']");
	By GenderF= By.xpath("//button[@value='Female']");
	By GenderM= By.xpath("//button[@value='Male']");
	By SCYes= By.xpath("//button[contains(text(),'Yes')]");
	By SCNo= By.xpath("//button[contains(text(),'No')]");
	By ConfirmBTN= By.xpath("//button[contains(text(),'Confirm')]");
	By CreateProposalLink= By.xpath("//span[.='Create Proposal']");
	By SelectClientBTN= By.xpath("//button[text()='Select Client']");
	By ChooseClient= By.xpath("//span[contains(text(),'Test try')]");
	By ShareDirectlyBTN= By.xpath("//button[text()='Share Directly']");
	By SucessHeader = By.xpath("//h1[contains(text(),'Proposal Link Shared With Client')]");

}
