package com.Mvn_Proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Log_In {
	private WebDriver driver;
	@FindBy(id="email")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
		}
	
	public Log_In(WebDriver driver) {
		this.driver= driver;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
