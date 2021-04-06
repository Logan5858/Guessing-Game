package guessingameproject;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Actual {
	
	public static void main(String[] args) {
		int computerNumber  = (int) (Math.random()*100 + 1);
		System.out.println(computerNumber);
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you think the computer picked?");
		int userAnswer  = scan.nextInt();
		
		for (int i = 0; i < 1; i++) {
			
		while(userAnswer != computerNumber) {
				System.out.println("Try again");
				Scanner scan1 = new Scanner(System.in);
				System.out.println("What do you think the computer picked?");	
				if (userAnswer < computerNumber) {
					System.out.println("Higher");
				}else if (userAnswer > computerNumber) {
					System.out.println("Lower");
				int userAnswer1  = scan.nextInt();
				userAnswer=userAnswer1;
		}		
				
		}			
		if (userAnswer == computerNumber) {
			System.out.println("You won");		
		}
		
		
		
		}
	}
}


