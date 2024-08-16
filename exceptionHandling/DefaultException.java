package com.exceptionHandling;

public class DefaultException {
 public static void main(String[] args) {
	dostuff();
}
 public static void dostuff() {
	 domorestuff();
 }
 public static void domorestuff() {
	 System.out.println(100/0);
 }
}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero: that is default exception
 
 // this below code is information of stack that value store
at durgaSolution/com.exceptionHandling.DefaultException.domorestuff(DefaultException.java:11)
at durgaSolution/com.exceptionHandling.DefaultException.dostuff(DefaultException.java:8)
at durgaSolution/com.exceptionHandling.DefaultException.main(DefaultException.java:5)
*/