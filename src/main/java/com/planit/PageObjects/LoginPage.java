package com.planit.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element = null;
	private static List<WebElement> elementlist = null;

	public static WebElement loginLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
		return element;
	}

	public static WebElement emailField(WebDriver driver) {
		element = driver.findElement(By.id("Email"));
		return element;
	}

	public static WebElement passwordField(WebDriver driver) {
		element = driver.findElement(By.id("Password"));
		return element;
	}

	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@value='Log in']"));
		return element;
	}

}
