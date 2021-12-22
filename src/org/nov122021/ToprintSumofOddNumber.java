package org.nov122021;

public class ToprintSumofOddNumber {
public static void main(String[] args) {
int count=0;
	for(int i=1;i<=50;i++) {
	if(i%2==1) {
		count=count+i;
	}
}
	System.out.println(count);
}
}
