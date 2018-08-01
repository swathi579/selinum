package pac1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenRead {

	public static void main(String[] args) throws Throwable {

FileInputStream fis=new FileInputStream("//selenium project//testng.xml");
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("sheet1");
Row row1=sh.getRow(1);
Cell cel=row1.createCell(5);
cel.setCellValue("PASS");
FileOutputStream fos=new FileOutputStream("/z/selenium project//testng.xml");
wb.write(fos);
wb.close();
	}

}
