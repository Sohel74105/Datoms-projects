package datoms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://accounts.datoms.io/login");
	
	WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
	email.sendKeys("soheltamboli1308@gmail.com");
	
	
	WebElement pass = driver.findElement(By.xpath("//input[@id=\"password\"]"));
	pass.sendKeys("Tamboli@123");
	
	WebElement login = driver.findElement(By.xpath("//input[@id=\"form_submit_btn\"]"));
	login.click();
	
	
	
	
	
}
	
	
	
	
	
	
}
