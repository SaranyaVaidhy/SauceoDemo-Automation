package org.sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends SauceoDemo {
		public WebDriver driver;
		@FindBy(xpath="//input[@type='text']")
		private WebElement user;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement pass;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement login;

		public Pom(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver2, this);
		}

		public WebElement getUser() {
			return user;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getLogin() {
			return login;
		}

	

}
