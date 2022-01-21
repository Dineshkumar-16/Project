package com.Mvn_Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseA {
	public static WebDriver driver;
	//Browser Launch
	public static WebDriver browserlaunch(String name) {
		if (name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
//						System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();		
		}
		else if (name.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user+dir")+"\\Driver\\geckodriver.exe");
//			driver = new GeckoDriver();
			driver.manage().window().maximize();
			}
	return driver;
		}
	//Url
	public static void geturl(String url) {
		driver.get(url);
		}
	//sendKeys
	public static void sendkeys(WebElement element, String keys) {
		element.sendKeys(keys);	
	}
	//Click
	public static void click(WebElement sigin) {
		sigin.click();
	}
	
//	public static void findelements(String link ,String path) {
//		driver.findElement(By.link(path));
//		
//	}
	public static void scroll(String scrl) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scrl);
	}
	
	
	
	
	
	
	
}
