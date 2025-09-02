import java.util.Scanner;
import java.util.Random;

class RockPaperScissorsGame{
    public static void main(String [] args){
        boolean  playAgain=true;
        while(playAgain){
        Scanner scan=new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Welcome to Rock paper Scissor");
        System.out.println("Game rules:");
        System.out.println("select one from the list [rock,paper,scissor] and I also select the one");
        System.out.println("Rock beats Scissors");
        System.out.println("Scissors beats Paper");
        System.out.println("Paper beats Rock");
        Random r=new Random();
        String [] Gm={"rock","paper","scissor"};
        String ComChoice=Gm[r.nextInt(3)];
        System.out.println("enter one of these --(rock,paper,scissors");
        String UserChoice=scan.next().toLowerCase();
        if((!UserChoice.equals("rock"))&& (!UserChoice.equals("paper"))&&(!UserChoice.equals("scissors"))){
            System.out.println("invalid input  enter one of these --(rock,paper,scissors");
            return;
        }
if(UserChoice.equals("rock") && (ComChoice.equals("scissors")) || UserChoice.equals("scissors") && (ComChoice.equals("paper")) || UserChoice.equals("paper") && (ComChoice.equals("rock"))){
            System.out.println("you win yahoooooo");
           System.out.println("my choice is "+ComChoice);
        }
        else if (ComChoice.equals(UserChoice)){
            System.out.println("it is a tie");
        }
        else{
            System.out.println("you loose!!! but better luck  next time");
            System.out.println("my choice is "+ComChoice);
        }
        System.out.println("wanna play again ,,,,if yes type 'yes'");
			String response=scan.next();
			if (response.equalsIgnoreCase("yes")) {
				playAgain=true;
			}
			else {
				playAgain=false;
				System.out.println("thanks for playing");
			}
        }
    }
			
		}
        
    compiler output
=================================
Welcome to Rock paper Scissor
Game rules:
select one from the list [rock,paper,scissor] and I also select the one
Rock beats Scissors
Scissors beats Paper
Paper beats Rock
enter one of these --(rock,paper,scissors
paper
it is a tie
wanna play again ,,,,if yes type 'yes'
yes
=================================
Welcome to Rock paper Scissor
Game rules:
select one from the list [rock,paper,scissor] and I also select the one
Rock beats Scissors
Scissors beats Paper
Paper beats Rock
enter one of these --(rock,paper,scissors
scisors
invalid input enter one of these --(rock,paper,scissors

=== Code Execution Successful ===
