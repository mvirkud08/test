package vettypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VettyClass 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://stgclient.vetty.co/client/login");
		driver.manage().window().maximize();
        
		WebElement e1=driver.findElement(By.xpath("//*[@id='email']"));
		e1.sendKeys("vijay@tweeny.in");
		WebElement e2=driver.findElement(By.xpath("//*[@id='ssn']"));
		e2.sendKeys("123456");
		WebElement e3=driver.findElement(By.xpath("/html/body/app-root/div/app-client-login/div/div/div/div[2]/div/form/div[2]/div[3]/div/button"));
		e3.click();
		Thread.sleep(5000);
		
		WebElement e4=driver.findElement(By.xpath("/html/body/app-root/div/app-client-ui/div/app-client-nav/div/div[2]/a"));
		e4.click();
		Thread.sleep(5000);
		
		WebElement e5=driver.findElement(By.xpath("//*[@id='firstname']"));
		e5.sendKeys("ABC");
		Thread.sleep(5000);
		WebElement e6=driver.findElement(By.xpath("//*[@id='lastname']"));
		e6.sendKeys("XYZ");
		Thread.sleep(5000);
		WebElement e7=driver.findElement(By.xpath("//*[@id='email']"));
		e7.sendKeys("abcxyz@gmail.com");
		Thread.sleep(5000);
		WebElement e8=driver.findElement(By.xpath("/html/body/app-root/div/app-client-ui/div/div/app-new-order/div[2]/div/div/div[3]/div[2]/div/div/select"));
		Select s1=new Select(e8);
		s1.selectByVisibleText("Test");
		Thread.sleep(5000);
		WebElement e9=driver.findElement(By.xpath("/html/body/app-root/div/app-client-ui/div/div/app-new-order/div[2]/div/div/div[3]/div[2]/div/div/div[2]/div/div[39]/div[2]/button"));
		e9.click();
		Thread.sleep(5000);
		
		driver.close();
	}
}
