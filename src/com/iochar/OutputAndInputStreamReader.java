package com.iochar;
import java.io.*;

public class OutputAndInputStreamReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("C:\\myiofiles\\empdetails3.txt"));
			String empName = "EmployeeName : Peter\n";
			String dept = "Department : Sales\n";
			String designation = "Designation : Manager\n";
			String salary = "Salary : 35000";
			writer.write(empName);
			writer.write(dept);
			writer.write(designation);
			writer.write(salary);
			writer.flush();
			writer.close();
			
			InputStreamReader reader = new InputStreamReader(new FileInputStream("C:\\myiofiles\\empdetails.txt"));
			
			
			char[] cstr = new char[200];
			
			reader.read(cstr);
			
			System.out.println(cstr);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
