package data_driver_Testing;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_SingleData {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream f = new FileInputStream("./TestData/FacebookCredentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(f);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cel = row.getCell(0);
		String usn_data = cel.getStringCellValue();
		
		//System.out.println(val);
		
		XSSFCell cel1 = row.getCell(1);
		String pwd_data = cel1.getStringCellValue();
		
		//System.out.println(val);
		
		workbook.close();
		f.close();
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver ad = new ChromeDriver();
		ad.manage().window().maximize();
		Thread.sleep(2000);
		ad.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement usn = ad.findElement(By.id("email"));
		usn.sendKeys(usn_data);
		Thread.sleep(2000);
		WebElement psw = ad.findElement(By.id("pass"));
		psw.sendKeys(pwd_data);
		Thread.sleep(2000);
		WebElement lgn = ad.findElement(By.cssSelector("button[type='submit']"));
		lgn.click();
		
	}

}
