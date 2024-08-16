package com.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {
 public static void main(String[] args) {
	 try {
	PrintWriter pw= new PrintWriter("abc.txt");
	pw.print("Hello");
	 }
	 catch(FileNotFoundException f) {
		 System.out.println("File not found used local file");
	 }
}
}
