package com.objects;


import org.openqa.selenium.WebDriver;

import com.locators.LoginLocators;
import com.resources.Utils;

public class LoginPage extends Utils implements LoginLocators{
//		WebDriver driver;

		public LoginPage(WebDriver driver)  {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		public void login(String email,String password) {
			try {
				getElement(LoginLink).click();
				getElement(Email).clear();
				getElement(Email).sendKeys(email);
				getElement(Psssword).clear();
				getElement(Psssword).sendKeys(password);
				driver.switchTo().frame(getElement(Captcha));
				getElement(CaptchaAnch).click();
				driver.switchTo().defaultContent();
				Thread.sleep(10000);
				getElement(LoginBTN).click();
				
			}catch (Exception e) {
				System.out.println("Exception Caught : "+e.getMessage());
			}
			
		}
}
