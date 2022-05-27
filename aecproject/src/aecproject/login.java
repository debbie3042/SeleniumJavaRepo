package aecproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Selenium Test Case
		
		//Web driver Initialization
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Reading the Username and Password from a Sheet
		
		//File Input Stream to read the File location
		FileInputStream fis = new FileInputStream(".\\datafiles\\Login_Details.xlsx");
		
		//Getting the Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Getting the Sheet of the Workbook
		XSSFSheet sh = wb.getSheet("LoginCred");
		
		//Getting the last row Count in the Sheet
		int rowcount = sh.getLastRowNum();
		
		//Getting the last Cell Count of the first row of the Sheet
		int colcount = sh.getRow(1).getLastCellNum();
		
		//For each Loop to read the Cells of the Sheet
		for(int i=1; i<=rowcount; i++)
		{
			
			XSSFCell cell = sh.getRow(i).getCell(0);
			String celltext="";
			
			CellType type = cell.getCellType();
			
			if(type==CellType.STRING)
			{
				celltext = cell.getStringCellValue();
			}	
			
			//Printing the Username
			System.out.println(celltext);
			
			XSSFCell cell2 = sh.getRow(i).getCell(1);
			String cell2text="";
			
			CellType type2 = cell2.getCellType();
						
			
			if(type2==CellType.STRING)
			{
				cell2text = cell2.getStringCellValue();
			}
			
			if(type2==CellType.NUMERIC)
			{
				double cell2numeric = cell2.getNumericCellValue();
				cell2text = Double.toString(cell2numeric);
				
			}
			
			//Printing the Password
			System.out.println(cell2text);
			
		
		
				
		//Navigating to the Dev Portal
		driver.get("http://devportal.insync.pro/Account/Login?ReturnUrl=%2f#!");
		
		//Maximizing the browser window
		driver.manage().window().maximize();
		
		//Printing the title
		System.out.println(driver.getTitle()+" is the title before login");
		
		//Providing the values for field username and Password and clicking on the Signin button
		driver.findElement(By.id("UserName")).sendKeys("celltext");
		driver.findElement(By.id("Password")).sendKeys("cell2text");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/div[2]/button")).click();
						
		//Printing the Title of the Browser after login
		System.out.println(" This is the title after login");
		
		
		//Just to check the code above is working, printing this line
		System.out.println("The test was found");
		
		/*
		//Getting the File Path
		String excelFilePath = ".\\datafiles\\Login_Details.xlsx";
		
		//Creating the InputStream to read the File
		FileInputStream inputstream = new FileInputStream(excelFilePath);
		
		//Getting the Workbook of the Excel File
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		
		//Getting the Sheet of the Workbook
		XSSFSheet sheet = workbook.getSheet("LoginCred");
		
		//Reading the Row and cell of the Sheet
		Iterator iterator = sheet.iterator();
		
		//Checking Iterator has next record or not
		while (iterator.hasNext())
		{
			XSSFRow row = (XSSFRow) iterator.next();
			
			//Iterate the Cells of the Row
			Iterator celliterator = row.cellIterator();
			
			//Checking Celliterator has next record or not
			while (celliterator.hasNext())
			{
				XSSFCell cell = (XSSFCell) celliterator.next();
				
				//Getting the Datatype of the content of the cell and using condition for each data Type
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue()); break;
				case NUMERIC: System.out.println(cell.getNumericCellValue()); break;
				case BOOLEAN: System.out.println(cell.getBooleanCellValue()); break;
				}
				
				System.out.print(" | ");
			}
			
			System.out.println();
		}
		*/
		
		//Closing the browser window
		//driver.close();
		
		}

	}

}
