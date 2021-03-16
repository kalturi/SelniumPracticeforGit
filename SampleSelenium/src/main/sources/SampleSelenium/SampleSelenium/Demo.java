package SampleSelenium.SampleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Demo {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\seleniumDrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			//driver.findElement(By.linkText("Hello, Sign in")).click();
			//driver.findElement(By.xpath("//span[contains(@class,'nav-line-1')]")).click();
			driver.findElement(By.id("ap_email")).sendKeys("8096753377");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("Sush@177");
			driver.findElement(By.id("signInSubmit")).click();
			//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I phone 7plus mobiles");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Select s= new Select(driver.findElement(By.xpath("//*[@title='Search in']'")));
			s.selectByValue("search-alias=amazon-devices");
			//s.selectByValue("search-alias=amazon-devices");
			//s.selectByIndex(6);
			s.deselectByVisibleText("Books");
		
			
			
			
	}
}
