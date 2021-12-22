package org.nov122021;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Numbers");
		int n=sc.nextInt();
		int a=n;
		int i=0,j=0;
		while(a>0) {
			i=a%10;
	  j=(j * 10)+i;
	  a=a/10;
		}
		System.out.println(j);
	}

}
