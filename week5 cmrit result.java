import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class week5 {
	public static void main(String []args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://cmrithyderabad.edu.in/");
		driver.manage().window().maximize();
		
		WebElement examination=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div/div/div/nav[1]/ul/li[5]/a"));
		examination.click();
		
		WebElement Results=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[3]/div/div/div/div/div/nav[1]/ul/li[5]/ul/li[4]/a"));
		Results.click();
		Thread.sleep(1000);
		
		WebElement btech=driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[3]/ul/li[2]/input"));
		btech.click();
		Thread.sleep(1000);
		
		WebElement r22=driver.findElement(By.xpath("//*[@id=\"R22\"]"));
		r22.click();
		Thread.sleep(1000);
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\"searchKey\"]"));
		search.click();
		search.sendKeys("iii");
		Thread.sleep(1000);
		
		WebElement rd=driver.findElement(By.xpath("//*[@id=\"resultList\"]/a[3]/div"));
		rd.click();
		Thread.sleep(200);
		
		WebElement rn=driver.findElement(By.xpath("//*[@id=\"resultGetForm\"]/input"));
		rn.sendKeys("23r01a05al");
		Thread.sleep(1000);
		
		

	}
}
