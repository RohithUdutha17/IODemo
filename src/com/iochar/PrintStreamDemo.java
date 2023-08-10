package com.iochar;

import java.io.*;
public class PrintStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		PrintStream writer = new PrintStream(new FileOutputStream("C:\\myiofiles\\formatter.txt"));
		writer.format("Hello %s,You are %d years old","Rohith",20);
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
