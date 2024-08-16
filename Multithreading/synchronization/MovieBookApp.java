package com.Multithreading.synchronization;

public class MovieBookApp extends Thread {
	
	static BookTheaterSeat b;
	int seat;
	public void run() {
		b.bookSeat(seat);
	}
	public static void main(String[] args) {
		b= new BookTheaterSeat();
		MovieBookApp deepak= new MovieBookApp();
		deepak.seat=7;
		deepak.start();
		MovieBookApp amit= new MovieBookApp();
		amit.seat=6;
		amit.start();
	}
	
}
 