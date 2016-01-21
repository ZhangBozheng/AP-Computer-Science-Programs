import java.util.*;

public class Pig{
	public static void main(String [] args){
		int counter1 = 0;
		int counter2 = 0;
		while(counter1<100 && counter2<100){
			int a = game1(counter1);
			counter1 = counter1 + a;
			int b = game2(counter2);
			counter2 = counter2 + b;
			System.out.println(a + " , " + b);
		}
	}
	
	public static int game1(int counter1){
		int currentturn1 = 0;
		if(counter1 <100){
			int y = rollDice();
			counter1 = counter1 + y;
			System.out.println(counter1);
			System.out.println("Continue?");
			Scanner console = new Scanner(System.in);
			String yes = console.next();
			if(yes == "Yes"){
				game1(counter1);
			}
		}
		return counter1;
	}
	
	public static int game2(int counter2){
		if(counter2 <100){
			int y = rollDice();
			counter2 = counter2 + y;
			System.out.println(counter2);
			System.out.println("Continue?");
			Scanner console = new Scanner(System.in);
			String yes = console.next();
			if( yes == "Yes"){
				game2(counter2);
			}
		}
		return counter2;
	}
	public static int rollDice(){
		Random rand = new Random();
		int x = rand.nextInt(6) +1;
		return x;
	}
}