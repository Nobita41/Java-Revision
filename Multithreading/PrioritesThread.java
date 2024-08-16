package com.Multithreading;

public class PrioritesThread extends Thread {
	public static void main(String[] args) {
		
		System.out.println("Main thred:");
		System.out.println("Main thred priorites :"+ Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		PrioritesThread p = new PrioritesThread();
		p.start();
//		p.setPriority(10);
	}
	public void run() {
		System.out.println("Child thread");
		System.out.println("Child thred priorites :"+ Thread.currentThread().getPriority());
	}
	
	
}
