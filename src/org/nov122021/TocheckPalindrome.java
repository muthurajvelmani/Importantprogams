package org.nov122021;

import java.util.Scanner;

public class TocheckPalindrome {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc =new Scanner(System.in);
	int a =sc.nextInt();
	int n,i=0,j=0;
	n=a;
	while(a>0) {
	i=a%10;
	j=(j*10)+i;
	a=a/10;
}
	if(n==j) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
}
