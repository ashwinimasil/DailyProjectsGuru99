package guru99Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.ParentClass;

public class EcommerceProject extends ParentClass {
	@Test
	public void phoneNames() throws InterruptedException {
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		String Title2 = driver.getTitle();
		System.out.println(Title2);
		Assert.assertEquals(Title2, "Mobile");
		WebElement sort = driver.findElement(By.xpath("//select[@title='Sort By']"));
		sort.click();
		Select select = new Select(sort);
		Thread.sleep(3000);
		select.selectByVisibleText("Name");
		List<WebElement> Names = driver.findElements(By.xpath("//h2[@class='product-name']"));

		for (int i = 0; i < Names.size(); i++) {

			String phoneNames = Names.get(i).getText();
			System.out.println(phoneNames);
		}
		
	}
}