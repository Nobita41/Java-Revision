package com.ExceptionHandling;

public class FinalMethod {
	
	
	public static void main(String[] args) {
		FinalMethod  f1= new   FinalMethod();
				
				f1.m1();
		
	}

	final void m1() {
		System.out.println("Final method");
	}
	public  void  m1(int a, int  b) {
		System.out.println("Can't  be  override");
		
		
	}
	
}
