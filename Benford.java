import java.io.*;
import java.util.*;

public class Benford{
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Let's count those leading digits...");
		System.out.print("input file name? ");		
		Scanner console = new Scanner(System.in);
		String benfile = console.next();
		File ben = new File(benfile+"");
		Scanner input = new Scanner(ben);
		int a = 0; //Initialize the variables that will be the counters to the numbers.
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int i = 0;
		int j = 0;
		while (input.hasNextInt()){
			String number = Integer.toString(input.nextInt());
			char x = number.charAt(0);
			if(x == '0'){
				j++;
			}
			if(x == '1'){
				a++;
			}
			if(x == '2'){
				b++;
			}
			if(x == '3'){
				c++;
			}
			if(x == '4'){
				d++;
			}
			if(x == '5'){
				e++;
			}
			if(x == '6'){
				f++;
			}
			if(x == '7'){
				g++;
			}
			if(x == '8'){
				h++;
			}
			if(x == '9'){
				i++;
			}
		}
		while (input.hasNextDouble()){
			String number = Double.toString(input.nextDouble());
			char x = number.charAt(0);
			if(x == '0'){
				j++;
			}
			if(x == '1'){
				a++;
			}
			if(x == '2'){
				b++;
			}
			if(x == '3'){
				c++;
			}
			if(x == '4'){
				d++;
			}
			if(x == '5'){
				e++;
			}
			if(x == '6'){
				f++;
			}
			if(x == '7'){
				g++;
			}
			if(x == '8'){
				h++;
			}
			if(x == '9'){
				i++;
			}
		}
		double counter = a+b+c+d+e+f+g+h+i;
		double a1 = a/counter*100;
		double b1 = b/counter*100;
		double c1 = c/counter*100;
		double d1 = d/counter*100;
		double e1 = e/counter*100;
		double f1 = f/counter*100;
		double g1 = g/counter*100;
		double h1 = h/counter*100;
		double i1 = i/counter*100;
		System.out.println();
		if(j>0){
			System.out.println("excluding "+j+" zeros");
		}
		System.out.println("Digit Count Percent");
		System.out.printf("%5d", 1);
		System.out.printf("%6d", a);
		System.out.printf("%7.2f", a1);
		System.out.println();
		System.out.printf("%5d", 2);
		System.out.printf("%6d", b);
		System.out.printf("%7.2f", b1);
		System.out.println();
		System.out.printf("%5d", 3);
		System.out.printf("%6d", c);
		System.out.printf("%7.2f", c1);
		System.out.println();
		System.out.printf("%5d", 4);
		System.out.printf("%6d", d);
		System.out.printf("%7.2f", d1);
		System.out.println();
		System.out.printf("%5d", 5);
		System.out.printf("%6d", e);
		System.out.printf("%7.2f", e1);
		System.out.println();
		System.out.printf("%5d", 6);
		System.out.printf("%6d", f);
		System.out.printf("%7.2f", f1);
		System.out.println();
		System.out.printf("%5d", 7);
		System.out.printf("%6d", g);
		System.out.printf("%7.2f", g1);
		System.out.println();
		System.out.printf("%5d", 8);
		System.out.printf("%6d", h);
		System.out.printf("%7.2f", h1);
		System.out.println();
		System.out.printf("%5d", 9);
		System.out.printf("%6d", i);
		System.out.printf("%7.2f", i1);
		System.out.println();
		System.out.print("Total");
		System.out.printf("%6d", (int) counter);
		System.out.println(" 100.00");
	}
}