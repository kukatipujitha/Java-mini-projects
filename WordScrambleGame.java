// A Java program where the player guesses the original word from its scrambled form within limited attempts.
//package com.Practice;
import java.util.*;
class WordScrambleGame{
	public static void main(String [] args) {
        boolean playagain=true;
        
		Scanner scan=new Scanner(System.in);
		while(playagain) {
		
		Random rand=new Random();
		int attempt=1;
		int maxTries=3;
		String [] wordsList= {"python","java","sql","cloud"};
		int len=wordsList.length;
		int indexOfWord=rand.nextInt(len);
		String word=wordsList[indexOfWord];
		 String ScrumbledWord=Scramble(word);
		 System.out.println("Scrabled word is:"+ScrumbledWord);
		 
		 while(attempt<=maxTries) {
		     System.out.println("enter the guess"+attempt);
		 String Guessed=scan.next();
			 boolean response1=true;
		if (word.equalsIgnoreCase(Guessed)) {
			System.out.println("correct");
			break;
			
			}
		else
		{
			System.out.println("incorrect");
			attempt++;
		    if(attempt>maxTries){
		        System.out.println("your chances are out the correct word is"+word);
		    }
		}
	}
		
		System.out.println("wanna play again ,,,,if yes type 'yes'");
			String response=scan.next();
			if (response.equalsIgnoreCase("yes")) {
				playagain=true;
			}
			else {
				playagain=false;
				System.out.println("thanks for playing");
			}
			}
			
		}
	public static String Scramble(String word) {
		List<Character> letters =new ArrayList<>();
		for (char c:word.toCharArray()) {
			letters.add(c);
			}
			Collections.shuffle(letters);
			StringBuilder scrumbled=new StringBuilder();
			for(char c:letters) {
				scrumbled.append(c);
			}
			return scrumbled.toString();			}
}
---------------compiler output-----------
  Scrabled word is:ucdol
enter the guess1
clodu
incorrect
enter the guess2
lcoud
incorrect
enter the guess3
coldu
incorrect
your chances are out the correct word iscloud
wanna play again ,,,,if yes type 'yes'
=========================================================================
