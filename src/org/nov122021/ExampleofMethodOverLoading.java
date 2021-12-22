package org.nov122021;

public class ExampleofMethodOverLoading {
private void empdetails(String name) {
System.out.println("your name is :"+name);
}
private void empdetails(int id,String mail,Long phno) {
	System.out.println("Id is  :"+id);
	System.out.println("Your mail id is : "+mail);
	System.out.println("phonenumber :"+phno);
}
public static void main(String[] args) {
	ExampleofMethodOverLoading e=new ExampleofMethodOverLoading();
	e.empdetails("muthuraj");
	e.empdetails(7894, "muthurajvelmani@gmail.com", 9638527l);
}
}