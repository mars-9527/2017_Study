package com.qinb.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWirter {
	public static void main(String[] args) {
		String path = "d:/fileTest";
		File f = new File(path);
		if(!f.exists()){
			f.mkdir();
		}
		
		String fileName = "test.java";
		File file = new File(f,fileName);
		if(!file.exists()){
			try{
				file.createNewFile();
				System.out.println("文件创建成功");
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
			out.write("\npackage com.qinb.entiy\n");
			out.newLine();
			out.write("\t\tafasfa");
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
