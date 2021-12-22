package org.nov122021;

public class MethodOverriddigBclasss extends MethodOverriddingAclassss {
public void camera() {
System.out.println("pixel is 5mp");	
}
public void memory() {
	System.out.println("memory is 12gb");

}
public static void main(String[] args) {
MethodOverriddingAclassss cell=new MethodOverriddigBclasss();
cell.camera();
cell.memory();
}
}
