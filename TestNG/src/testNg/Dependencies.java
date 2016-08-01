package testNg;

import org.testng.annotations.Test;

public class Dependencies {
	
	@Test(dependsOnMethods={"openingBrowser"},alwaysRun = true)
	public void flightBookin()
	{
		System.out.println("Flight Bookin");
	}
	
	@Test
	public void openingBrowser()
	{
		System.out.println("Opening Browser");
	}
	
	@Test(timeOut = 5000)
	public void timeOutCase()
	{
		System.out.println("Elapsed time out");
	}
	
	@Test(enabled=false)
	public void newCase()
	{
		System.out.println("New case");
	}

}
