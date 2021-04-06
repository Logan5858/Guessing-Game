package guessingameproject;

import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		int computerNumber  = (int) (Math.random()*100 + 1);
		System.out.println(computerNumber);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you think the computer picked 1-99 ? You have 10 guesses to find out.");
		int userAnswer  = scan.nextInt();
		int count = 1;
		System.out.println("Total number of guesses: " + count);
		
			while(userAnswer != computerNumber ) {
				for (int i = 0; i < 1; i++) {
					if (userAnswer<=0 || userAnswer > 100 ) {
						System.out.println("Invalid answer, put a number betweeen 1-100");
					}else if (userAnswer < computerNumber) {
						System.out.println("Higher");
					}else if (userAnswer > computerNumber) {
						System.out.println("Lower");
					}		
				System.out.println("Try again");
				Scanner scan1 = new Scanner(System.in);	
				System.out.println("What do you think the computer picked?");	
				int userAnswer1  = scan.nextInt();
				userAnswer=userAnswer1;
				count++;
				System.out.println("Total number of guesses: " + count);
		}		
			
		if (count==2) {
			System.out.println("You lost");
			System.out.println("The correct number was:" + computerNumber);
			break;
		}			
		if (userAnswer == computerNumber) {
			System.out.println("You won");		
			}
		}
	}
}
	

