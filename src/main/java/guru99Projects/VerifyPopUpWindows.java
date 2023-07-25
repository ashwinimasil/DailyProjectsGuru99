package guru99Projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseClass.ParentClass;

public class VerifyPopUpWindows extends ParentClass{
@Test
	public void verifyPopup() {
		
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		driver.findElement(By.xpath("//a[@title='Sony Xperia']/following::a[text()='Add to Compare']")).click();
		driver.findElement(By.xpath("//a[@title='IPhone']/following::a[text()='Add to Compare']")).click();	
		driver.findElement(By.xpath("//span[text()='Compare']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList = new ArrayList<>(windowHandles);
		driver.switchTo().window(winList.get(1));
		System.out.println(driver.getTitle());
	}
}