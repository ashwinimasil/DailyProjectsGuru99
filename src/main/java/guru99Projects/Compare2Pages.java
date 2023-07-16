package guru99Projects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseClass.ParentClass;

public class Compare2Pages extends ParentClass {
public static String sonyPrice;
@Test
	public void compare2pages() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		WebElement sort = driver.findElement(By.xpath("//select[@title='Sort By']"));
		sort.click();
		Select select = new Select(sort);
		Thread.sleep(3000);
		select.selectByVisibleText("Name");
		String sonyPrice = driver.findElement(By.xpath("//span[@id='product-price-1']")).getText();
		System.out.println(sonyPrice);
		driver.findElement(By.xpath("//img[@id='product-collection-image-1']")).click();
		String detailsPrice = driver.findElement(By.xpath("//span[@class='price']")).getText();
		System.out.println(sonyPrice + "and" + detailsPrice);
		try {
			assertEquals(sonyPrice, detailsPrice);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("The End");
	}
}