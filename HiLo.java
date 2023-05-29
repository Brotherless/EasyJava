import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String playAgain;
		do {
				// Create a random number for the user to guess
				int theNumber = (int)(Math.random()*100 + 1);
				System.out.println(theNumber);
				int guess = 0;
				while (guess != theNumber) {
				System.out.print("Guess a number between 1 and 100: ");
				
				guess = keys.nextInt();
				System.out.println("you entered: " + guess +".");
				if (guess > theNumber)
					System.out.println(guess + " is too high, try again.");
				else if (guess < theNumber)
					System.out.println(guess + " is too low, try again.");
				else
					System.out.println(guess +" is correct :)");
			}
			System.out.println("Would you like to play again? y/n");
			playAgain = keys.next();
		}while(playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		keys.close();
	}

}