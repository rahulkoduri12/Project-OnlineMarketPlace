package com.omp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage{
	
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"product-details\"]/div[1]/div[1]/h3")
	WebElement productName;
	
	@FindBy(xpath="//*[@id=\"product-details\"]/div[2]/ul/li/i")
	WebElement productDescription;
	
	@FindBy(xpath="//*[@id=\"product-meta\"]/text()[2]")
	WebElement productSubscribes;
	
	@FindBy(xpath="//*[@id=\"product-meta\"]/text()[3]")
	WebElement productRatings;
	
	@FindBy(className="subscribe-btn")
	WebElement subscribeButton;
	
	@FindBy(className="review-btn")
	WebElement reviewButton;
	
	public String getProductName() {
		return productName.getText();
	}
	
	public String getProductDescription() {
		return productDescription.getText();
	}
	
	public String getProductSubscribes() {
		return productSubscribes.getText();
	}
	
	public String getProductRatings() {
		return productRatings.getText();
	}
	
	public void clickSubscribeButton() {
		subscribeButton.click();
	}
	
	public void clickReviewButton() {
		reviewButton.click();
	}
}
