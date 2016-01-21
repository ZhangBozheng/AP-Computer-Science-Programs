import java.util.*;
public class Calendar {
	public static void main(String[] args){
		System.out.println("");
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number of days in the month: ");
		int days = console.nextInt();
		System.out.print("Enter the day of the first Sunday: ");
		int sunday = console.nextInt();
		System.out.println("");
		System.out.println("    S    M    T    W   Th    F   Sa");
		firstLine(days, sunday);
		rest(days, sunday);
		System.out.println("");
		System.out.println("");
	}
	
	public static void firstLine(int days, int sunday){
		for(int i = 1; i<=8-(sunday); i++){
			System.out.print("     ");
		}
		for(int i = 1; i<sunday; i++){
			System.out.print("    "+i);
		}
		System.out.println("");
	}
	
	public static String padded(int n){
		String s = " "+n;
		for(int i= s.length(); i<5; i++){
			s=" "+s;
		}
		return s;
	}	
	
	public static void rest(int days, int sunday){
		for(int i=sunday; i<=days; i++){
			System.out.print(padded(i));
			if((i-sunday+1)%7==0){
				System.out.println("");
			}
			else{
				System.out.print("");
			}
		}
	}	
}	












