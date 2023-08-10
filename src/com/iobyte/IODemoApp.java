package com.iobyte;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		FileOutputStream fs = new FileOutputStream("C:\\myiofiles\\myfile.txt");
		
		String str = "Hello world";
		byte[] bt = str.getBytes();
		
		fs.write(bt);
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
