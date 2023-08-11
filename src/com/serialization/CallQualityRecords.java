package com.serialization;
import java.io.*;
public class CallQualityRecords {

	public void saveCallQualityRecords(CallQuality callQuality)
	{
		 try {
		FileOutputStream fileout=new FileOutputStream(callQuality.getCustomerName()+".dat");
		 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
		 objectout.writeObject(callQuality);
		 objectout.flush();
		 objectout.close();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 catch(IOException e1)
		 {
			 System.out.println(e1);
		 }
	}
	public void displayCallQualityRecords(String name)
	{
		
		try {
			FileInputStream filein =new FileInputStream(name+".dat");
			ObjectInputStream objectin=new ObjectInputStream(filein);
			CallQuality callQuality =(CallQuality)objectin.readObject();
			
			System.out.println("Call Id :"+callQuality.getCallId());
			System.out.println("Call duration :"+callQuality.getCallDuration());
			System.out.println("Call Quality :"+callQuality.getCallQualityGrade());
			System.out.println("Customer Name :"+callQuality.getCustomerName());
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		
		
	}
}
