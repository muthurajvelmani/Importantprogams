package org.nov122021;

public class Desendingorder {
public static void main(String[] args) {
	int a[]= {1,4,7,8,2,5,3,6,9,10};
	int temp=0;
	for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	}
for(int i : a) {
	System.out.print(i+" ");
}

}
}
