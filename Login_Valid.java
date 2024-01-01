package first_maven1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Valid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/opencartsite/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
	    // login to logout 
	    
		driver.findElement(By.xpath("(//a[@class])[7]")).click(); // my account
		driver.findElement(By.id("input-email")).sendKeys("ltithy201332@bscse.uiu.ac.bd"); // email
		driver.findElement(By.id("input-password")).sendKeys("1234"); // password
		driver.findElement(By.cssSelector("button.btn-primary")).click(); // login button
		driver.findElement(By.xpath("(//span[@class])[3]")).click(); // my account
        driver.findElement(By.xpath("(//a[@class])[10]")).click(); // logout button
		
		
		
		


	    
	    
	    
	    
	    
	    
	    
	    

		

		
		
		
	}

}
