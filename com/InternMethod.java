package com;

public class InternMethod {
public static void main(String args[]) {
		
		String s=new String("Hello");
		String s1=new String("Hello");
		String s2="Hello";
		String s3=s.intern();
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		
	}


}
