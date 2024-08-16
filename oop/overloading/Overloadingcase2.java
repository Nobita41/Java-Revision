package com.oop.overloading;

public class Overloadingcase2 {
	 public void m1(Object o) {
		 System.out.println("Object Version");
	 }
	 public void m1(String s) {
		 System.out.println("String version");
	 }
	 public static void main(String[] args) {
		 Overloadingcase2 t = new Overloadingcase2();
		 t.m1(new Object());
		 t.m1("Raj");
		 t.m1(null);
		 
	}
}
