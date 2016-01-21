import java.util.*;

public class LimitedOperators{
	public static void main(String[] args){
		System.out.println("Enter two integers to be added:");
		Scanner console = new Scanner(System.in);
		int x = console.nextInt();
		int y = console.nextInt();
		int a = add(x,y);
		System.out.println("The sum is "+a);
		int b = subtract(x,y);
		System.out.println("The difference is "+b);
		int c = quotient(x,y);
		System.out.println("The quotient is "+c);
		int d = remainder(x,y);
		System.out.println("The remainder is "+d);
	}
	
	public static int add(int x, int y){
		int i = x;
		int j = 0;
		while (j<y){
			j++;
			i++;
		}
		return i;
	}
	
	public static int subtract(int x, int y){
		int i = x;
		int j = 0;
		while (j<y){
			j++;
			i--;
		}
		return i;
	}
	
	public static int quotient(int x, int y){
		int i = x;
		int counter = 0;
		while(i>0){
			i = subtract(i, y);
			counter ++;
		}
		if(i !=0){
			counter --;
		}
		return counter;
	}
	
	public static int remainder(int x, int y){
		int i = x;
		int counter = 0;
		while(i>0){
			i = subtract(i, y);
			counter ++;
		}
		if(i<0){
			i = i+y;
		}
		return i;
	}
}