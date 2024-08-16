package com.oop.overloading;

public class Overloadingcase3 {
	public void m1(String s) {
		System.out.println("String version");

	}

	public void m1(StringBuffer sb) {
		System.out.println("StringBuffer ");
	}

	public static void main(String[] args) {
			Overloadingcase3 o1= new Overloadingcase3();
			o1.m1("raj");
			o1.m1(new StringBuffer("mohan"));
			//o1.m1(null);
	}
}
