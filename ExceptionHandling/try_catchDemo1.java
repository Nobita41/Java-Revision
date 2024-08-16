package com.ExceptionHandling;

public class try_catchDemo1 {
  public static void main(String[] args) {
	System.out.println("Hello world");
	try {
		System.out.println(10/0);
	} catch (ArithmeticException e) {
		System.out.println(e.toString());
	}
	System.out.println("Raj sharma");
}
}
  