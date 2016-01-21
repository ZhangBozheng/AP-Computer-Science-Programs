import java.util.*;
public class PascalRobust{

	public static void main(String[] args){
		System.out.println("This program prints Pascal's triangle.");
		Scanner console = new Scanner(System.in);
		String prompt = "How many rows do you want? ";
		int num = getInt(console, prompt);
		writeTable(num);
	}
	
	public static int getInt(Scanner console, String prompt){
		System.out.print(prompt);
		while(!console.hasNextInt()){
			console.next(); //Discard Bad Input
			System.out.print("Not an integer. Please try again. ");
			System.out.print(prompt);
		}
		return console.nextInt();
	}
	
	public static void writeTable(int rows){
		for(int n=0; n<=rows-1; n++){
			writeChar(rows, n);
			writeRow(n);
			System.out.println();
		}
	}
			
	public static void writeChar(int rows, int n) {
		for (int a=rows-1; a>=n+1; a--){
			System.out.print("  ");
		}
	}
	
	public static void writeRow(int n) {
		System.out.print("1");
		int number = 1;
		for(int r=1; r<=n; r++){
			number = number * (n-r+1)/r;
			System.out.printf("%4d", number);
		}
	}
}