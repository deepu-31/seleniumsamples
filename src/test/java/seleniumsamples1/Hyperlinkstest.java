package seleniumsamples1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinkstest {

	public static void main(String[] args) {
		// count number of links on the page
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com.au/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int visiblelinks=0;
		int hiddenlinks=0;
		for(WebElement element:links) {
			if(element.isDisplayed()) {
				visiblelinks++;
				System.out.println(element.getText());
			}
			else {
				hiddenlinks++;
		         }
		}
		System.out.println("Total count of visible links are:" +visiblelinks);
		System.out.println("Total count of hidden links are:"  +hiddenlinks);
		driver.close();
		
		

	}

}
