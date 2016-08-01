package packages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG {
	
	@Test
	public void flightBookin()
	{
		System.out.println("Flight Bookin");
	}
	
	@Test(groups = {"Priority1"})
	public void groupExample()
	{
		System.out.println("I am the first Priority");
	}
	
	@Test
	public void openingBrowser()
	{
		System.out.println("Opening Browser");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This method executes before each test");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This method executes after each test");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This method executes before all testcases");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("This method executes after all testcases");
	}

}
