package com.selenium.reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.businessRules.BusinessFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumReusable {

	private WebDriver driver=null;
	private Properties prop = null;


	public SeleniumReusable(WebDriver driver) {
		this.driver = driver;
	}

	
	
		
	
	
	
	public void readDataFromPropertiesFile() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"./Config\\Config.properties");
		prop.load(fis);

	}

	public WebDriver openBrowser() throws IOException {

		readDataFromPropertiesFile();

		String browserName = prop.getProperty("BROWSER");

		if (browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equals("edge")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("APPURL"));

		return driver;

	}
	
	public void clearandSendKeyswithLabelName(String textboxName,String InputValue) {
		try {
			
			WebElement element=driver.findElement(By.xpath("//label[text()='"+textboxName+"']//parent::div//input[@class='form-control']"));
			element.clear();
			element.sendKeys(InputValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No Such Element Exception");
			e.printStackTrace();
		}
	}
	
	public void clickonElement(WebElement element)
	{
		element.click();
	}
	
	public void selectoptionfromDropdownUsingVisibleText(WebElement element,String textValue)
	{
		try {
			Select st=new Select(element);
			st.selectByVisibleText(textValue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
