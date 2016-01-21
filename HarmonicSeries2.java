import java.util.*; //import the scanner stuff

public class HarmonicSeries2{
	public static void main(String [] args){
		//int counter = 0;
		double limit2 = getSumLimit(); //this creates a new variable to put into the fractionSum method
		final long startTime = System.currentTimeMillis();
		fractionSum(limit2); //this actually does the harmonicseries thing
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime-startTime));
	}
	
	public static double getSumLimit(){ //since this is the the first method, we dont have any parameters yet.
		String Karthik = "Enter a number: "; // this is passed in to the getNumber method
		Scanner console = new Scanner(System.in); //this is passed in to the getNumber method.
		double limit = getNumber(Karthik, console); // create a new variable that equals what getnumber returns. it then uses this variable for the rest of the method
		while(limit<1){
			System.out.println("Sorry. Please input a number greater than 1.");
			getSumLimit();
		}
		return limit;
		//if(limit<1){ //this just checks if the limit is less than 1. If it is the user has to try again.
			//counter++;
			//if(counter> 10){
				//System.out.println("STOP BEING DUMB. INPUT A NUMBER GREATER THAN 1!!.");
			//}
			//System.out.println("Sorry. Please input a number greater than 1.");
			//getSumLimit(counter); //this is the method again to do it.
		//}
		//else{ //if the input is greater than 1, then it accepts it and prints nothing.
			//System.out.print("");
		//}
		//return limit; //return the limit to the main class.
	}
	
	public static double getNumber(String Karthik, Scanner console){ //this just gets the user input
		System.out.print(Karthik); //prints string Karthik
		double a= console.nextDouble(); // puts the user input as a variable
		return a; //returns the user input
	}
	
	public static void fractionSum(double limit2){ //this does the actual calculations and stuff.
		double counter = 0.0; //makes a counter since you cant return i
		double sum = 0.0; //this is the running sum
			for(double i = 1.0; i<=30000; i++){
				counter++;
				sum = sum + (1/i);
				if(sum>limit2){
					System.out.print("Actual sum = ");
					System.out.printf("%.5f", sum);
					System.out.println("");
					System.out.println("Number of terms required: " + (int) counter);
					break;
				}
			}
	}
}