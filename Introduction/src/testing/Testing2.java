package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "G:\\selenium folder\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		WebDriver bo = new FirefoxDriver();
		
		bo.get("https://www.spicejet.com");
		
		System.out.println(bo.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
