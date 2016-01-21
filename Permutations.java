import java.util.*;

public class Permutations{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		System.out.println("Length of list: ");
		int length = console.nextInt();
		int[] numarr = new int[length];
		int[] ordarr = new int[length];
		int[] resarr = new int[length];
		System.out.println("List of numbers to be permuted: ");
		int i = 0;
		while(i<length){
			numarr[i] = console.nextInt();
			i++;
		}
		System.out.println("Desired permutation order");
		int j = 0;
		while(j<length){
			ordarr[j] = console.nextInt();
			j++;
		}
		System.out.println("(Note: first element in original list = index 0): ");
		int n = 0;
		while(n<length){
			resarr[n] = numarr[ordarr[n]];
			n++;
		}
		System.out.println(Arrays.toString(resarr));
	}
}