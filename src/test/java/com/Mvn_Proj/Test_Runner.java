package com.Mvn_Proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Test_Runner extends BaseA {
	public static void main(String[] args) {
		
		browserlaunch("Chrome");
		geturl("http://automationpractice.com/index.php");
		
		WebElement element = driver.findElement(By.xpath("//a[@class='login']"));
		click(element);
		
		WebElement email = driver.findElement(By.id("email"));
		sendkeys(email,"dineshkumar16.r@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		sendkeys(pass,"Dap3ever$");
		WebElement button = driver.findElement(By.id("SubmitLogin"));
		click(button);
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		click(tshirt);
		WebElement img = driver.findElement(By.xpath("//a[@class='quick-view']"));
		
//		Actions r = (Actions) driver;
//		r.moveToElement(img).build().perform();
//		r.click();
//		WebElement view = driver.findElement(By.xpath("//a[@class='quick-view']"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
