package com.selenium.alltopics;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteToExceljxl extends BaseClass
{
  @Test
  public static void writejxl() throws Exception
  {
FileOutputStream fos=new FileOutputStream("F:\\JavaNew\\Testdata\\jxlexport.xls");
WritableWorkbook wwb=Workbook.createWorkbook(fos);
WritableSheet ws= wwb.createSheet("M1", 0);
Label l=new Label(0,0 ,"Manasa");
ws.addCell(l);
//wwb.write();
//wwb.close();
	  

//WritableWorkbook wwb1=Workbook.createWorkbook(fos);
WritableSheet ws1=wwb.createSheet("Sheet2", 1);
Label l1=new Label(0, 2, "Krishna");
ws1.addCell(l1);
wwb.write();
wwb.close();


	  
	   
	  
	  
  }
}
