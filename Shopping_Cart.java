package first_maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping_Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencartsite/index.php?route=product/category&language=en-gb&path=20_27");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// Cart 
		
		driver.findElement(By.xpath("//*[@id=\"product-list\"]/div/div/div[2]/form/div/button[1]")).click(); // cart select
		driver.findElement(By.xpath("//*[@id=\"header-cart\"]/div/button")).click(); // cart selected view
		driver.findElement(By.xpath("//*[@id=\"header-cart\"]/div/ul/li/div/p/a[1]/strong")).click(); //view cart
		driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/h2/button")).click(); // coupon button
		
		//check database for coupon
		driver.findElement(By.xpath("//*[@id=\"input-coupon\"]")).sendKeys("ABCD"); // Invalid coupon
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div[2]/button")).click(); // apply coupon button
		
		//check database for coupon
		driver.findElement(By.xpath("//*[@id=\"input-coupon\"]")).sendKeys("1111"); // Valid coupon
		driver.findElement(By.xpath("//*[@id=\"form-coupon\"]/div[2]/button")).click(); // apply coupon button
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click(); // continue button
		

	}

}
