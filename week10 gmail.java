import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class week10 {

	public static void main(String[] args) throws InterruptedException{	
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.gmail.com");
         driver.manage().window().maximize();
         
         WebElement create=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span"));
         create.click();
         Thread.sleep(1000);
         WebElement per=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]"));
         per.click();
         Thread.sleep(1000);
         
         WebElement Firname=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
         Firname.sendKeys("Shyam");
         Thread.sleep(1000);
         
         WebElement lname=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
         lname.sendKeys("kumar");
         Thread.sleep(1000);
         WebElement next1=driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
         next1.click();
         Thread.sleep(1000);
         WebElement date=driver.findElement(By.xpath("//*[@id=\"day\"]"));
         Thread.sleep(1000);
         date.sendKeys("4");
       
         WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
         Thread.sleep(1000);
         year.sendKeys("2004");
         
         
        WebElement month=(driver.findElement(By.xpath("//*[@id=\"month\"]/div[1]/div[1]/div[1]")));
         month.click();
        Thread.sleep(2000); 
       WebElement mo=driver.findElement(By.xpath("//*[@id=\"month\"]/div[1]/div[2]/ul[1]/li[3]"));
       mo.click();
       Thread.sleep(1000);
       
         WebElement gender=(driver.findElement(By.xpath("//*[@id=\"gender\"]/div[1]/div[1]/div[1]")));
         gender.click();
         Thread.sleep(1000);
         WebElement ge=driver.findElement(By.xpath("//*[@id=\"gender\"]/div[1]/div[2]/ul[1]/li[2]"));
         ge.click();
         Thread.sleep(1000);
         WebElement next2=driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span"));
         next2.click();
         Thread.sleep(1000);
         WebElement btwn=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div/div[1]/div/div[1]/div/div[1]/input"));
         btwn.sendKeys("Shyamkuupi1864");
         Thread.sleep(1000);
         WebElement nextbtn=driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
         nextbtn.click();
         Thread.sleep(1000);
         WebElement setpwd=driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
         setpwd.sendKeys("kumar#123");
         Thread.sleep(1000);
         WebElement cpwd=driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
         cpwd.sendKeys("kumar#123");
         Thread.sleep(1000);
         WebElement next3=driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span"));
         next3.click();   
         
	}

}
