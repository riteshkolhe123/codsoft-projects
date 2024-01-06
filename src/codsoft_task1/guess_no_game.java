package codsoft_task1;

import java.util.Random;
import java.util.Scanner;

public class guess_no_game {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int minRange = 1;
		int maxRange = 100;
		int maxattempt = 10;
		int score = 0;
		
		boolean playAgain = true;
		while (playAgain) {
			int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
		System.out.println(" !!!!! Welcome To The Number Guessing Game !!!!!");
		System.out.println("\n");
		System.out.println(" I have Selected The Number Between " + minRange +" and " + maxRange +" Try the another number ");
		int attempts = 0;
		while (attempts < maxattempt) {
			System.out.println(" Enter Your Guess Number : ");
			int userGuess = sc.nextInt();
			attempts++;
			
			if(userGuess <  targetNumber) {
				System.out.println(" Too Low..! Try again");
			}else if(userGuess > targetNumber) {
				System.out.println(" Too High..!Try again");
			}else {
				System.out.println(" Congratulations..! You Guessed The Correct Number" + targetNumber +" in " +attempts);
				score += maxattempt - attempts +1;
				break;
			}
		}
		if (attempts == maxRange) {
			System.out.println(" Sorry..! You Have Reached maximum Number Of attempts.The correct Number Is");
			
		}
		System.out.println("Do You Want To Play again..? (Yes/No):");
	    String PlayAgainResponse = sc.next().toLowerCase();
	    playAgain = PlayAgainResponse.equals("Yes");
		}
		System.out.println(" Thanks For Playing..! Your Total score is; "+score);
		
	}

	}


