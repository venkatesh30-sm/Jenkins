package oreg.read;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\target\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	}

}
