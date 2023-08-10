package com.iobyte;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ReadFromFileAndWriteToConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis = new FileInputStream("C:\\myiofiles\\buginfo.dat");
		
		OutputStream out = System.out;
		
		byte[] bt = new byte[fis.available()];
		
		fis.read(bt);
		
		out.write(bt);
		
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
