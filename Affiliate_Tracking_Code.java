package first_maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Affiliate_Tracking_Code {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencartsite/index.php?route=account/tracking&language=en-gb&customer_token=46dc6363857074946ab9ff540d");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Link Generator of 
		
		driver.findElement(By.xpath("//*[@id=\"input-generator\"]")).click(); // Link Generator Click
		driver.findElement(By.xpath("//*[@id=\"autocomplete-generator\"]/li[2]/a")).click(); // Canon 5D click
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click(); // Continue Button 

		
		
		// check database

	}

}
