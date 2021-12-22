package org.nov122021;

import java.util.Scanner;

public class CountOfCapitalSmallOthers {
public static void main(String[] args) {
	
//	Scanner sc =new Scanner(System.in);
	String st="MuthuRaj@8$%#5154.nf545";
	System.out.println(st);
	System.out.println("total char "+st.length());
	for(int i=0;i<st.length();i++) {
		char ct = st.charAt(i);
	if(Character.isUpperCase(ct)) {
		System.out.print(ct);	
	}
	}
	System.out.println();
System.out.println();
for(int j=0;j<st.length();j++) {
	char ct1 = st.charAt(j);
if(Character.isLowerCase(ct1)) {
	System.out.print(ct1);
}
}
System.out.println();
for(int k=0;k<st.length();k++) {
	char ct2 = st.charAt(k);
	if(Character.isDigit(ct2)) {
		System.out.print(ct2);
	}
}
System.out.println();
int cc=0;
int lc=0;
int dc=0;
int num=0;
for(int i=0;i<st.length();i++) {
	char c = st.charAt(i);
if(Character.isUpperCase(c)) {
	cc=cc+1;
}
else if(Character.isLowerCase(c)) {
	lc=lc+1;
}
else if(Character.isDigit(c)) {
	dc=dc+1;
}
else
{
	num=num+1;
}
}

System.out.println("uppercase count"+ cc);
System.out.println("lower case count"+lc);
System.out.println("digit count "+ dc);
System.out.println("special char count "+ num);

}
}
