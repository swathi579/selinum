package pac1;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop\\eclipse-java-oxygen-1a-win32-x86_64\\eclipse\\selenium project\\src\\pac1\\test.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("sheet1");
		Row row1=sh.getRow(1);
		Cell cel=row1.getCell(2);
		String custName=cel.getStringCellValue();
	
				System.out.println(custName);
				
		wb.close();
		
		

	}

}
