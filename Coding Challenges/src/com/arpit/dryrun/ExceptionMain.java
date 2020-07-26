package com.arpit.dryrun;



/*
 * 						Throwable 
 * 							|
 * 				Exception		Error
 */

public class ExceptionMain {
	
	public static void main(String[] args) throws Exception{

		try (java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream("D:\\Arpit\\Home\\abc.txt")) {
			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} 
	}
}


