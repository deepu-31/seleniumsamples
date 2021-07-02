package seleniumsamples1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchingbrowser {

	public static void main(String[] args) {
		// launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com.au/");
		driver.manage().window().maximize();

	}

}
