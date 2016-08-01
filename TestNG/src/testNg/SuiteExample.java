package testNg;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteExample extends GlobalParam{
	
		
	@BeforeSuite
	public void beforeSuite() throws IOException
	{
		Login();
		System.out.println("I am The first");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I am the last");
	}

}
