package Special_Programs;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader
{
	public static void main(String[] args) throws IOException
	{		
		FileInputStream fis = new FileInputStream("E:\\DRIVER\\Excel_Demo.xlsx");
		XSSFWorkbook excel = new XSSFWorkbook(fis);
		XSSFSheet sheet= null;
		int rownum = 0;
		int colnum = 0;
		int NumberofSheets = excel.getNumberOfSheets();
		for(int i=0; i<NumberofSheets; i++)
		{
			sheet = excel.getSheetAt(i);
			rownum = sheet.getLastRowNum();
			colnum = sheet.getRow(i).getLastCellNum();
		}
		for(int j=1; j<=rownum; j++)
		{
			XSSFRow currentrow = sheet.getRow(j);
			for(int k=0; k<colnum; k++)
			{
			System.out.print(currentrow.getCell(k).toString()+"    ");	
			}
			System.out.println();
		}
		excel.close();
	}

}
