package aecproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class simpleLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a WebDriver instance and open the URL
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser window
		driver.manage().window().maximize();

		// Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// To launch the Homepage
		String homepage = "http://stageportal.insync.one/";
		driver.get(homepage);

		// Providing the values for field Username and Password and clicking on the
		// Sign in button
		// Logging with Super Admin Role
		driver.findElement(By.id("UserName")).sendKeys("debashree.p@insync.co.in");
		driver.findElement(By.id("Password")).sendKeys("efgh.1234");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/div[2]/button")).click();

		// Navigating to the Org Dashboard section
		String orgdashboardurl = "http://stageportal.insync.one/OrganizationDashboard/Details?orgId=326e12f1-81b2-4890-a2fb-564dbe2388d6";
		driver.get(orgdashboardurl);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// Navigating to the Org ProcessFlow Listing section
		String orgpflisting = "http://stageportal.insync.one/ProcessFlow/?orgId=326e12f1-81b2-4890-a2fb-564dbe2388d6";
		driver.get(orgpflisting);
		driver.get(orgpflisting);

		System.out.println("URL is: \t" + orgpflisting);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'Process Flow')]")).click();
		
		System.out.println("Clicked on PF");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String pflink = "http://stageportal.insync.one/ProcessFlow/Create?orgId=326e12f1-81b2-4890-a2fb-564dbe2388d6&workflowId=e1075a5d-2e12-4098-b574-ab003eb5d890";
		driver.get(pflink);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement canvas = driver.findElement(By.xpath("//canvas[@width='1123']"));
				
				//Dimension canvasdimension
		Actions builder = new Actions(driver);
		
		Action canvasclick = builder
                .moveToElement(canvas)
                .build();
		
		canvasclick.perform();
		
		System.out.println("Cliked on the Canvas");
		

	}

}
