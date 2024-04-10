package org.sauce;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceoDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarayana\\eclipse-workspace\\Project3\\Brows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Pom log = new Pom(driver);
		Thread.sleep(3000);
		log.getUser().sendKeys("standard_user");
		Thread.sleep(3000);
		log.getPass().sendKeys("secret_sauce");
		Thread.sleep(3000);
		log.getLogin().click();
		Thread.sleep(3000);
		
		Pom2 select = new Pom2(driver);
		select.getBag().click();
		Thread.sleep(3000);
		JavascriptExecutor ds = (JavascriptExecutor) driver;
		ds.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		select.getJack().click();
		ds.executeScript("window.scrollBy(0,500)");
		select.getOrang().click();
		Thread.sleep(3000);
		ds.executeScript("window.scrollBy(0,-2000)");
		select.getCart().click();
		Thread.sleep(3000);
		ds.executeScript("window.scrollBy(0,500)");
		select.getCheck().click();
		Thread.sleep(3000);
		
		Pom3 det = new Pom3(driver);
		det.getFname().sendKeys("Saranya");
		Thread.sleep(2000);
		det.getLname().sendKeys("Vaidhyanathan");
		Thread.sleep(2000);
		det.getZpin().sendKeys("600005");
		Thread.sleep(2000);
		ds.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
        det.getCont().click();
        Thread.sleep(2000);
        det.getFin().click();
        Thread.sleep(2000);
        det.getBack().click();
        Thread.sleep(2000);
        
        driver.quit();

		
	}
}
