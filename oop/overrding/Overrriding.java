package com.oop.overrding;

public class Overrriding {
	 public static void main(String[] args) {
//		p p1= new p();
//		p1.marry();
//		c c1= new c();
//		c1.marry();
		 // overriding method
		p p2= new c();
		p2.marry();
	}
}
class p{
	public void property() {
		System.out.println("Money , fess, and other requirement");
	}
	public void marry() {
		System.out.println("Sublaxmi");
	}
}

class c extends p{
	public void marry() {
		System.out.println("Child class: katrina");
	}
	
}
