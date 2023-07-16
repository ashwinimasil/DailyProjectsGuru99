package baseClass;
import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class ParentClass{
	
public static FirefoxDriver driver;
public static FirefoxOptions options;
@BeforeMethod

public void precondition(){
	options = new FirefoxOptions();
	driver = new FirefoxDriver(options);
	driver.get("http://live.techpanda.org/index.php/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
}
@AfterMethod
public void close() {
	driver.close();
}
}