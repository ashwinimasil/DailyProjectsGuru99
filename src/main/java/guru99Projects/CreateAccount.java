package guru99Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class CreateAccount {
@Test
	public void createAccount() {
		FirefoxOptions options = new FirefoxOptions();
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("(//a[text()='My Account'])[2]")).click();
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
		//Enter user account info
		driver.findElement(By.id("firstname")).sendKeys("Ashwini");
		driver.findElement(By.id("lastname")).sendKeys("Masilamani");
		driver.findElement(By.id("email_address")).sendKeys("ashwinimasil@gmail.com");//account created
		driver.findElement(By.id("password")).sendKeys("Test123$");
		driver.findElement(By.id("confirmation")).sendKeys("Test123$");
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		//click TV link
		driver.findElement(By.xpath("//a[text()='TV']")).click();
		//click on add wish list of samsung LCD
		driver.findElement(By.xpath("//img[@id='product-collection-image-5']/following::a[text()='Add to Wishlist']")).click();
		//click share wishlist
		driver.findElement(By.xpath("//span[text()='Share Wishlist']")).click();
		//email id
		driver.findElement(By.id("email_address")).sendKeys("ashwinimasil@gmail.com");
		//click on wishlist
		driver.findElement(By.xpath("//span[text()='Share Wishlist']")).click();
			}
}
