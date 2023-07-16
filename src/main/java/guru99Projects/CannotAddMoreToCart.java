package guru99Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseClass.ParentClass;

public class CannotAddMoreToCart extends ParentClass{
	@Test
	public void addCartPage() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		WebElement sort = driver.findElement(By.xpath("//select[@title='Sort By']"));
		sort.click();
		Select select = new Select(sort);
		Thread.sleep(3000);
		select.selectByVisibleText("Name");
		driver.findElement(By.xpath("//span[@id='product-price-1']//following::button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@title='Qty']")).sendKeys("1000");
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		// some of the products error msg
		String errorMsg = driver.findElement(By.xpath("//span[contains(text(),'products')]")).getText();
		System.out.println(errorMsg);
		driver.findElement(By.xpath("//span[text()='Empty Cart']")).click();
		// shopping cart is empty
		String emptyMsg = driver.findElement(By.xpath("//h1[contains(text(),'Empty')]")).getText();
		System.out.println(emptyMsg);
		Thread.sleep(5000);
		// checking cart
		// Actions action = new Actions(driver);
		WebElement icon = driver.findElement(By.xpath("//span[text()='Cart']"));
		driver.executeScript("arguments[0].click();", icon);
		String cartMsg = driver.findElement(By.xpath("//p[contains(text(),'items')]")).getText();
		System.out.println(cartMsg);
	}

}