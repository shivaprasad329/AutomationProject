package com.planit.Testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Dockerwithchrome {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities ds=DesiredCapabilities.chrome();
		
		URL url=new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver=new RemoteWebDriver(url,ds);
		
		driver.get("https://courses.letskodeit.com/practice");
		
		System.out.println(driver.getTitle());
		
		
		
	}
}
