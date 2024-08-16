package com.oop.constructor;

public class ConstructorDemo {
 String name;
  int rollno;
  ConstructorDemo(String name, int rollno) {
	
	this.name = name;
	this.rollno = rollno;
}
  public ConstructorDemo() {
	// TODO Auto-generated constructor stub
} 
  public static void main(String[] args) {
	  ConstructorDemo s1= new ConstructorDemo("Durga", 101);
	  ConstructorDemo s2= new ConstructorDemo("raj", 104);
	  System.out.println(s1.name + " "+ s1.rollno);
	  System.out.println(s2.name + " "+ s2.rollno);
}
  
}
