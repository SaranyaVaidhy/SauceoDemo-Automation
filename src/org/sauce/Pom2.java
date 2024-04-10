package org.sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	public WebDriver driver;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bag;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement jack;
	
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement orang;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cart;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement check;


	public Pom2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getBag() {
		return bag;
	}

	public WebElement getJack() {
		return jack;
	}

	public WebElement getOrang() {
		return orang;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getCart() {
		return cart;
	}
}
