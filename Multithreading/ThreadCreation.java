package com.Multithreading;

public class ThreadCreation extends Thread


{
  public void run() {
	  System.out.println("Thread start");
	  
  }
	public static void main(String[] args) {
		ThreadCreation t= new ThreadCreation();
		t.start();
	}
	
}
