package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getmethod {

	public static void main(String[] args)  {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		//Thread.sleep(5000);
		
		
	}

}
