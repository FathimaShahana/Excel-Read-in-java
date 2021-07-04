package Excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xdgf.usermodel.XDGFSheet;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcode
{
	static FileInputStream f;//location of file
	static XSSFWorkbook w;//workbook
	static XSSFSheet s;//worksheet
	
	public static String readStringData(int i,int j) throws IOException
	{
		f =new FileInputStream("D:\\Excelfile\\Book1.xlsx"); // to open file
		w=new XSSFWorkbook(f); //create object for xssf workbookclass ,get workbook from file
		s=w.getSheet("sheet1"); //get sheet from workbook
								
		Row r = s.getRow(i);	//get row from sheet, row is interface 
		Cell c=r.getCell(j);	//get cell of that row
		
		return c.getStringCellValue();  //get cell value from cell 
	}
	public static String readIntegerData(int i,int j) throws IOException
	{
		f =new FileInputStream("D:\\Excelfile\\Book1.xlsx");//path SHIFT+rightclick filecreate
														//& use \\in every single slash
		w=new XSSFWorkbook(f);
		s=w.getSheet("sheet1");
		//row is interface 
		Row r=s.getRow(i);//get row
		Cell c=r.getCell(j);//get cell of that row
		
		int a=(int) c.getNumericCellValue();
		return String.valueOf(a);//integer convert to String to return
	}
}
