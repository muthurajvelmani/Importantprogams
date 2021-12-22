package org.nov122021;

import java.util.Scanner;

public class Vowelscount {
public static void main(String[] args) {
System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
int vc=0;
int nvc=0;
for(int i=0;i<st.length();i++) {
	char c = st.charAt(i);
if(c == 'a'|| c =='e'|| c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
 vc=vc+1;
}
else {
	nvc=nvc+1;
}
}
System.out.println("vowels count =  "+vc);
System.out.println("non vowels count = "+nvc);
	
}
}
