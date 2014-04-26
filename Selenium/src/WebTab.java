import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTab {

	public static void main(String[] args) {
		
WebDriver driver=new FirefoxDriver();
driver.get("http://www.arsenal.com/fixtures/first-team/tables");
//driver.findElement(By.xpath(".//*[@id='wrapper']/div/section/table/tbody/tr[3]/td[2]")).getText();
for (int i=3;i<=8;i=i+1)
{
	System.out.println(driver.findElement(By.xpath(".//*[@id='wrapper']/div/section/table/tbody/tr["+i+"]/td[2]")).getText());
	
}



	}

}
