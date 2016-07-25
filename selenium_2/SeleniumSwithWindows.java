package selenium_2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSwithWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		Set<String> titles =driver.getWindowHandles();
		Iterator<String> ids = titles.iterator();
		String parentid = ids.next();
		String childid = ids.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("html/body/div[2]/section/div/article/section/div/div[1]/a")).click();

	}

}
