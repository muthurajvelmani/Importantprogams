package org.nov122021;

import java.util.Scanner;

public class WordReverse {
public static void main(String[] args) {
	//System.out.println("enter the words");
	//Scanner a=new Scanner(System.in) ;
	String s="muthu raj velmani";
	String r=" ";
	String[] sp=s.split("  ");
	for(int i=0;i<sp.length;i++) {
		for(int j=sp[i].length()- 1;j>=0;j--) {
			char c=sp[i].charAt(j);
			 r=r + c;
			 
		}
		r=r + "  ";
		System.out.println(r);
	}
}
}
