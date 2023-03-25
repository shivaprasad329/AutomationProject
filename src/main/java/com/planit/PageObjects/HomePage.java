package com.planit.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;
	private static List<WebElement> elementlist = null;

	public static WebElement LoggedUser(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='header-links']//a[@class='account']"));
		return element;
	}
	
	
	public static WebElement shoppingcartLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a/span[text()='Shopping cart']"));
		return element;
	}
	
	public static WebElement logoutLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
		return element;
	}
	
	
	

	
	
	

}
