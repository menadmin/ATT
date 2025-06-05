import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week7 {
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("Webdriver chrome.driver","C:\\Users\\student\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com//");
		WebElement searchBar=driver.findElement(By.name("q"));
		searchBar.sendKeys("CMRIT");
		searchBar.sendKeys(Keys.ENTER);
		driver.quit();
	}

}
