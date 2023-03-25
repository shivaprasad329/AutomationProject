package com.businessRules;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.base.Verify;
import com.planit.PageObjects.ComputersPage;
import com.planit.PageObjects.HomePage;
import com.planit.PageObjects.LoginPage;
import com.planit.PageObjects.ShopingCart;
import com.selenium.reusable.SeleniumReusable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BusinessFunctions extends SeleniumReusable {

	

	private static WebDriver driver;
	Properties prop = null;


	public BusinessFunctions() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void RegisterAccount()
	{
		clearandSendKeyswithLabelName("First Name","shiva");
		clearandSendKeyswithLabelName("Last Name", "naga");
		clearandSendKeyswithLabelName("E-Mail","durre@gmail.com");
		clearandSendKeyswithLabelName("Password", "biku");
		
	}
	
	
	

	
	public void signIntoApplication() throws IOException {
		readDataFromPropertiesFile();

		LoginPage.loginLink(driver).click();
		clearAndSendKeys(LoginPage.emailField(driver), prop.getProperty("USERNAME"));
		clearAndSendKeys(LoginPage.passwordField(driver), prop.getProperty("PASSWORD"));
		LoginPage.loginButton(driver).click();
		System.out.println("User Sucessfully Logged into the Application");

	}

	public void clearAndSendKeys(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	public void verifyLoggedUser() {
		String ActualLogedUser = HomePage.LoggedUser(driver).getText();

		Assert.assertEquals(ActualLogedUser, Validations.EXPECT_LOGGEDUSER);
		System.out.println("User Verification Successfully Done");

	}

	public void clearItemsFromCart() {

		HomePage.shoppingcartLink(driver).click();
		ShopingCart.selectcheckboxforRemoveItem(driver).click();
		ShopingCart.updateShopingcartButton(driver).click();
		System.out.println("Item Removed from the Shopping cart");

	}

	public void selectDesktops() throws InterruptedException {

		WebElement Computers = ComputersPage.ComputerMenu(driver);
		Actions actions = new Actions(driver);
		actions.moveToElement(Computers).build().perform();
		ComputersPage.Desktopsublink(driver).click();
		ComputersPage.SelectComputerfromList(driver).click();
		
		String PriceValue = ComputersPage.priceDetails(driver).getText();
		System.out.println("Selected System Price Values is : " + PriceValue);
		
		ComputersPage.QtyTextbox(driver).click();
		ComputersPage.QtyTextbox(driver).clear();
		ComputersPage.QtyTextbox(driver).sendKeys("2");
		clickbyJS();
		
		
		String shoppingcartSuccessmessage = ComputersPage.shoppingcartSuccessMessage(driver).getText();
		Assert.assertEquals(shoppingcartSuccessmessage, Validations.EXPECT_SUCCESSMESSAGE);
		scrollup();

	}

	public void additemsinShoppingCart() {
		HomePage.shoppingcartLink(driver).click();
		String subTotalValue = ShopingCart.subTotalPrice(driver).getText();
		System.out.println(subTotalValue);
		Assert.assertEquals(subTotalValue, Validations.EXPECT_ORDERSUBTOTALPRICE);
		ShopingCart.tearmsAgreecheckbox(driver).click();
		ShopingCart.checkOutButton(driver).click();

		Select st = new Select(ShopingCart.billingAddressDropdown(driver));
		st.selectByVisibleText("planit test, 2-3-4,VBIT park, Hyd 500081, India");
		ShopingCart.billingAddresscontinueButton(driver).click();

		Select st1 = new Select(ShopingCart.shippingAddressDropdown(driver));
		st1.selectByVisibleText("planit test, 2-3-4,VBIT park, Hyd 500081, India");
		ShopingCart.shippingAddresscontinueButton(driver).click();

		
		ShopingCart.nextDayAirRadioButton(driver).click();
		scrolldown();
		ShopingCart.shippingmethodcontinueButton(driver).click();

		ShopingCart.codRadioButton(driver).isSelected();
		ShopingCart.paymentMethodcontinueButton(driver).click();
		
		
		String paymentInformation = ShopingCart.PaymentInformation(driver).getText();
		System.out.println(paymentInformation);
		
		ShopingCart.paymentinfocontinueButton(driver).click();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,1000)");

		ShopingCart.ConfirmButton(driver).click();
		String orderconfirmmessage = ShopingCart.orderConfirmmessage(driver).getText();
		Assert.assertEquals(orderconfirmmessage, Validations.EXPECT_ORDERCONFIRMMESSAGE);

		String orderNumber = ShopingCart.orderNumber(driver).getText();

		System.out.println("Order Number is : " + orderNumber.substring(14, 21));

	}

	public void clickbyJS() {
		WebElement element = ComputersPage.addToCart(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,1000)");
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void scrollup()
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,-3000)");
	}

	public void scrolldown()
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,3000)");
	}

	public void logoutfromtheApplication() {
		HomePage.logoutLink(driver).click();
	}

}
