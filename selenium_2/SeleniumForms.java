package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumForms {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//System.out.println(driver.getPageSource());
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("chandu");
	}

}
