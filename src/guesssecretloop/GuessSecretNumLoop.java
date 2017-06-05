package guesssecretloop;

import java.util.Scanner;
import java.util.Random;

public class GuessSecretNumLoop {

	public static void main(String[] args){

		Random r = new Random();
		
		int secretNum = 1 + r.nextInt(1000) ;
		int numsAmt = 0;
		
		Scanner sc = new Scanner(System.in); 

		
		int numSecret;
		String response;
		boolean success = false;
		
		do{
			do{
				System.out.println("Enter a secret number between 1 and 1000: ");
				numSecret = sc.nextInt();
				numsAmt++;
			
				if (numSecret == secretNum) {
					success = true;
				}
				else if (numSecret < secretNum)	{
					System.out.println("You guessed too low, try again?");
				}
				else if (numSecret > secretNum)	{
					System.out.println("You guessed too high, try again?");
					}
			
		}while (!success);
	 	System.out.println("Congratulation!!!! Do you want to try again? (Y/N)");
	 	response = sc.next();
	 }while (response.equalsIgnoreCase("y"));	
  }
}
