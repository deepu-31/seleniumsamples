package seleniumsamples1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutocacheTest {

	public static void main(String[] args) throws Exception {
		// check whether the  words are listing according to search word
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com.au/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium");
		WebElement cacheelement=driver.findElement(By.xpath("//ul[@role='listbox']"));
		//Test case.1 get count of elements in auto cache
		List<WebElement> listofelements=cacheelement.findElements(By.xpath("child::li"));
		System.out.println("Number of autosuggestions are: "+listofelements.size());
		//Test case.2 get each text from the list of cache
		for(WebElement element:listofelements) {
			System.out.println(element.getText());
		}

	}

}
