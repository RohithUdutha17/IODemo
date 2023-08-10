package com.iochar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterAndBufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("C:\\myiofiles\\empdetails2.txt");
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			String empName = "EmployeeName : Peter\n";
			String dept = "Department : Sales\n";
			String designation = "Designation : Manager\n";
			String salary = "Salary : 35000";
			bwriter.write(empName);
			bwriter.write(dept);
			bwriter.write(designation);
			bwriter.write(salary);
			bwriter.flush();
			bwriter.close();
			
			FileReader reader = new FileReader("C:\\myiofiles\\empdetails.txt");
			BufferedReader breader = new BufferedReader(reader);
			char[] cstr = new char[200];
			
			breader.read(cstr);
			
			System.out.println(cstr);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
