package com.serialization;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallQuality callQuality  =  new CallQuality(1,10,"Excellent","Rohith");
		
		CallQualityRecords callQualityRecords = new CallQualityRecords();
		
		callQualityRecords.saveCallQualityRecords(callQuality);
		callQualityRecords.displayCallQualityRecords(callQuality.getCustomerName());
	}

}
