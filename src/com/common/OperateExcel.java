package com.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;



public class OperateExcel{
	
	//Read excel
	public List<String> readExcel_SearchKeyword(String filePath,String sheetName) throws Exception{
		List<String> keywords = new ArrayList<String>();
		File f = new File(filePath);
		Workbook rwk = Workbook.getWorkbook(f);
		
		//There are two methods to get sheet: sheet name & index(from 0)		  
        //Sheet st = rwk.getSheet("original");   
        Sheet st = rwk.getSheet(sheetName);
        int stCols = st.getColumns(); //get the number of columns of the sheet
        int stRows = st.getRows();   //get the number of rows of the sheet
        for(int i=0; i < stCols;i++){
        	for (int j = 1; j < stRows; j++){
        		Cell cell = st.getCell(i, j);
        		String cellContent = cell.getContents();
        		keywords.add(cellContent);
        	}
        }
        
        return keywords;
		
	}

}
