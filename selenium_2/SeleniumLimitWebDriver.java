package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLimitWebDriver {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");
		// Links in the entire page
		//System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath(".//*[@id='footerFragment']/div"));
		// Links in the footer section
		//System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement colm = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		//System.out.println(colm.findElements(By.tagName("a")).size());
		String beforeclick = null;
		for (int i = 0; i < colm.findElements(By.tagName("a")).size(); i++) {
			// System.out.println(colm.findElements(By.tagName("a")).get(i).getText());
			if (colm.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
				 beforeclick = driver.getTitle();
				colm.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		String afterclick = driver.getTitle();
		
		if(beforeclick!=afterclick){
			if(driver.findElement(By.xpath("html/body/div[2]/div[1]/h1")).isDisplayed()){
				System.out.println("Pass");
				
			}else{
				System.out.println("Fail");
			}
				
		}

	}

}
