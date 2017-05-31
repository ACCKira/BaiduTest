package com.common;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class ExcuteFile {
	
	//Open a file
	public void Openfile(String filepath) throws IOException {
		Desktop desk=Desktop.getDesktop();  
		try  
		{  
		    File file=new File(filepath); //创建一个java文件系统  
		    desk.open(file); //调用open（File f）方法打开文件   
		    
		    
		}catch(Exception e)  
		{  
		    System.out.println(e.toString());  
		}
	}
	
	//Upload a file
	public void uploadFie(String filepath) throws IOException {
		String executeFile="C:/Kira/WorkSpace/BaiduTest/src/com/common/uploadFile.exe";
		String cmd= "\""+ executeFile+ "\""+ " "+ "\""+ filepath+ "\"";

		try{
	        Process p= Runtime.getRuntime().exec(cmd);
	        p.waitFor();
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}
	

}
