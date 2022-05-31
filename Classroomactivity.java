package assignment3.weekday1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.remote.http.WebSocket;
import java.util.concurrent.TimeUnit;

public class Classroomactivity 
{

	public static void main(String[] args) 
	{
		//Set up Chrome driver
		WebDriverManager.chromedriver().setup();

		//Opening the Chrome
		ChromeDriver driver=new ChromeDriver();

		//load the URL:
		driver.get("http://www.leafground.com/pages/Link.html");

		//maximize the browser window
		driver.manage().window().maximize();

		//get all the links
		List<WebElement> all=driver.findElements(By.tagName("link"));
		driver.findElements(By.partialLinkText(null))
		System.out.println(all.size());
		System.out.println(all.get(0));
	}

}
