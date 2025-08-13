//it is number guessing game ...🔢🚧🚧🚧🚧🚧🚧🚧🚧🔢

package com.Practice;
import java.util.Random;
import java.util.Scanner;
public class NumberGuess {

	public static void main(String[] args) {
	    boolean playAgain=true;
	    	Scanner scan=new Scanner(System.in);
	    while(playAgain){
		System.out.println("Welcome to Number guessing game🔢🚧🚧🚧🚧🚧🚧"); 
		System.out.println("here you have to  guess the number what I selected in range of 1 to 100");
		System.out.println("rule no 1: you have to select a number in 1 to 100 range ");
		int maxTries=10;
		System.out.println("rule no 2: you have only "+maxTries+" attempts only");
		System.out.println("if you can't guess the number in given attempts you will lose ");

		Random r=new Random();
		int Target=r.nextInt(100)+1;

		
		
		int attempt=1;
		while (attempt<=maxTries) {
			System.out.println("guess the number for attempt"+ attempt);
			int guessedNumber=scan.nextInt();
			if(guessedNumber<1 || guessedNumber>100){
			    System.out.println("enter valid number");
			}
			if (Target==guessedNumber) {
				System.out.println("you are correct✅");
				System.out.println("you guessed in "+attempt+" attempts");
				break;
			}
			else if(Target<guessedNumber){
				System.out.println("guessed too high⬆ ");
				
				
			}
			else  {
				System.out.println("guessed too low ⬇");
				
			}
			
			
		attempt++;}
		if (attempt>maxTries) {
			System.out.println("you failed ❌to guess here is my number"+Target);
		}
		System.out.println("wanna play again !!!! if yes, type yes");
	    
	   String response=scan.next();
	   if (response.equals("yes")|| response.equals("y")){
	        playAgain=true;}
	        else{
	            playAgain=false;
	            System.out.println("thanks for playing😀😃😍");
	        }
	         
		}
	    }
	    
	    

}
-------------compiler output----
Welcome to Number guessing game??????? ----//
here you have to  guess the number what I selected in range of 1 to 100
rule no 1: you have to select a number in 1 to 100 range 
rule no 2: you have only 10 attempts only
if you can't guess the number in given attempts you will lose 
guess the number for attempt1
45
guessed too high? 
guess the number for attempt2
25
guessed too low ?
guess the number for attempt3
35
guessed too high? 
guess the number for attempt4
20
guessed too low ?
guess the number for attempt5
24
guessed too low ?
guess the number for attempt6
23
guessed too low ?
guess the number for attempt7
22
guessed too low ?
guess the number for attempt8
21
guessed too low ?
guess the number for attempt9
20
guessed too low ?
guess the number for attempt10
18
guessed too low ?
you failed ?to guess here is my number32
wanna play again !!!! if yes, type yes
yes
Welcome to Number guessing game???????
here you have to  guess the number what I selected in range of 1 to 100
rule no 1: you have to select a number in 1 to 100 range 
rule no 2: you have only 10 attempts only
if you can't guess the number in given attempts you will lose 
guess the number for attempt1
25
guessed too high? 
guess the number for attempt2
15
guessed too high? 
guess the number for attempt3
10
guessed too high? 
guess the number for attempt4
5
guessed too low ?
guess the number for attempt5
8
guessed too low ?
guess the number for attempt6
9
you are correct?
you guessed in 6 attempts
wanna play again !!!! if yes, type yes
no
thanks for playing???
=================================================
	    
		
		
	
