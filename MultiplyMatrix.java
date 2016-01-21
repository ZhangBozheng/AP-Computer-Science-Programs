import java.util.*;

public class MultiplyMatrix{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the size of the square matrix");
		int size = console.nextInt();
		int[][] arr1 = new int[size][size];
		int[][] arr2 = new int[size][size];
		System.out.println("Enter the numbers of the first matrix starting from the top left, and going left:");
		for(int i = 0; i<size; i++){
			for(int j = 0; j<size; i++){
				arr1[i][j] = console.nextInt();
			}
		}
		for(int i = 0; i<size; i++){
			for(int j = 0; j<size; i++){
				arr2[i][j] = console.nextInt();
			}
		}
		int[][] resarr = new int[size][size];
		for(int i = 0; i<size; i++){
			int sum = 0;
			for(int j = 0; j<size; j++){
				sum = (arr1[i][j])*(arr2[i][j])+(arr1[i][j])*(arr2[i][j]);
				resarr[i][j] = sum;
			}
		}
	}
}
				