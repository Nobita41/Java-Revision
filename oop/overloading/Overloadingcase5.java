package com.oop.overloading;

public class Overloadingcase5 {
    
	public void m1(int i, float f) {
		System.out.println("int float version");
	}
	public void m1(float f, int i)	{
		System.out.println("float int version");
	}
	public static void main(String[] args) {
		Overloadingcase5 t= new Overloadingcase5();
		t.m1(12, 12.5f);
		t.m1(12.5f, 10);
		//t.m1(10.5f,10.5f);
	}
}
