package aecproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class pageLoadingTimeNewUI {

	public static void main(String[] args) {
		
		//Setting System Properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver_win32_29032022\\chromedriver.exe");
		
		//Opening Chrome Browser in Incognito mode
		ChromeOptions options = new ChromeOptions();
				
		// add Incognito parameter
		options.addArguments("--incognito");
				
		// DesiredCapabilities object
		DesiredCapabilities cap = DesiredCapabilities.chrome();
				
		//set capability to browser
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		//Web driver initialization
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver(cap);
		
		//System.out.println("Opening the Chrome Browser.");
		System.out.println("Opening the Chrome Browser in incognito mode");
		
		//Maximizing the Browser window
		driver.manage().window().maximize();
				
		System.out.println("Browser window maximized.");
		
		//Page Load Time calculation of Website URL New UI
		
		//Starting the Time recording
		long websiteUrlStart = System.currentTimeMillis();
		
		System.out.println("Starting the Time recording: " + websiteUrlStart);
		
		//Opening the Website URL
		driver.get("https://appseconnectnewui.azurewebsites.net/");
		
		//Checking that the Sign In button is displayed after Website URL Page loading
		if (driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed())
			{
				System.out.println("Sign In button is displaying after Website URL Page Loading");
			}
		
		//Stopping the Time recording after Page loading
		long websiteUrlFinish = System.currentTimeMillis();
		
		System.out.println("Stopping the Time Recording after Website Page loading is complete : " + websiteUrlFinish);
		
		//Calculating the Time difference in Milliseconds
		long totalTimems = websiteUrlFinish - websiteUrlStart;
		
		System.out.println("Page Load Time of AEC Website URL is : " + totalTimems + " Milliseconds");
		
		//Calculating the Time difference in Seconds
		long totalTimesec = totalTimems/1000;
	
		//Displaying the Total time taken for Website URL New UI loading
		System.out.println("Page Load Time of AEC Website URL is : " + totalTimesec + " Seconds");
		
		//Page Load Time calculation of AEC Website URL New UI is complete
		

	}

}
