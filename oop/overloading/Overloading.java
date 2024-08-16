package com.oop.overloading;

public class Overloading {
 public void  m1() {
	 System.out.println("Integer type");
 }
 public void  m1(long f) {
	 System.out.println("Long type");
 }
 public static void main(String[] args) {
	Overloading o1= new Overloading();
	o1.m1(23233);
	o1.m1();
	o1.m1(256l );
}
}
