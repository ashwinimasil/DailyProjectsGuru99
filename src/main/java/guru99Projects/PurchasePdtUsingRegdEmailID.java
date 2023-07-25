package guru99Projects;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PurchasePdtUsingRegdEmailID {

	public static void main(String[] args) {
		FirefoxOptions options = new FirefoxOptions();
		FirefoxDriver driver = new FirefoxDriver(options);
		driver.get("http://live.techpanda.org/index.php/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//login to myaccount using the registered credentials
		driver.findElement(By.xpath("(//a[text()='My Account'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ashwinimasil@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test123$");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		//click on my wishlist
		driver.findElement(By.xpath("(//a[text()='My Wishlist'])[2]")).click();
		//click on add to cart
		java.util.List<WebElement> addToCart = driver.findElements(By.xpath("//span[text()='Add to Cart']"));
		int size = addToCart.size();
		for (int i=0;i<2;i++) {
			addToCart.get(i).click();
	}
	}
}
