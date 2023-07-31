package com.locators;

import org.openqa.selenium.By;

public interface LoginLocators {
	
	By LoginLink= By.linkText("Login via email/username");
	By Email= By.id("id_email");
	By Psssword= By.id("id_password");
	By Captcha= By.xpath("//*[@title='reCAPTCHA']");
	By CaptchaAnch= By.id("recaptcha-anchor");
	By LoginBTN= By.className("login-btn");

}

