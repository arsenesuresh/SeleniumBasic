import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Basic {

	public static void main(String[] args) {
		//this is main method
		WebDriver driver=new FirefoxDriver();
		driver.get("http:/google.com");
		WebElement abc=driver.findElement(By.id("gs_taif0"));
		Actions builder=new Actions(driver);
		builder.moveToElement(abc).build().perform();
		builder.keyDown(Keys.SHIFT).moveToElement(abc).sendKeys("yamaha").build().perform();
		
	}
	

}
