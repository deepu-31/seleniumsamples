package seleniumsamples1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Securesitetest {

	public static void main(String[] args) {
		//to check whether the site is secure or not
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com.au/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		if(url.startsWith("https")) {
			System.out.println("The site is secured");
		}
		else
		{
			System.out.println("The site is not secured");
		}
        driver.close();
	}

}
