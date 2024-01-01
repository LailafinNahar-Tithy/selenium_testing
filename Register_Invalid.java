package first_maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Invalid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencartsite/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	    // register
		driver.findElement(By.xpath("(//span[@class])[3]")).click();
	    driver.findElement(By.xpath("(//a[@class])[6]")).click(); // register link
	    driver.findElement(By.id("input-firstname")).sendKeys("AB");
	    driver.findElement(By.id("input-lastname")).sendKeys("XY");
	    driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.com"); // valid email 
	    driver.findElement(By.id("input-password")).sendKeys("12345678");
	    driver.findElement(By.cssSelector("input#input-newsletter")).click(); // subscribe toggle button
	    //driver.findElement(By.xpath("(//input[@type])[10]")).click(); // privacy toggle button off
	    driver.findElement(By.xpath("(//button[@class])[4]")).click(); // continue button
	    
	    
	    driver.findElement(By.xpath("(//input[@type])[10]")).click(); // privacy toggle button on
	    driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.con"); // invalid email
	    driver.findElement(By.xpath("(//button[@class])[4]")).click(); // continue button
	    
	    driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.com"); // Valid email
	    driver.findElement(By.id("input-password")).sendKeys(""); // Password field empty
	    driver.findElement(By.xpath("(//button[@class])[4]")).click(); // continue button

	}

}
