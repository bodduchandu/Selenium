package selenium_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumhandlingTableGrids {

	public static void main(String[] args) {
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/ci/engine/match/415281.html");
		WebElement table = driver.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div/table[1]"));
		List<WebElement> noofrows = table.findElements(By.tagName("tr"));
		System.out.println("No fo rows are "+ noofrows.size());
		int i = 0;
		for(WebElement eachrow:noofrows){
			List<WebElement> eachcolumn = eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("No of columns in "+i+"th row are "+eachcolumn.size());
			for(WebElement text:eachcolumn){
				System.out.println(text.getText());
			}
		}
			
			
		}
	}


