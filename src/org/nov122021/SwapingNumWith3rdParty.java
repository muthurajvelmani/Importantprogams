package org.nov122021;
import java.util.Scanner;
public class SwapingNumWith3rdParty {
	public static void main(String[] args) {
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers ");
a=sc.nextInt();
b=sc.nextInt();
c=a;
a=b;
b=c;
System.out.println("the numbers are swapped");
System.out.println(a);
System.out.println(b);
	}
}
