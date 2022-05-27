package aecproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageLoadingTime {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Setting System Properties for Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		
		//Opening Chrome Browser in Incognito mode
		ChromeOptions options = new ChromeOptions();
		
		// add Incognito parameter
		options.addArguments("--incognito");
		
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		// DesiredCapabilities object
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		
		//set capability to browser
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		
		//Web driver initialization
		//WebDriver driver = new ChromeDriver();
		//@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(cap);
		
		System.out.println("Opening the Chrome Browser in Incognito mode");
				
				
		//Maximizing the Browser window
		driver.manage().window().maximize();
		
		System.out.println("Browser window maximized.");
		
		//Page Load Time calculation of Website URL
		
			//Starting the Time recording
			long websiteUrlStart = System.currentTimeMillis();
			
			System.out.println("Starting the Time recording for Website URL Loading: " + websiteUrlStart);
		
			//Opening the Website URL
			driver.get("http://stageportal.insync.one/Account/Login?ReturnUrl=%2f#!");
			
			System.out.println("Opening the Website URL.");
			
			//Checking that the Document Ready State is complete
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String state = js.executeScript("return document.readyState").toString();
			
			System.out.println("The Document Ready state is: " + state);
			
			
			if (state.equals("complete"))
			{
				System.out.println("Initial HTML document of Login Page URL has been completely loaded and parsed.");
			}
		
			
			//Checking that the Sign In button is displayed after Website URL Page loading
			if (driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed())
				{
					System.out.println("Sign In button is displaying after Website URL Page Loading");
				}
			
			//else
				//{
					//System.out.println("Sign In button is NOT displaying after Website URL Page Loading");
				//}
		
			//Stopping the Time recording after Page loading
			long websiteUrlFinish = System.currentTimeMillis();
			
			System.out.println("Stopping the Time Recording after Website Page loading is complete : " + websiteUrlFinish);
			
			//Calculating the Time difference in Milliseconds
			long totalTimems = websiteUrlFinish - websiteUrlStart;
			
			System.out.println("Page Load Time of AEC Website URL is : " + totalTimems + " Milliseconds");
		
			//Calculating the Time difference in Seconds
			long totalTimesec = totalTimems/1000;
		
			//Displaying the Total time taken for Website URL Page loading
			System.out.println("Page Load Time of AEC Website URL is : " + totalTimesec + " Seconds");
			
			//Page Load Time calculation of AEC Website URL is complete
		
		//Page Load Time calculation after Login
			
			//Page Load Time Calculation of Dashboard Page is starting
			
			//Providing the Username in the Login Page
			String uname = "frankfiji@yopmail.com";
			driver.findElement(By.id("UserName")).sendKeys(uname);
			
			System.out.println("The Username has been provided: " + uname);
		
			//Providing the Password in the Login Page
			String pwd = "abcd.1234";
			driver.findElement(By.id("Password")).sendKeys(pwd);
			
			System.out.println("The Password has been provided: " + pwd);
			
			//Starting the Time recording
			long afterLoginStart = System.currentTimeMillis();
			
			System.out.println("Starting the Time Recording before User clicks on the Sign In button: " + afterLoginStart);
		
			//Clicking on the SignIn button
			driver.findElement(By.xpath("//div/button[contains(text(),'Sign In')]")).click();
			
			System.out.println("Clicked on the Sign In button.");
			
			//Checking that the Document Ready State is complete
			String dashboardstate = js.executeScript("return document.readyState").toString();
			
			System.out.println("The Document Ready state is: " + dashboardstate);
						
			if (dashboardstate.equals("complete"))
				{
					System.out.println("Initial HTML document of Dashboard Page has been completely loaded and parsed.");
				}
			
		
			//Checking that the User Name is displayed after login
			String name = driver.findElement(By.xpath("//a/span[contains(text(),' Frank Leonard  ')]")).getText();
			
			//Displaying the User Name after Login
			System.out.println("The Name of the User is: " + name);
			
			//Checking the Dashboard text is displayed in the Dashboard Page after Login
			if (driver.findElement(By.xpath("//div/h3[@class='page-title']")).isDisplayed())
				{
					System.out.println("Dashboard text is displaying after User Login");
				}
			
			//else
				//{
					//System.out.println("Dashboard text is NOT displaying after User Login");
				//}
			
					
			//Stopping the Time recording after login
			long afterLoginFinish = System.currentTimeMillis();
			
			System.out.println("Stopping the Time Recording after Dashboard page has loaded: " + afterLoginFinish);
			
			//Calculating the Time difference in Milliseconds
			long dasboardPageLoadTimems = afterLoginFinish - afterLoginStart;
			
			System.out.println("Page Load Time of Dashboard Page is : " + dasboardPageLoadTimems + " Milliseconds");
		
			//Calculating the Time difference in Seconds
			long dasboardPageLoadTime = dasboardPageLoadTimems/1000;
		
			//Displaying the Total time taken for Dashboard Page to load after Login
			System.out.println("Page Load Time of Dashboard Page after Login is : " + dasboardPageLoadTime + " Seconds");
			
			//Page Load Time Calculation of Dashboard Page is completed
			
			
		//Navigating to Project Page
		driver.findElement(By.xpath("//a[@title='Fiji Waters Inc']/div[contains(text(),'Fiji Waters Inc')][1]")).click();
		
		System.out.println("Clicked on the Project Fiji Waters");
			
			//Page Load Time Calculation of ProcessFlow Listing Page is starting
		
			//Starting the Time recording
			long pfListingStart = System.currentTimeMillis();
		
			System.out.println("Starting the Time Recording before User clicks on the Designer option in Menu: " + pfListingStart);
			
			//Clicking on the Designer option in Menu
			driver.findElement(By.xpath("//span[@class='title' and contains(text(),'Designer')]")).click();
			
			System.out.println("Clicked on the Designer option in Menu");
			
			//Clicking on the ProcessFlow option in Menu
			driver.findElement(By.xpath("//span[@class='title' and contains(text(),'Process Flow')]")).click();
			
			System.out.println("Clicked on the ProcessFlow option in Menu");
			
			
			//Checking that the Document Ready State is complete
			String pfListingstate = js.executeScript("return document.readyState").toString();
			
			System.out.println("The Document Ready state is: " + pfListingstate);
						
			if (pfListingstate.equals("complete"))
				{
					System.out.println("Initial HTML document of ProcessFlow Listing Page has been completely loaded and parsed.");
				}
			
			
			// explicit wait - to wait for the ProcessFlow Text to be visible
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='caption font-dark']/span[@class='caption-subject' and contains(text(),'Process Flow')]")));
			
			if (driver.findElement(By.xpath("//div[@class='caption font-dark']/span[@class='caption-subject' and contains(text(),'Process Flow')]")).isDisplayed())
			{
				System.out.println("ProcessFlow Folder Name is displaying after clicking on the ProcessFlow option in Menu.");
			}
		
			//Stopping the Time recording after ProcessFlow Listing page has loaded
			long pfListingFinish = System.currentTimeMillis();
			
			System.out.println("Stopping the Time Recording after ProcessFlow Listing page has loaded: " + pfListingFinish);
			
			//Calculating the Time difference in Milliseconds
			long pfListingPageLoadTimems = pfListingFinish - pfListingStart;
			
			System.out.println("Page Load Time of ProcessFlow Listing Page is : " + pfListingPageLoadTimems + " Milliseconds");
		
			//Calculating the Time difference in Seconds
			long pfListingPageLoadTime = pfListingPageLoadTimems/1000;
		
			//Displaying the Total time taken for ProcessFlow Listing Page to load after Login
			System.out.println("Page Load Time of ProcessFlow Listing Page is : " + pfListingPageLoadTime + " Seconds");
			
			//Page Load Time Calculation of ProcessFlow Listing Page is completed
			
			
			//Page Load Time Calculation of Environment Page is starting
			
			//Starting the Time recording
			long envStart = System.currentTimeMillis();
			
			System.out.println("Starting the Time Recording before User clicks on the Deploy option in Menu: " + envStart);
			
			//Clicking on the Deploy option in Menu
			driver.findElement(By.xpath("//a/span[@class='title' and contains(text(),'Deploy')]")).click();
			
			System.out.println("Clicked on the Deploy option in Menu");
			
			//Clicking on the Environments option in Menu
			driver.findElement(By.xpath("//a/span[@class='title' and contains(text(),'Environments')]")).click();
			
			System.out.println("Clicked on the Environments option in Menu");
			
			
			//Checking that the Document Ready State is complete
			String envstate = js.executeScript("return document.readyState").toString();
			
			System.out.println("The Document Ready state is: " + envstate);
						
			if (envstate.equals("complete"))
				{
					System.out.println("Initial HTML document of Environment Page has been completely loaded and parsed.");
				}
			
			
			
			// explicit wait - to wait for the On-Premise Text to be visible
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/span[@class='caption-subject' and contains(text(),'On-Premise')]")));
			
			if (driver.findElement(By.xpath("//div/span[@class='caption-subject' and contains(text(),'On-Premise')]")).isDisplayed())
			{
				System.out.println("On-Premise Text is displaying after clicking on the Environments option in Menu.");
			}
			
			//Stopping the Time recording after ProcessFlow Listing page has loaded
			long envFinish = System.currentTimeMillis();
			
			System.out.println("Stopping the Time Recording after the Environments page has loaded: " + envFinish);
			
			//Calculating the Time difference in Milliseconds
			long envPageLoadTimems = envFinish - envStart;
			
			System.out.println("Page Load Time of the Environments Page is : " + envPageLoadTimems + " Milliseconds");
			
			//Calculating the Time difference in Seconds
			long envPageLoadTime = envPageLoadTimems/1000;
		
			//Displaying the Total time taken for Environment Page to load after Login
			System.out.println("Page Load Time of the Environments Page is : " + envPageLoadTime + " Seconds");
			
			//Page Load Time Calculation of Environment Page is completed
			
			
			
			
		//Closing the Browser window	
		driver.quit();

	}

}
