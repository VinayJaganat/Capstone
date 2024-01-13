package ecommerce.assignment.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//picture[@title='Flipkart']/img")
	private WebElement imgFlipkart;

	@FindBy(xpath = "//input[@placeholder='Search for Products, Brands and More']")
	private WebElement searchTextField;

	@FindBy(xpath = "//button[@title='Search for Products, Brands and More']")
	private WebElement searchButton;

	@FindBy(xpath = "(//div[@class='_3pLy-c row'])[1]/div/div[@class='_4rR01T']")
	private WebElement firstProduct;

	@FindBy(xpath = "//button[text()='Add to cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//span[text()='Cart']")
	private WebElement cartIcon;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getImgFlipkart() {
		return imgFlipkart;
	}

	public void setImgFlipkart(WebElement imgFlipkart) {
		this.imgFlipkart = imgFlipkart;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getFirstProduct() {
		return firstProduct;
	}

	public void setFirstProduct(WebElement firstProduct) {
		this.firstProduct = firstProduct;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public void setCartIcon(WebElement cartIcon) {
		this.cartIcon = cartIcon;
	}

	public WebElement getProductName() {
		return productName;
	}

	public void setProductName(WebElement productName) {
		this.productName = productName;
	}

	@FindBy(xpath = "//a[@class='_2Kn22P gBNbID']")
	private WebElement productName;
	

}