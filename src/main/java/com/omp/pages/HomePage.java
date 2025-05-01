package com.omp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='top-subscribed-container']/div[1]")
	WebElement product1;
	
	public void clickProduct() {
		product1.click();
	}
}