package com.planit.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.businessRules.BusinessFunctions;

public class Demo extends BusinessFunctions {
	
	@Test
	public void demoregistration()
	{
		try {
			openBrowser();
			RegisterAccount();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
