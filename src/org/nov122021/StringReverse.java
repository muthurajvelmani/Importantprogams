package org.nov122021;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	//String a="muthu";
	System.out.println("enter the string");
Scanner a=new Scanner(System.in);
	String s=a.next();
	String z="";
	for(int i=s.length()-1;i>=0;i--) {
		char c=s.charAt(i);
		z=z+c;
	}
	
	System.out.println(z);
	if(s.equals(z)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}
