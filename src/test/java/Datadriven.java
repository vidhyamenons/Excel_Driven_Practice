/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;


public class Datadriven {
//public ArrayList<String> getData (String testcasename) throws IOException
{
	ArrayList<String> a=new ArrayList<String>();
	FileInputStream fis =new FileInputStream("C:\\Users\\Rajeev\\Desktop\\Docs\\vsm\\SELENIUM\\Demo1.xlsx");
	HSSFWorkbook workbook=new HSSFWorkbook(fis);
	
	int sheets=workbook.getNumberOfSheets();
	for(int i=0;i<sheets;i++)
	{
		
		if(workbook.getSheetName(i).equalsIgnoreCase("Testdata"))
		{
		HSSFSheet sheet=workbook.getSheetAt(i);
		
		Iterator<Row> rows = sheet.iterator();//number of rows
		Row firstrow = rows.next();
		Iterator<Cell> cell = firstrow.cellIterator();//number of coloumns
		int k=0;
		int coloumn=0;
		while(cell.hasNext())
		{
			Cell value=cell.next();
			if(value.getStringCellValue().equalsIgnoreCase("Test cases"));
			{
			coloumn=k;
			}
		
		k++;
		
	}
		System.out.println(coloumn);
		
		while(rows.hasNext())
		{
			Row r = rows.next();
			if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("Purchase"));
			{
				Iterator<Cell> cv = r.cellIterator();
				while(cv.hasNext())
				{
					Cell c=cv.next();
					if(c.getCellTypeEnum()==CellType.STRING)
					{
					
			a.add(c.getStringCellValue());
			}
					else
					{
						a.add(NumberToTextConverter.toText((c.getNumericCellValue())));
						
					}
					
	}
				//return a;
}

	}return a;
		}}
	
	
	
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	}
	}
*/