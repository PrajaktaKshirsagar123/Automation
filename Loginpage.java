package com.demo.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {


	public class Lounchbrwsr 
	{
	public static void main(String args[]) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.actitime.com/pkshirsagar/login.do");
		Thread.sleep(4000);
		
		WebElement usn= driver.findElement(By.id("username"));
		usn.sendKeys("mailprkkshirsagar@gmail.com");
		Thread.sleep(4000);
		
		WebElement passwordTextField=driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys("Prajakta@123");
		Thread.sleep(4000);
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
	}
	}
}
