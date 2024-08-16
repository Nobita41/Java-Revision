package com.collectionframework;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l1= new LinkedList();
		l1.add("Raj ");
		l1.add(30);
		l1.add(null);
		l1.set(0, "Software");
		l1.add(0,"Venky");
		l1.removeLast();
		l1.addFirst("CCC");
		System.out.println(l1);
	}

}
