package ecommerce.assignment.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import ecommerce.assignment.pages.HomePage;
import ecommerce.assignment.pages.ProductPage;



public class Baseclass {
	public WebDriver driver;
	public HomePage homePage;
	public ProductPage productPage;
	
	
	@BeforeSuite(alwaysRun = true)
	public synchronized void launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan Alagesan\\eclipse-workspace\\CapstoneProject\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			homePage = new HomePage(driver);
			 productPage = new ProductPage(driver);
		} catch (Exception e) {
			
		}
	}

	
	@AfterSuite(alwaysRun = true)
	public synchronized void killTask() {
		
driver.quit();
	}
	
}