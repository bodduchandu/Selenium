package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumStaticDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown.selectByIndex(4);
		dropdown.selectByValue("6");
		dropdown.selectByVisibleText("8 Adults");
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	}

}
