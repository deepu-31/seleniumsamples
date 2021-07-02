package seleniumsamples1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobuttontest {

	public static void main(String[] args) throws Exception {
		//count all radio button and click on specific button
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(10000);
		List<WebElement> radiobutton=driver.findElements(By.xpath("//input[@type='radio']"));
		List<WebElement> list=new ArrayList<WebElement>();
		for(WebElement ele:radiobutton) {
			if(ele.isDisplayed()) {
				list.add(ele);
			}
		}
		list.get(2).click();
		driver.close();

	}

}
