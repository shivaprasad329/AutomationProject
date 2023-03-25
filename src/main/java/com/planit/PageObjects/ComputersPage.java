package com.planit.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputersPage {

	private static WebElement element = null;
	private static List<WebElement> elementlist = null;

	public static WebElement ComputerMenu(WebDriver driver) {
		element = driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']"));
		return element;
	}

	public static WebElement Desktopsublink(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//ul[@class='top-menu']//a[normalize-space()='Computers']/..//li/a[normalize-space()='Desktops']"));
		return element;
	}

	public static WebElement SelectComputerfromList(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[@class='product-item']//img[@title='Show details for Build your own cheap computer']"));
		return element;
	}

	public static WebElement priceDetails(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='product-price']/span"));
		return element;
	}

	public static WebElement QtyTextbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@class='qty-input']"));
		return element;
	}

	public static WebElement addToCart(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[@class='add-to-cart-panel']//input[@type='button' and @value='Add to cart']"));
		return element;
	}

	public static WebElement shoppingcartSuccessMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='bar-notification']//p"));
		return element;
	}

}
