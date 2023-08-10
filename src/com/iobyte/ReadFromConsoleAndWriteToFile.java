package com.iobyte;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromConsoleAndWriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
		FileOutputStream fos = new FileOutputStream("C:\\myiofiles\\buginfo.dat");
		InputStream in = System.in;
		
		byte[] bt1 = new byte[20];
		byte[] bt2 = new byte[20];
		byte[] bt3 = new byte[20];
		
		System.out.println("Enter Dev name ");
		in.read(bt1);
		System.out.println("Enter bug no ");
		in.read(bt2);
		System.out.println("Enter bug description ");
		in.read(bt3);
		
		fos.write(bt1);
		fos.write(bt2);
		fos.write(bt3);
		
		fos.flush();
		fos.close();
		
		
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
