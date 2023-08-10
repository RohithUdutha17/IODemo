package com.iochar;
import java.io.*;
public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter writer = new PrintWriter("C:\\myiofiles\\empdetails1.txt");
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
			
		
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
