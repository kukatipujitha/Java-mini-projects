//code for services like withdraw deposit
//amount from user input
package com.bank.Account;
import java.util.Scanner;

public class BackAccount {
	 static float balance=10000.00f;
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter service you want withdraw or deposit");
		String service=sc.nextLine();
		if(service.equalsIgnoreCase("withdraw")) {
		System.out.println("enter withdrawing amount");
		float withdrawalamount=sc.nextFloat();
		float updatedBalance=withdraw(withdrawalamount);
		System.out.println(updatedBalance);
		}
		else if(service.equalsIgnoreCase("deposit")){
			System.out.println("enter depositing amount:");
			float depositamount=sc.nextFloat();
			float totalBalance=deposit(depositamount);
			System.out.println("successfully deposited");
			System.out.println("total balance is:"+totalBalance);
			
		}
	}
public static float withdraw(float amount) {
	if (amount%100!=0) {
		System.out.println("unavailable of change notes");
		System.out.println("enter only multiples of hundred:");
		
	}
	else if (amount>balance) {
		System.out.println("insufficient balance");
	}
	else {
    balance=balance-amount;
    System.out.println("successfully amount drawn");
}
	System.out.print("balance amount is:");
	return balance;
}
public static float deposit(float amount) {
	balance+=amount;
	System.out.print("balance:");
			return balance;
}
}
---------------compiler output---------
enter service you want withdraw or deposit
withdraw
enter withdrawing amount
25
unavailable of change notes
enter only multiples of hundred:
balance amount is:10000.0
==============================================
