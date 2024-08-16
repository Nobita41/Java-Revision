package com.Multithreading;


// Thread creation using Runnable method
public class RunnableThreadCreation implements Runnable {
	
	public void run() {
		System.out.println("Runnable method start using thread");
	}
	
	public static void main(String[] args) {
		RunnableThreadCreation t = new RunnableThreadCreation();
		Thread th= new Thread(t);
		th.start();
	}
}
