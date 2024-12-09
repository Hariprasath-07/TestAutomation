package ajio_title;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testcase01 extends genericScript
{
	
	@Test
	public void title() throws Exception
	{
		List<WebElement> alltitles = ref.findElements(By.xpath("//a"));
		int count = alltitles.size();
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet();
		for(int i=0; i<count; i++)
		{
			WebElement singletitle = alltitles.get(i);
			String value = singletitle.getAttribute("title");
			XSSFRow row = sheet.createRow(i);
			XSSFCell coloumn = row.createCell(0);
			coloumn.setCellValue(value);
		}
		
		FileOutputStream fos = new FileOutputStream("./TestData/ajio_titles.xlsx");
		book.write(fos);
		book.close();
		fos.close();
	}
}
