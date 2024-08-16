package com.oop;

public class SingleLevelInheritance {
	public static void main(String[] args) {
		C c1 = new C();
		c1.m1();
		c1.m2();
	}

}
class A{
	public void m1() {
		System.out.println("Parents class");
	}
}
class C extends A{
	public void m2(){
		System.out.println("Child class");
	}
}
