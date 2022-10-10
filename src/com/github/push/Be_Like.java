package com.github.push;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Be_Like {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\eclipse-workspace\\GitHub_Push\\Drive\\chromedriver.exe");	
			
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://phptravels.org/login");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
			username.sendKeys("instrkk546@gmail.com");
			
			WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
			password.sendKeys("Marga@56");
			
			WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
			login.click();
			
			Thread.sleep(5000);
			
			//driver.close();

}
