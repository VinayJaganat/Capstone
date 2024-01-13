package ecommerce.assignment;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ecommerce.assignment.baseClass.Baseclass;


public class Ecommerce extends Baseclass {

	@Test()
	public void ecommerce() throws InterruptedException {

		/* Image Validation*/
		boolean status=homePage.getImgFlipkart().isDisplayed();
		if(status==true) {
			System.out.println("Flipkart Image displayed");
		}else {
			System.out.println("Flipkart Image not displayed");
		}
		
		/* enter value in search text field */
		homePage.getSearchTextField().sendKeys("Macbook air m2");
		
		/* click on search button */
		homePage.getSearchButton().click();
		
		/* Get titl of first product */
		String productTitle=homePage.getFirstProduct().getText();
		
		
		/* click on first product link */
		homePage.getFirstProduct().click();
		
		Thread.sleep(5000);
		
		/* Switch control to new tab */
		String mainWindowID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();
		for (String id : allWindowID) {
			if (!id.equals(mainWindowID)) {
				driver.switchTo().window(id);
			}
		}
		
		/* click on add to cart button */
		homePage.getAddToCartButton().click();
		
		/* click on add to cart icon */
		productPage.getAddToCartButton().click();
		
		Thread.sleep(5000);
				
		JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
		
		
		/* click on cart icon */
		jsExecutor.executeScript("arguments[0].click();", homePage.getCartIcon());
//		homePage.getCartIcon().click();
		
		Thread.sleep(5000);
		/* title of the product */
		String actualProductName=homePage.getProductName().getText();
		
		
		if (productTitle.equalsIgnoreCase(actualProductName)) {
			System.out.println(productTitle + " Product title is same");
		} else {
			System.out.println(productTitle + " is not matching with " +actualProductName);
		}
	}
}
