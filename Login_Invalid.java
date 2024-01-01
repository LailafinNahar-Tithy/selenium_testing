package first_maven1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Invalid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencartsite/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	        // login
	    
			driver.findElement(By.xpath("(//a[@class])[7]")).click(); // My Account
			driver.findElement(By.id("input-email")).sendKeys("ltithy201332@bscse.uiu.ac.bd"); // email
			driver.findElement(By.id("input-password")).sendKeys("12345"); // wrong password
			driver.findElement(By.cssSelector("button.btn-primary")).click(); // Login Button
		
		

		
			

		
		
		
	}

}
