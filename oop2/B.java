package com.oop2;

import com.oop.Protected_class_pack1;

public class B extends Protected_class_pack1{
	
		 public static void main(String[] args) {
				Protected_class_pack1 p1= new Protected_class_pack1();
				//p1.m1();
				
				B b1= new B();
				b1.m1();
				Protected_class_pack1 p2 = new B();
				//p2.m1();
	}  

}
 