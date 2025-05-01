package com.omp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="home")
	WebElement homeLink;
	
	@FindBy(id="products")
	WebElement productsLink;
	
	@FindBy(id="help")
	WebElement helpLink;
	
	@FindBy(id="signIn")
	WebElement signInLink;
	
	@FindBy(id="signUp")
	WebElement signUpLink;
	
	public void navigateToHome() {
		homeLink.click();
	}
	
	public void navigateToProducts() {
		productsLink.click();
	}
	
	public void navigateToHelp() {
		helpLink.click();
	}
	
	public void navigateToSignIn() {
		signInLink.click();
	}
	
	public void navigateToSignUp() {
		signUpLink.click();
	}
}
