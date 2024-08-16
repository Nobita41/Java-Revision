package com.oop;

import java.util.Scanner;

public class Atm_project {
public static void main(String[] args) {
		ATM obj= new ATM();
		obj.check();
		
	}
}
	class ATM {
		double balance;
		int pin = 2345;

		public void check() {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your pin");
			int chkpin = sc.nextInt();
			if (pin == chkpin) {
				menu();
			}
		}

		public void menu() {
			System.out.println("enter your choice");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposite Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			Scanner sc = new Scanner(System.in);

			int cho = sc.nextInt();
			if (cho == 1) {
				checkBalance();
				
				menu();
			} else if (cho == 2) {
				depositeMoney();
				menu();
			} else if (cho == 3) {
				withdrawMoney();
				menu();
			} else if (cho == 4) {
				thankyou();
				
			} else {
				System.out.println("Enter correct option");
			}

		}

		public void checkBalance() {
			System.out.println("Balance  : " + balance);
			System.out.println("****************************************************");
		}
		public void depositeMoney() {
			System.out.println("Enter the amount");
			Scanner sc= new Scanner(System.in);
			int dep= sc.nextInt();
			balance= balance+dep;
			System.out.println("Amount Deposite Successfully" );
			checkBalance();
		}
		public void withdrawMoney() {
			System.out.println("Enter the amount");
			Scanner sc= new Scanner(System.in);
			int withd= sc.nextInt();
			if(withd>balance) {
				System.out.println("Insufficant Balance");
			}
			else {
				balance= balance-withd;
				System.out.println("Withdraw Successfully");
				checkBalance();
			}
			
		}
		public void thankyou() {
			System.out.println("Thank You for using our atm machine");
		}
	}

	
	

