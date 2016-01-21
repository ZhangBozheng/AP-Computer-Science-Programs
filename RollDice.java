import java.util.*;

public class RollDice{
	public static int result;
	public static void main(String[] args){
		int counter = 0;
		Random rand = new Random();
		int b = rand.nextInt(6) +1;
		int c = rand.nextInt(6) +1;
		roll(counter, b, c);
		System.out.println (RollDice.result);
	}
	
	public static void roll(int counter, int b, int c){
		int d = 0;
		counter++;
		if((b+c) != 7){
			Random rand = new Random();
			b = rand.nextInt(6) +1;
			c = rand.nextInt(6) +1;
			System.out.println(b +" , "+ c + " , " + counter);
			RollDice.result = counter;
			roll(counter, b, c);
		}
	}
}