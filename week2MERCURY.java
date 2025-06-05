import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class week2 {
	public static void main(String []args) throws InterruptedException{
		System.setProperty("Webdriver chrome.driver","C:\\Users\\student\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		Actions actions=new Actions(driver);
		WebElement login=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
		actions .moveToElement(login).build().perform();
		WebElement Register=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
		Register.click();
		Thread.sleep(2000);
		WebElement FirstName=driver.findElement(By.name("first_name"));
		FirstName.sendKeys("Mourya");
		Thread.sleep(2000);
		WebElement LastName=driver.findElement(By.name("last_name"));
		LastName.sendKeys("Goguri");
		Thread.sleep(2000);
		WebElement EmailAddress=driver.findElement(By.id("acc_user_email"));
		EmailAddress.sendKeys("mourya123@gmail.com");
		Thread.sleep(2000);
		WebElement Set_a_Password=driver.findElement(By.id("acc_user_password"));
		Set_a_Password.sendKeys("12345");
		Thread.sleep(2000);
		WebElement ConfirmPassword=driver.findElement(By.id("acc_user_passconf"));
		ConfirmPassword.sendKeys("12345");
		Thread.sleep(2000);
		WebElement MobileNumber=driver.findElement(By.id("acc_mobile_no"));
		MobileNumber.sendKeys("5654464646");
		Thread.sleep(2000);
		WebElement Reg_Button=driver.findElement(By.xpath("//*[@id=\"modalUserLogin\"]/div/div/div[2]/form/button"));
		Reg_Button.click();
		Thread.sleep(2000);
		driver.close();
	}
}

