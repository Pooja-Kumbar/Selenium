package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File abspath = new File("./TestData/data1.xlsx");
        FileInputStream fis = new FileInputStream(abspath);
		
		
		Workbook workbook =WorkbookFactory.create(fis);
		
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");
		String v = sheet.getRow(1).getCell(0).toString();
		System.out.println(v);

	}

}
