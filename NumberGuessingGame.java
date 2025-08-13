//it is number guessing game ...🔢🚧🚧🚧🚧🚧🚧🚧🚧🔢

package com.Practice;
import java.util.Random;
import java.util.Scanner;
public class NumberGuess {

	public static void main(String[] args) {
		System.out.println("Welcome to Number guessing game🔢🚧🚧🚧🚧🚧🚧"); 
		System.out.println("here you have to  guess the number what i selected in range of 1 to 100");
		System.out.println("rule no 1: you have to select a number in 1 to 100 range ");
		int maxTries=10;
		System.out.println("rule no 2: you have only "+maxTries+" attempts only");
		System.out.println("if you can't guess the number in given attempts you will lose ");

		Random r=new Random();
		int Target=r.nextInt(100)+1;
		Scanner scan=new Scanner(System.in);
		
		
		int attempt=0;
		while (attempt<=maxTries) {
			System.out.println("guess the number for attempt"+ attempt);
			int guessedNumber=scan.nextInt();
			if (Target==guessedNumber) {
				System.out.println("you are correct");
				System.out.println("you guessed in "+attempt+" attempts");
				break;
			}
			else if(Target<guessedNumber){
				System.out.println("guessed too high ");
				
				
			}
			else if (Target>guessedNumber) {
				System.out.println("guessed too low ");
				
			}
			else {
				System.out.println("out of range ");
			}
			
		attempt++;
		if (attempt>maxTries) {
			System.out.println("you failed to guess here is my number"+Target);
		}
		}
		
		}
	}
