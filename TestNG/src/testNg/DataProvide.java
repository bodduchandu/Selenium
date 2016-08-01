package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
	
	@Test(dataProvider = "getData")
	public void UserID(String uname,String pwd,String roll)
	{
		System.out.println("hello");
		System.out.println(uname);
		System.out.println(pwd);
		System.out.println(roll);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][3];
		data[0][0] = "Chandu";
		data[0][1] = "sekhar";
		data[0][2] = "04";
		data[1][0] = "Chaitu";
		data[1][1] = "chitu";
		data[1][2] = "03";
		data[2][0] = "Boddu";
		data[2][1] = "BCS";
		data[2][2] = "02";
		return data;
	}

}
