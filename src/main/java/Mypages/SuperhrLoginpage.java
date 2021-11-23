package Mypages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

public class SuperhrLoginpage {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Practise\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://superhrtest.peopledesk.net/sign");
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL is :"+ currentUrl);
		String title = driver.getTitle();
		System.out.println("Tittle is:"+ title);
		
		driver.findElement(By.xpath("//input[@ng-reflect-name='mobile_number']")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(4000);		
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pass.sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
		Thread.sleep(4000);
		WebElement Emp = driver.findElement(By.xpath("//a[@ng-reflect-router-link='/employees']"));
		Emp.click();
		Thread.sleep(5000);
		List<WebElement> Emplist = driver.findElements(By.xpath("//p[@class='view-name pl-2 m-0']"));
		System.out.println(Emplist.size());
		for (int i = 0; i < Emplist.size(); i++) {
			String path = "(//p[@class='view-name pl-2 m-0'])["+i+"]";
			String text = driver.findElement(By.xpath(path)).getText();
			System.out.println(text);
		}
		
		System.out.println("Hai Employees Welcomes to Heptagon");
		driver.quit();
		
		
	}
}
