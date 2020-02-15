package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Javatest {
	
	WebDriver driver;

	@BeforeMethod
	public void Browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
	}

	@Test
	public void userShouldBeAbleToAddDeposite() throws InterruptedException {
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//*[contains(@placeholder, 'assword') and contains(@class, 'form-control')]"))
				.sendKeys("abc123");
		driver.findElement(By.xpath("//*[contains(text(), 'Sign') and @name='login']")).click();


}
}