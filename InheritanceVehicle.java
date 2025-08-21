// program using inheritance concept to buy a vehicle online
//user input
package com.Practice;
import java.util.Scanner;
class Vehicle{
	Scanner scan=new Scanner(System.in);
	String name; 
	String brand;
	String color;
	int mileage;
	int doors;
	int wheels;
	long amount;
	void info() {
		System.out.println("enter the no of wheels of the vehicle");
		wheels=scan.nextInt();
		if(wheels ==2) {
			System.out.println("bike or cycle");
			amount=100000;
		}
		else if(wheels==3) {
			System.out.println("auto");
			amount=150000;
		}
		else if(wheels==4) {
			System.out.println("car or tempo ");
			amount=200000;
		}
		else {
			System.out.println("big vehicle like lorry ,bus");
			amount=500000;
		}
		System.out.println("enter the brand of the vehicle");
	    
		brand=scan.next();
		System.out.println("enter the mileage of the vehicle");
		mileage=scan.nextInt();
		System.out.println("enter the color of the vehicle");
		color=scan.next();
	}
  
	void display() {
		System.out.println("brand name is "+brand+" that gives mileage of "+mileage+" and selected colour was "+color);
	}
  
	void satisfied() {
		System.out.println(" do you liked it:");
		String response=scan.next();
			if(response.equalsIgnoreCase("yes")) {
				System.out.println("congrates now you own a vehicle");
				System.out.println("you can ride for trail");	
			}
			else {
				System.out.println("you can see other also");
				}
			}
}

class buy extends Vehicle{
	void payment() {
		System.out.println("  the amount of the vehicle is:"+amount);
		System.out.println("payment by card or upi:");
		String pay=scan.next();
		System.out.println("payment successfully done");
	}
}
public class InheritanceVehicle {
	public static void main(String[] args) {
		buy b=new buy();
		b.info();
		b.display();
		b.satisfied();
		b.payment();
		
	}
}
-------------compiler output----------
enter the no of wheels of the vehicle
6
big vehicle like lorry ,bus
enter the brand of the vehicle
eicher
enter the mileage of the vehicle
9
enter the color of the vehicle
yellow
brand name is eicher that gives mileage of 9 and selected colour was yellow
 do you liked it:
yes
congrates now you own a vehicle
you can ride for trail
  the amount of the vehicle is:500000
payment by card or upi:
upi
payment successfully done
=======================================================
