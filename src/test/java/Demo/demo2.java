package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class demo2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

	    WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

}
