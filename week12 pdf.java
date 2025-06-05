import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class week12 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
		WebElement selectfile=driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		selectfile.click();
		
		Thread.sleep(2000);
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str=new StringSelection("C:\\Users\\Moury\\certificates node.docx");
		clip.setContents(str, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement convertbtn=driver.findElement(By.id("processTask"));
		convertbtn.click();
		
		
		

	}

}
