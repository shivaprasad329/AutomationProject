package com.planit.Testcases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("01 beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("02 afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("03 beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("04 afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("05 beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("02 afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("06 beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("07 afterSuite");
  }

}
