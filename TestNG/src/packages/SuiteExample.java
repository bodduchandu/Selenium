package packages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteExample {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I am The first");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I am the last");
	}

}
