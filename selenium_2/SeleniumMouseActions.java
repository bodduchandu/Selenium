package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMouseActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		Actions actn = new Actions(driver);
		actn.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"))).build().perform();
		Thread.sleep(3000);
		actn.keyDown(Keys.SHIFT).moveToElement(driver.findElement(By.xpath("//input[@name = 'field-keywords']"))).sendKeys("hello chandu").build().perform();
		Thread.sleep(3000);
		actn.contextClick(driver.findElement(By.xpath("//input[@name = 'field-keywords']"))).build().perform();
		

	}

}
