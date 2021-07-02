package seleniumsamples1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinkstest {

	public static void main(String[] args) throws Exception {
		// test the links whether they are getting 200 response or not 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> links1=driver.findElements(By.xpath("//*"));
		System.out.println("Total links are: "+links1.size());//to display the total links
		List<WebElement>links2=new ArrayList<WebElement>();
		int workinglinks=0;
		int brokenlinks=0;
		for(WebElement element:links1) {
			if(element.getAttribute("href")!=null){
				String value=element.getAttribute("href");
				if(value.startsWith("http")||value.startsWith("https")) {
					links2.add(element);
					URL u=new URL(value);
					HttpURLConnection con=(HttpURLConnection)u.openConnection();
					String responsemessage=con.getResponseMessage();
					if(responsemessage.equalsIgnoreCase("ok")) {
						workinglinks++;
					}
					else {
						brokenlinks++;
						System.out.println(value+ "returns" +responsemessage);
					}
				}
			}
		}
		System.out.println("Total count of href links: "+links2.size());
		System.out.println("Total count of correct working links are: "+workinglinks);
		driver.close();

	}

}
