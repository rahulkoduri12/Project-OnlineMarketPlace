package com.omp.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
	
	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className="product")
	List<WebElement> productList;
	
	@FindBy(xpath="/html/body/app-root/div/app-products/section/div[3]/app-searchfilter/div/form/div[1]/input")
	WebElement searchProductName;
	
	@FindBy(xpath="/html/body/app-root/div/app-products/section/div[3]/app-searchfilter/div/form/div[2]/input")
	WebElement searchProductRating;
	
	@FindBy(xpath="/html/body/app-root/div/app-products/section/div[3]/app-searchfilter/div/form/div[3]/input")
	WebElement searchProductSubscriptions;
	
	@FindBy(xpath="/html/body/app-root/div/app-products/section/div[3]/app-searchfilter/div/form/button")
	WebElement submit;
	
	public int getCountOfProduct() {
		return productList.size();
	}
	
	public void clickProduct(int index) {
		productList.get(index).click();
	}
	
	public String getProductName(int index) {
		return productList.get(index).findElement(By.xpath("//*[@class=\"productdescription\"]/text()[1]")).getText();
	}
	
	public String getProductSubscribes(int index) {
		return productList.get(index).findElement(By.xpath("//*[@class=\"productdescription\"]/text()[2]")).getText();
	}
	
	public String getProductRating(int index) {
		return productList.get(index).findElement(By.xpath("//*[@class=\"productdescription\"]/text()[3]")).getText();
	}
	
	public void setSearchProductByName(String productName) {
		searchProductName.clear();
		searchProductName.sendKeys(productName);
	}
	
	public void setSearchProductByRating(String productRating) {
		searchProductRating.clear();
		searchProductRating.sendKeys(productRating);
	}
	
	public void setSearchProductBySubscriptions(String productSubscriptions) {
		searchProductSubscriptions.clear();
		searchProductSubscriptions.sendKeys(productSubscriptions);
	}
	
	public void clickSearchButton() {
		submit.click();
	}
}
