package TestBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testCaseBase {
	protected WebDriver driver;

	public void setup() {

		// driver = new FirefoxDriver();

//  options.addArguments("--no-sandbox", "--disable-gpu");
//		  driver = new ChromeDriver(options);
		 

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		options.addArguments("--window-size=1920,1080");
//		options.addArguments("--disable-gpu");
//		options.addArguments("--no-sandbox");
//		driver = new ChromeDriver(options);
//	driver.manage().window().maximize();
//	driver.get("https://nsui.esigns.io/signin");
		
//	driver.get("https://dev.esigns.io/signin");
		
		
		ChromeOptions options = new ChromeOptions();
		 
		driver = new ChromeDriver(options);
 
		driver.manage().window().maximize();
 
		driver.get("https://nsui.esigns.io/signin");
		
//		driver.get("https://dev.esigns.io/signin");

	}
	
	public void waitEle(By by) throws Exception {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}
	
	
	
}
