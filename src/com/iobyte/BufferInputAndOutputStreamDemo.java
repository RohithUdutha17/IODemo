package com.iobyte;
import java.io.*;
public class BufferInputAndOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		FileOutputStream fos = new FileOutputStream("C:\\myiofiles\\devinfo.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fos);
		String devName = "DevName : Rohith\n";
		String bugNo = "bugNo : 1\n";
		String bugInfo = "bugName : authentication error";
		
		bout.write(devName.getBytes());
		bout.write(bugNo.getBytes());
		bout.write(bugInfo.getBytes());
		bout.flush();
		bout.close();
		
		FileInputStream fin = new FileInputStream("C:\\myiofiles\\devinfo.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		byte[] bt = new byte[bin.available()];
		
		bin.read(bt);
		bin.close();
		System.out.println(new String(bt));
		
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
