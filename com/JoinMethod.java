package com;

public class JoinMethod {

	public static void main(String args[]) {
		// for date 
		String date=String.join("/", "11","09","2021");
		System.out.println("Dtae : "+date);
		
		String time=String.join(":","9","30 AM");
		System.out.println("Time : "+time);
		
		
	}

}
