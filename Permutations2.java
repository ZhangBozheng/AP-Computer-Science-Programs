import java.util.*;

public class Permutations2{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		System.out.println("Size of permutations: ");
		int size = console.nextInt();
		System.out.println("Number of permutations: ");
		int number = console.nextInt();
		System.out.println("Enter each permutation: ");
		int[] numarr = new int[size];
		for(int i = 0; i<size; i++){
			numarr[i] = (i+1);
		}
		int[] ordarr = new int[size];
		for(int i = 0; i<number; i++){
			for(int j = 0; j<size; j++){
				ordarr[j] = console.nextInt();
			}
			numarr = perm(numarr, ordarr, size);
		}
		int[] resarr = new int[size];
		for(int i = 0; i<size; i++){
			for(int j = 0; j<size; j++){
				if((i+1) == numarr[j]){
					resarr[j] = i;
				}
			}
		}
		System.out.println(Arrays.toString(resarr));
	}
	
	public static int[] perm( int[] numarr, int[] ordarr, int size){
		int[] resarr = new int[size];
		int n = 0;
		while(n<size){
			resarr[n] = numarr[ordarr[n]];
			n++;
		}
		return resarr;
	}
}