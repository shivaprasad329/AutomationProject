package com.planit.Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.businessRules.BusinessFunctions;

public class WebshopTestcases extends BusinessFunctions {

	@Test
	public void DemoApp() throws IOException, InterruptedException {

		// ---Open the Browser based on the given value from the property value
		openBrowser();

		// Signin the Application with valid Credentials
		signIntoApplication();

		// Validate the User Details
		verifyLoggedUser();

		// clear the Items from the Cart
		//clearItemsFromCart();

		// Select the New Desktop from the Menu
		selectDesktops();

		// adding the computer into the cart and compete the Payment and confirm Order
		additemsinShoppingCart();
		
		logoutfromtheApplication();

	}

	@Test
	public void tearDown() {

		
		
	}

}
