package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.in");
		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
