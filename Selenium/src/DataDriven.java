import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;






public class DataDriven {

	public static void main(String[] args) throws IOException {
		Properties config=new Properties();
		FileInputStream fis = new FileInputStream ("C:\\Users\\suresh\\workspace\\Selenium\\Sample");
		config.load(fis);
		System.out.println(config.getProperty("yamaha"));
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(config.getProperty("yamaha"));
		
			

	}

}
