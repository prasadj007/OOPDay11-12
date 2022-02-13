package com.bridgelabz.day11;

import java.util.Scanner;
import java.util.Random;
public class BankAccount {

	static String nameOfAccHolder;
	static int accountNum;
	static int password;
	static  double accountBalance=0;


	public static void main(String[] args) {

		int ch; 
		BankAccount obj = new BankAccount();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Banking Services");
		System.out.println("1.OpenAccount\n2.Credit\n3.Debit\n4.Exit");

		do {
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.AccCreate();
				System.out.println("\n1.OpenAccount\n2.Credit\n3.Debit\n4.Exit");
				break;
			case 2:
				obj.credit();
				System.out.println("\n1.OpenAccount\n2.Credit\n3.Debit\n4.Exit");
				break;
			case 3:
				obj.debit();
				System.out.println("\n1.OpenAccount\n2.Credit\n3.Debit\n4.Exit");
				break;
			case 4:
				System.out.println("Exited Successfully");
				break;
			}
		}while(ch<4);


	}



	public void AccCreate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Holder Name:");
		nameOfAccHolder=sc.nextLine();

		Random rd = new Random();
		accountNum=rd.nextInt(1000000);
		System.out.println("Account Created Successfully with Account Num:"+accountNum);
		System.out.println("Account Created  Account Balance is:"+accountBalance);
	} 

	public void credit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Credit amount: ");
		int creditAmount = sc.nextInt();
		accountBalance += creditAmount;
		System.out.println("Account Credited Successfully Account Balance is:"+accountBalance);
	} 

	public void debit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the debit amount: ");
		int debitAmount = sc.nextInt();
		if (debitAmount < accountBalance) {
			accountBalance -= debitAmount;
			System.out.println("Balance After Debit is:"+accountBalance);
		} else {
			System.out.println("Debit amount exceeded account balance.");
		}
	}




}

