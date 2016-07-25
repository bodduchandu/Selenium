package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumGenericFrames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/in/");
		WebDriverWait wait = new WebDriverWait(driver,5);
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("chandu");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul")));
		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[1]/p")).click();
		

	}

}
