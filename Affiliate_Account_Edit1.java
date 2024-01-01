package first_maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Affiliate_Account_Edit1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencartsite/index.php?route=account/affiliate&language=en-gb&customer_token=46dc6363857074946ab9ff540d");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Form Fill up for Affiliate Membership ( Paypal Method)
		
		driver.findElement(By.xpath("//*[@id=\"input-company\"]")).sendKeys("Tithy's Showroom"); // Company name input
		driver.findElement(By.xpath("//*[@id=\"input-website\"]")).sendKeys("www.tithyshowroom.com"); // web site input
		driver.findElement(By.xpath("//*[@id=\"input-tax\"]")).sendKeys("12345000"); // Tnx Id Iput
		driver.findElement(By.xpath("//*[@id=\"input-payment-paypal\"]")).click(); // Paypal Select
		
		//wrong email
		driver.findElement(By.xpath("//*[@id=\"input-paypal\"]")).sendKeys("abcd"); // Paypal Wrong Email input
		driver.findElement(By.xpath("//*[@id=\"input-agree\"]")).click(); // Delivery Info toggle button click
		driver.findElement(By.xpath("//*[@id=\"form-affiliate\"]/div/button")).click(); // Continue Button
		
		//correct email
		driver.findElement(By.xpath("//*[@id=\"input-paypal\"]")).sendKeys("abcd@gmail.com"); // Paypal Correct Email input
		driver.findElement(By.xpath("//*[@id=\"form-affiliate\"]/div/button")).click(); // Continue Button
		
		
		// check database

	}

}
