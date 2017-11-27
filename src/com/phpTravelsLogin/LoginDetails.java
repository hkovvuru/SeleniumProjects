package com.phpTravelsLogin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDetails {
	
		static WebDriver driver;
		 static By loginUserName = By.id("login-username");
		 static By loginPassword = By.id("login-passwd");
		 static By clickNextButton = By.id("login-signin");
		private static CharSequence password;
		
		
		public static void loginPageDetails(WebDriver driver) throws Exception{ 
			
			 
			 driver.findElement(loginUserName).click();
			 String inputValue = JOptionPane.showInputDialog("Please Enter The UserMail ID");
			 driver.findElement(loginUserName).sendKeys(inputValue);
				driver.findElement(clickNextButton).click();
				Thread.sleep(3000);
				driver.findElement(loginPassword).click();
				
				/*JPanel panel = new JPanel();
				JLabel label = new JLabel("Enter a password:");
				JPasswordField pass = new JPasswordField(10);
				panel.add(label);
				panel.add(pass);
				String[] options = new String[]{"OK", "Cancel"};
				int option = JOptionPane.showOptionDialog(null, panel, "The title",
				                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
				                         null, options, options[1]);
				if(option == 0) // pressing OK button
				{
				    char[] password = pass.getPassword();
				    //System.out.println("Your password is: " + new String(password));
				}
				
				driver.findElement(loginPassword).sendKeys(password);*/
				
			
				
				JPasswordField pf = new JPasswordField();
				int okCxl = JOptionPane.showConfirmDialog(null, pf, "Enter Password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

				if (okCxl == JOptionPane.OK_OPTION) {
				  String password = new String(pf.getPassword());
				 // System.out.println("You entered: " + password);// if u want see password in the console
				
				  driver.findElement(loginPassword).sendKeys(password);
				}
			
				//String inputPasswordValue = JOptionPane.showInputDialog("Please Enter The User Password");
				//driver.findElement(loginPassword).sendKeys(inputPasswordValue);
				
				/*	WebElement ele =driver.findElement(By.id("login-passwd"));
				ele.sendKeys("hussen@123");*/
				
				driver.findElement(clickNextButton).click();
				System.out.println("Successfully Completed Login Page");
				//driver.quit();
			
		}
}
