import java.util.*;
import java.io.*;

public class Parentheses{
	public static void main(String[] args){
		System.out.println("Enter your string below:");
		int counterleft = 0;
		int counterright = 0;
		count(counterleft, counterright);
		
		/*if(difference == 0){
			System.out.println("True");
		}
		if(difference > 0){
			System.out.println("False");
		}
		if(difference < 0){
			System.out.println("False");
		}*/
	}
	
	public static void count(int counterleft, int counterright){
		Scanner console = new Scanner(System.in);
		String string = console.next();
		char c;
		int difference = 0;
		int[] differences = new int[string.length()];
		if (string.charAt(0) == ')'){
			System.out.println("false");
		}
		else{
			for(int i=0; i < string.length(); i++){
				c = string.charAt(i);
				if (c == '('){
					counterleft++;
				}
				if (c == ')'){
					counterright++;
				}
				difference = counterleft - counterright;
				differences[i] = difference;
			}
			int max = 0;
			for(int i = 0; i < differences.length; i++) {
				if(differences[i] > max) {
					max = differences[i];
				}	
			}
			if(difference == 0){
				System.out.println("true");
				System.out.println(max);
			}
			if(difference!=0){
				System.out.println("false");
			}
		}
	}
}