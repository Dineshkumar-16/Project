package com.Mvn_Proj;


	import java.io.File; 
	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;

	public class Runner_Automation {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String url="http://automationpractice.com/index.php";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			
			WebElement st = driver.findElement(By.xpath("//a[@class='login']"));
			st.click();
			
			WebElement mail = driver.findElement(By.id("email"));
			mail.sendKeys("dineshkumar16.r@gmail.com");
			
			WebElement pass = driver.findElement(By.id("passwd"));
			pass.sendKeys("Dap3ever$");
			
			WebElement sub = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
			sub.click();
			
			WebElement tshrt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));;
			tshrt.click();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(3000);
			
			WebElement image = driver.findElement(By.xpath("//div[@class='product-image-container']"));
			Actions r = new Actions(driver);
			r.moveToElement(image).build().perform();
			image.click();
			
			WebElement frame = driver.findElement(By.xpath("//iframe"));	
			driver.switchTo().frame(frame);
			driver.findElement(By.xpath("//a[@id='color_14']")).click();
			driver.findElement(By.xpath("//button[@class='exclusive']")).click();
			driver.switchTo().defaultContent();
			
			WebElement Proceed_to_out = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
			Thread.sleep(3000);
			r.moveToElement(Proceed_to_out).build().perform();
			r.click(Proceed_to_out).build().perform();
			
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("window.scrollBy(0,1000)");
			
			Thread.sleep(3000);
			WebElement pc1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
			pc1.click();
			JavascriptExecutor j1 = (JavascriptExecutor) driver;
			j1.executeScript("window.scrollBy(0,1000)");
			
			Thread.sleep(3000);
			WebElement smt = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			smt.click();
			JavascriptExecutor j2 = (JavascriptExecutor) driver;
			j2.executeScript("window.scrollBy(0,200)");
			Thread.sleep(3000);
			
			WebElement ckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
			ckbox.click();
			
			Thread.sleep(3000);
			WebElement submt = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			submt.click();
			JavascriptExecutor j3 = (JavascriptExecutor) driver;
			j3.executeScript("window.scrollBy(0,500)");
			
			Thread.sleep(3000);
			WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
			pay.click();
			JavascriptExecutor j4 = (JavascriptExecutor) driver;
			j4.executeScript("window.scrollBy(0,500)");
			
			Thread.sleep(3000);
			WebElement subm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			subm.click();
			JavascriptExecutor j0 = (JavascriptExecutor) driver;
			j0.executeScript("window.scrollBy(0,400)");
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File start = ts.getScreenshotAs(OutputType.FILE);
			File end = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Testing\\ScreenShot\\PIC.png");
//			 FileUtils.copyFile(start, end);
			FileHandler.copy(start, end);
			
			WebElement back = driver.findElement(By.xpath("//a[text()='Back to orders']"));
			back.click();
			
			
			j4.executeScript("window.scrollBy(0,400)");

			Thread.sleep(3000);

			j4.executeScript("window.scrollBy(0,-450)");
			
			WebElement lgout = driver.findElement(By.xpath("//a[@title='Log me out']"));
			lgout.click();
			
			
			
			
			
			
			
			
			
			
			
			
		}

	}


