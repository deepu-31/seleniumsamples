package seleniumsamples1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshottest {

	public static void main(String[] args) throws IOException {
		// to take the screen shot of the page
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com.au/");
		//page level screenshot
		File target=new File("googlepagescreenshot.png");
		File source=driver.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, target);
		//Element level screenshot
		WebElement element=driver.findElement(By.className("lnXdpd"));
		File dest=new File("elementpic.png");
		File src=element.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, dest);
        driver.close();

	}

}
