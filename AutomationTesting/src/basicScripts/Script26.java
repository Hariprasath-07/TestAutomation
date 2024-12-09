package basicScripts;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script26 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a =new ChromeDriver();
		a.manage().window().maximize();
		a.get("https://www.flipkart.com");
		List<WebElement> links = a.findElements(By.xpath("//a"));
		int noOfLinks = links.size();
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("FlipkartLink");
		for (int i = 0; i < noOfLinks; i++) 
		{
			WebElement link = links.get(i);
			String output = link.getAttribute("href");
			XSSFRow row = sheet.createRow(i);
			XSSFCell cel = row.createCell(0);
			
			cel.setCellValue(output);
			
		}
		
		FileOutputStream fos =new FileOutputStream("./TestData/FlipkartLink.xlsx");
		book.write(fos);
		book.close();
		fos.close();
	}

}
