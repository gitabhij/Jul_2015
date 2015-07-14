import java.util.Scanner;

public class GuessingGame{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the guessing game. Please enter your name");
		String name = sc.next();		
		System.out.println("Hello " + name + "! Enter a number between 1 and 100");
		int targetToBeGuessed = (int)(Math.random()*100);
		
		//This variable is the number of attempts
		int a_i = 0;
		
		//This represents the number the user is entering
		int g_i = -1;
		
		int numberOfAttempts = 0;
		int guessEntered = -1;
		while(guessEntered != targetToBeGuessed){
			guessEntered = sc.nextInt();
			numberOfAttempts++;
			if(guessEntered > targetToBeGuessed)
				System.out.println("Aim Lower");
			else if(guessEntered < targetToBeGuessed)
				System.out.println("Aim Higher");
			else
				System.out.println("You've got it in " + numberOfAttempts + " attempts");
		}
	}
}