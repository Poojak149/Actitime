package com.actitime.generic.library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This Class is a generic class deasigned to read data from external resource file 
 * @author Dell
 *
 */
public class FileLibrary {
	/**
	 * This Class is a generic class deasigned to read data from  property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Testdata/commondeta.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty(key);
		return url;
	}
	/**
	 * This Class is a generic class deasigned to read data from  Excel file
	 * @param Sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException{
		FileInputStream fis1=new FileInputStream("./Testdata/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String data = wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
}
