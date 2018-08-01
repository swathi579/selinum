package pac1;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenFirstRow {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop\\eclipse-java-oxygen-1a-win32-x86_64\\eclipse\\selenium project\\src\\pac1\\test.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("sheet1");
	int rowcount=sh.getLastRowNum();
	for(int i=0;i<rowcount;i++) {
		Row row1=sh.getRow(i);
		
		String colData=row1.getCell(0).getStringCellValue();
		System.out.println(colData);
	}
}
}
