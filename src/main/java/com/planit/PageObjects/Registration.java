package com.planit.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

	private static WebElement element = null;
	private static List<WebElement> elementlist = null;

	public static WebElement selectcheckboxforRemoveItem(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@type='checkbox' and @name='removefromcart']"));
		return element;
	}

	public static WebElement updateShopingcartButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@name='updatecart']"));
		return element;
	}

	public static WebElement subTotalPrice(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//table[@class='cart-total']//span[text()='Sub-Total:']/../..//span[@class='product-price']"));
		return element;
	}

	public static WebElement tearmsAgreecheckbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='termsofservice']"));
		return element;
	}

	public static WebElement checkOutButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='checkout']"));
		return element;
	}

	public static WebElement billingAddressDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@name='billing_address_id']"));
		return element;
	}

	public static WebElement shippingAddressDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@name='shipping_address_id']"));
		return element;
	}

	public static WebElement billingAddresscontinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='billing-buttons-container']//input"));
		return element;
	}

	public static WebElement shippingAddresscontinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='shipping-buttons-container']//input"));
		return element;
	}

	public static WebElement nextDayAirRadioButton(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//div[@class='method-name']/input[@value='Next Day Air___Shipping.FixedRate']"));
		return element;
	}

	public static WebElement shippingmethodcontinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//input"));
		return element;
	}

	public static WebElement codRadioButton(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//div[@class='payment-details']//input[@value='Payments.CashOnDelivery']"));
		return element;
	}

	public static WebElement paymentMethodcontinueButton(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input[@value='Continue']"));
		return element;
	}
	
	public static WebElement paymentinfocontinueButton(WebDriver driver) {
		element = driver
				.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input[@value='Continue']"));
		return element;
	}
	
	
	//div[@id='payment-info-buttons-container']//input[@value='Continue']

	public static WebElement PaymentInformation(WebDriver driver) {
		element = driver.findElement(By.xpath("//p[normalize-space()='You will pay by COD']"));
		return element;
	}

	public static WebElement PaymentInformationContinueButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input[@value='Continue']"));
		return element;
	}

	public static WebElement ConfirmButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']//input[@value='Confirm']"));
		return element;
	}

	public static WebElement orderConfirmmessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='section order-completed']/div/strong"));
		return element;
	}

	public static WebElement orderNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='section order-completed']//ul[@class='details']/li[1]"));
		return element;
	}

}
