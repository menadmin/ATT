
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

public class week8 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        Thread.sleep(2000);

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("cmrit hyderabad");
        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(30000); 

        WebElement img = driver.findElement(By.xpath("//*[@id=\"hdtb-sc\"]/div/div/div[1]/div/div[2]/a/div"));
        img.click();

        WebElement img1 = driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[2]/div[2]/h3/a/div/div/div/g-img"));
        Actions action = new Actions(driver);
        action.contextClick(img1).build().perform();

        Robot robot = new Robot();
        for (int i = 1; i <= 7; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(2000);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        System.out.println("Downloaded");
        Thread.sleep(3000);
    }
}
