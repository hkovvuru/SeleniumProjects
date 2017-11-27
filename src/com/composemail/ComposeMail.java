package com.composemail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComposeMail {
	
	static WebDriver driver; //*[@id="to_add_contacts"] 
	
	static By ClickOnMail	 = By.xpath("//span[contains(text(),'Mail')]");
	static By ClickOnCompose = By.xpath("//span[@class='icon-text']");
			// "//span[@id='Compose']/button/span[contains(text(),'Compose')]");
	//static By ClickOnTOField = By.xpath("//*[@id='to-field'][@name='to-field']");
	static By ClickOnToField = By.xpath("//*[@id='to-field'][@name='to-field'][@class='cm-to-field yui3-aclist-input smartrAutoSuggestInput'][@role='textbox']");
	static By ClickOnSubject = By.xpath("//*[@id='subject-field']");//[@name='subject-field1505722259513'][@class='cm-subject-field']");
	static By ClickOnMesgBody= By.xpath("//div[@id='rtetext'][@class='cm-rtetext undoreset fullSSL']"); 
	static By ClickOnSend    = By.xpath("//span[@class='btn default']");
	
	
	static By ClickOnToSearchtext = By.className("searchtext");
	static By checkBox= By.xpath("//*[@id='yui_3_16_0_ym19_1_1503309428193_4286']");
	static By doneButn =By.xpath("//*[@id='yui_3_16_0_ym19_1_1503309428193_4345']");
	
	
	public static void composeMailToOthers(WebDriver driver) throws Exception{
		System.out.println("Successfully Started Compose mail Page");
		Thread.sleep(3000);
		driver.findElement(ClickOnMail).click();
		Thread.sleep(5000);
		driver.findElement(ClickOnCompose).click();
		Thread.sleep(5000);
		driver.findElement(ClickOnToField).click();
		
	/*	
		driver.findElement(ClickOnToSearchtext).sendKeys("vinhus212@gmail.com");
		driver.findElement(checkBox).click();
		driver.findElement(doneButn).click();
		*/
		driver.findElement(ClickOnToField).sendKeys("kovvuruhussain@gmail.com");
		Thread.sleep(2000);
		driver.findElement(ClickOnSubject).sendKeys(Keys.TAB);;
		driver.findElement(ClickOnSubject).sendKeys("Test Mail");
		Thread.sleep(2000);
		driver.findElement(ClickOnMesgBody).click();
		driver.findElement(ClickOnMesgBody).sendKeys("Hi Hussain "
				+ "First Test mail is successful");
		Thread.sleep(2000);
		driver.findElement(ClickOnSend).click();
		Thread.sleep(2000);
		System.out.println("Mail Delivered Successfully");
		driver.close();
	}
	
}
