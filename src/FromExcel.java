import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcel {
	
	
	public void getfile() {
		
		
	String filePath = System.getProperty("user.dir")+"\\test.xlsx";
	
	try {
		FileInputStream fileStream = new FileInputStream(filePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(); 
		
		XSSFSheet sheet = workbook.getSheet("Sheet1"); 
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	
	
	}

}
