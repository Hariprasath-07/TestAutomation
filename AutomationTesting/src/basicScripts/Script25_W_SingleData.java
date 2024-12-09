package basicScripts;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Script25_W_SingleData {

	public static void main(String[] args) throws Exception
	{
		XSSFWorkbook book =new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("NewOne");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cel = row.createCell(0);
		cel.setCellValue("Hariprasath");
		
		FileOutputStream fos =new FileOutputStream("./TestData/WritingSingleData.xlsx");
		book.write(fos);
		book.close();
		fos.close();

	}

}
