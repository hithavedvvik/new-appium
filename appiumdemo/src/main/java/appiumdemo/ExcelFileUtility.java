package org.abc.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelFileUtility {
	private Workbook  workbook;
	private FileInputStream fisExcel;
	private FileOutputStream fosExcel;
	public void initialiseExcel(String excelFilePath) throws Throwable, IOException
	{
		
		try
		{
		 fisExcel=new FileInputStream(excelFilePath);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 workbook = WorkbookFactory.create(fisExcel);
	}

	/**
	 * This method will fetch the data from the excel sheet
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @return
	 */
	public String getDataFromExcel(String sheetName,int rownum,int cellnum) 
	{

		Sheet sheet1 = workbook.getSheet(sheetName);
		DataFormatter format=new DataFormatter();
		String data=format.formatCellValue(sheet1.getRow(rownum).getCell(cellnum));

		return data;
	}
	/**
	 * this method is used to write to the excel
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @param value
	 */
	public void setDataIntoExcel(String sheetname,int rownum,int cellnum,String value)
	{
		Sheet sheet = workbook.getSheet(sheetname);
		sheet.getRow(rownum).createCell(cellnum).setCellValue(value);
		System.out.println("data is entered");
	}
	public void saveDataaintoTheExcel(String excelsavepath)
	{
		
		try {
			fosExcel = new FileOutputStream(excelsavepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook.write((fosExcel));
		} catch (IOException e)
		{

			e.printStackTrace();
		}
	}
	public void closeWorkbook()
	{
		try {
			workbook.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	
}


















