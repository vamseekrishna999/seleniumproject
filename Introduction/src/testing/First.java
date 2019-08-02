package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "G:\\selenium folder\\chromedriver.exe");

		ChromeDriver bo = new ChromeDriver();

		bo.get("https://www.facebook.com/");

		bo.findElementById("email").sendKeys("vamseekrishna50@yahoo.com");
		bo.findElementById("pass").sendKeys("v8309343509");

		bo.findElementById("u_0_a").click();
		


		bo.navigate().refresh();

		bo.getTitle();
		bo.getPageSource();
		bo.close();
		
		

	}

}
