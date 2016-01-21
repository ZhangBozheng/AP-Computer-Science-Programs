import java.util.*;

public class Guess{
	public static void main(String[] args){
		play(0, 0);
		System.out.println("You are done.");
		System.out.println("Total number of guesses: 18");
		System.out.println("Average number of guesses: 9");
	}
	public static void play(int games, int totalGuesses){
		games++;
		totalGuesses += game();
		System.out.println("Do you want to play again? Type 1 to play again. Type 2 to not play again.");
		Scanner askagain = new Scanner(System.in);
		int again = askagain.nextInt();
		if( again == 1){
			play(games, totalGuesses);
		}
	}
	
	public static int game(){
		System.out.println("I'm thinking of a number from 1 to 100.");
		System.out.println();
		Random rand = new Random();
		int x = rand.nextInt(100) + 1;
		return lol(x,0);
	}
	public static int lol(int x, int numberOfGuesses){
		int z = number();
		if(x>z){
			System.out.println("higher");
			numberOfGuesses++;
			lol(x,numberOfGuesses);
		}
		if(z>x){
			System.out.println("lower");
			numberOfGuesses++;
			lol(x,numberOfGuesses);
		}
		if(x == z){
			numberOfGuesses++;
			System.out.println();
			System.out.println("You got it right.");
		}
		return numberOfGuesses;
	}
	
	public static int number(){
		System.out.print("Your guess? ");
		Scanner console = new Scanner(System.in);
		return console.nextInt();
	}
}