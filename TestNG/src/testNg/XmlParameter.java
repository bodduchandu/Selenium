package testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlParameter {
	
	@Test()
	@Parameters({"UserID"})
	public void User(String Username){
		
		System.out.println(Username);
		
	}

}
