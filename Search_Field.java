package first_maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Field {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencartsite/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//search field
		
		//1
	    driver.findElement(By.cssSelector("input.form-control")).sendKeys("laptop"); // search field fill-up
	    driver.findElement(By.cssSelector("button.btn-light")).click(); // search button 
	    
	    //2
	    driver.findElement(By.cssSelector("input.form-control")).sendKeys("Tablet"); // search field fill-up
	    driver.findElement(By.cssSelector("button.btn-light")).click(); // search button 


	}

}
