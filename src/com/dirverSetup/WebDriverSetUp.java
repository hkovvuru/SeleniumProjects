package com.dirverSetup;
import com.composemail.ComposeMail;
import com.phpTravelsLogin.LoginDetails;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WebDriverSetUp {
	
	WebDriver driver;
	
public void driverSetUp() throws Exception{
		System.out.println("Hussain Browser started");
	
		/*System.setProperty("webdriver.IE.driver","D:\\Selenium Softwares & Jars\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();*/
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Softwares & Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		
			//WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		System.out.println("Working successfully");
		
		LoginDetails.loginPageDetails(driver);
		Thread.sleep(5000);
		ComposeMail.composeMailToOthers(driver);
		//driver.quit();
		//driver.close();
	
	}
	
	
}
