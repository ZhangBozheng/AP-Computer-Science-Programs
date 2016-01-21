import java.util.*;

public class HarmonicSeries{
	public static void main(String [] args){
		terms();
	}
	
	public static void terms(){
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the limit of the harmonic series: ");
		double limit = console.nextDouble();
		final long startTime = System.currentTimeMillis();
		if(limit>=1){
			double counter = 0.0;
			double sum = 0.0;
			while(limit>sum){
				counter++;
				sum = sum + (1/counter);
			}
			long a = startTime;
			System.out.print("Actual sum = ");
			System.out.printf("%.5f", sum);
			System.out.println("");
			System.out.println("Number of terms required: " + (int) counter);
			final long endTime = System.currentTimeMillis();
			System.out.println("Total execution time: " + (endTime-a));
		}
			/*for(long i = 1; i<=300000000; i++){
				counter++;
				sum = sum + (1/i);
				if(sum>limit){
					long a = startTime;
					System.out.print("Actual sum = ");
					System.out.printf("%.5f", sum);
					System.out.println("");
					System.out.println("Number of terms required: " + (int) counter);
					final long endTime = System.currentTimeMillis();
					System.out.println("Total execution time: " + (endTime-a));
					break;
				}
			}*/
		else{
			System.out.println("Yo, the input should be greater than equal or to 1. RTFD.");
			terms();
		}
	}
}