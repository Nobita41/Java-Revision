package com.Multithreading.synchronization;

public class BookTheaterSeat {

	int totoal_seat=10;
	synchronized	void bookSeat(int seat) {
			if(totoal_seat >= seat) {
				System.out.println("seat booked successfully");
				totoal_seat= totoal_seat-seat;
				System.out.println("Seats left:" + totoal_seat);
			}
			else
			{
				System.out.println("Seat can not be booked");
				System.out.println("Totoal seat left:" + totoal_seat);
				}
		}
}
