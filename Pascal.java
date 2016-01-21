import java.util.*;
public class Pascal{

	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int rows = console.nextInt();
		triangle(rows);
	}
	public static void triangle(int rows){
		for(int n=0; n<=rows-1; n++){
			for (int a=rows-1; a>=n+1; a--){
				System.out.print("  ");
			}
			System.out.print("1");
			int number = 1;
			for(int r=1; r<=n; r++){
				number = number * (n-r+1)/r;
				System.out.printf("%4d", number);
			}
			System.out.println("");
		}
	}
}
				
			
	