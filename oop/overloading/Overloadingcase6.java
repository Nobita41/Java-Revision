package com.oop.overloading;

public class Overloadingcase6 {

	public void m1(Animal a) {
		System.out.println("Animal version");
	}
	public void m1(monkey m) {
		System.out.println("Monkey version");
	}
	public static void main(String[] args) {
		Overloadingcase6 t = new Overloadingcase6();
		Animal a = new Animal();
		t.m1(a);
		monkey m2= new monkey();
		t.m1(m2);
		// monkey version
		Animal a3= new monkey();
		t.m1(a3);
	}
	
	
}
 class Animal{
	 
 }

 class monkey extends Animal{
	 
 }