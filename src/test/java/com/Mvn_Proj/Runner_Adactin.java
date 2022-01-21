
package com.Mvn_Proj;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Runner_Adactin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://adactinhotelapp.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Dineshkumar16");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Qwerty123");
		WebElement login = driver.findElement(By.id("login"));
		login.click();

		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByVisibleText("London");

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByIndex(2);

		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByIndex(2);

		WebElement room_no = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(room_no);
		s3.selectByIndex(1);

		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys("20/02/2022");

		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("22/02/2022");

		WebElement adults = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adults);
		s4.selectByValue("2");

		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(1);

		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

		WebElement radio_button = driver.findElement(By.xpath("//input[@type='radio']"));
		radio_button.click();

		WebElement contnu = driver.findElement(By.id("continue"));
		contnu.click();

		WebElement name1 = driver.findElement(By.id("first_name"));
		name1.sendKeys("Adam");

		WebElement name2 = driver.findElement(By.id("last_name"));
		name2.sendKeys("George");

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("72,Tamil Nadu, India");

		WebElement ccno = driver.findElement(By.id("cc_num"));
		ccno.sendKeys("6549873211591478");

		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cctype);
		s6.selectByIndex(2);

		WebElement ccexpmon = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(ccexpmon);
		s7.selectByIndex(11);

		WebElement ccexpyr = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(ccexpyr);
		s8.selectByValue("2022");

		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("014");

		WebElement booknw = driver.findElement(By.id("book_now"));
		booknw.click();

		WebElement check = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		check.click();
		
		WebElement check_box = driver.findElement(By.id("radiobutton_0"));
		check_box.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File start = ts.getScreenshotAs(OutputType.FILE);
		File end = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\AdactinPIC.png");
//		 FileUtils.copyFile(start, end);
		FileHandler.copy(start, end);

		Thread.sleep(2000);

		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();

		Thread.sleep(3000);
		driver.quit();

	}

}


