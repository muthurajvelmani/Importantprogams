package org.nov122021;

import java.util.Scanner;

public class SwapingNumWithOut3rdparty {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a");
	int a =sc.nextInt();
	System.out.println("enter b");
	int b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Swapping with out 3rd parties");
	System.out.println(a);
	System.out.println(b);
}
}
