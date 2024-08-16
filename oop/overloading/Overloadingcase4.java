package com.oop.overloading;

public class Overloadingcase4 {
 public void m1(int i) {
	 System.out.println("General method");
 }
 public void m1(int... i) {
	 System.out.println("var arg method");
 }
public static void main(String[] args) {
	Overloadingcase4 t= new Overloadingcase4();
	t.m1();
	t.m1(10,20);
	t.m1(10);
}
}
