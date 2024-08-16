package com.oop.overrding;

public class Method_Hidding {
	public static void main(String[] args) {
		d p1= new d();
		p1.marry();
		e e1= new e();
		e1.marry();
		// method hidding
		d d2= new e();
		d2.marry();
	}

}

class d {

	public static void marry() {
		System.out.println("Sublaxmi");
	}
}

class e extends d {
	public static void marry() {
		System.out.println("Child class: katrina");
	}

}
