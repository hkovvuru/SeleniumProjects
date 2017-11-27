import com.composemail.ComposeMail;
	import com.phpTravelsLogin.LoginDetails;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestLogin {
	static WebDriver driver;
	 static By loginUserName = By.id("login-username");
	 static By loginPassword = By.id("login-passwd");
	 static By clickNextButton = By.id("login-signin");
	static By clickOnHussain = By.xpath("//*[contains(text(),'Hussain')]");
	static By clickOnSighOut = By.xpath("//a[@id='uh-signout'][contains(text(),'Sign Out')]");

		
		@Test
		public void driverSetUp() throws Exception{
		System.out.println("Hussain Browser started");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Softwares & Jars\\chromedriver.exe");
		driver=new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		System.out.println("Working successfully");
		Thread.sleep(3000);
		
		
		File file = new File("C:\\Users\\hkovvuru\\workspace\\SeleniumProject\\SentMailID");
		  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		 driver.findElement(loginUserName).click();
		// String inputValue = JOptionPane.showInputDialog("Please Enter The UserMail ID");
		 driver.findElement(loginUserName).sendKeys(prop.getProperty("username"));
			driver.findElement(clickNextButton).click();
			Thread.sleep(3000);
			WebElement ele=driver.findElement(loginPassword);
			ele.sendKeys(prop.getProperty("Password"));
			driver.findElement(clickNextButton).click();
		driver.findElement(clickOnHussain).click();
		Thread.sleep(2000);
		Actions builder=new Actions(driver);
		WebElement SignOutButton = driver.findElement(clickOnSighOut);
		builder.moveToElement(SignOutButton).build().perform();
		Thread.sleep(2000);
		driver.close();		
		//driver.findElement(clickOnSighOut).click();
		//driver.findElement(clickOnHussain).sendKeys(Keys.F5);
		
		
		
		}
	}

