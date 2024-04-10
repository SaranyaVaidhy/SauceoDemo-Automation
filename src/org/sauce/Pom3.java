package org.sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3 {
	public WebDriver driver;
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement fname;
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lname;
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement zpin;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement cont;
	@FindBy(xpath="//button[@id='finish']")
	private WebElement fin;
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement back;
	public WebElement getBack() {
		return back;
	}
	public WebElement getFin() {
		return fin;
	}
	public WebElement getCont() {
		return cont;
	}
	public Pom3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getZpin() {
		return zpin;
	}

}
