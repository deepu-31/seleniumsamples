package seleniumsamples1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxtest {

	public static void main(String[] args) {
		// to check the element is enabled,displayed and selected or not
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.virginaustralia.com/au/en/");
		WebElement element=driver.findElement(By.xpath("(//div[contains(@class,'group-checkbox')])[1]"));
		//Testcase:1
		if(element.isDisplayed()) {
			System.out.println("Element is displayed in the page");
			//Testcase:2
			if(element.isEnabled()) {
				System.out.println("Element is enabled in the page");
				//Testcase:3
				if(element.isSelected()) {
					System.out.println("Element is selected in the page");
				}
				else {
					System.out.println("Element is not selected in the page");
				}
			}
				else {
					System.out.println("Element is not enabled in the page");
				}
		}
		else
		{
			System.out.println("Element is not displayed in the page");
			}
		driver.close();
			
		}

	}


