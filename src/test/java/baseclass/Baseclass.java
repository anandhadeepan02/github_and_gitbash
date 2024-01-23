package baseclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;

public class Baseclass {
	public static WebDriver driver=null;
public static	WebDriverWait wait;

	
	public void openbrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.cheapair.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(50));
		}
	
	public static void input_data(WebElement element,String data)
	{
		element.clear();
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		element.sendKeys(data);
	//	element.sendKeys(Keys.chord(Keys.ARROW_DOWN.ENTER));
	}
	public static void date(WebElement element,String data) {
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	element.sendKeys(data);
	element.sendKeys(Keys.TAB);
	}
	
	public static void click(WebElement element)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.click();
		
	}
public static void handlewindow() {
	Set<String> no_of_window=driver.getWindowHandles();
	List<String> list=new ArrayList<String>(no_of_window);
	//driver.switchTo().window(list.get(0));
	driver.switchTo().window(list.get(1));
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	int total=no_of_window.size();
	System.out.println(total);
	
}
}
  