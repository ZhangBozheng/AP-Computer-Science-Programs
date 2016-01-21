import java.util.*;

public class Pascal's Triangle-2{
	public static void main(String[] args){
		pascalsTriangle();
	}
	
	public static void pascalsTriange(){
		Scanner console = new Scanner(System.in);
		int row = getInt("What row?" , console);
		int column = getInt("What column?" , console);
		long[][] arrPascal = new long[92][92];
		arrPascal[0][0] = 1;
		for(int n = 1; n<91; n++){
			long number = 1;
			arrPascal[n][0] = 1;
			for(int r = 0; r<=n; r++){
				number = number * (n-r)/(r+1);
				arrPascal[n][r+1] = number;
			}
			arrPascal[n][n+1] = 1;
		}
		for(int n = 0; n<91; n++){
			for(int r = 0; r<=n; r++){
				if(arrPascal[n][r]> Long.MAX_VALUE || arrPascal[n][r]<0){
					arrPascal[n][r] = 0;
				}
			}
		}
		long sum = 0;
		if((row+column)<92){
			int i = row+column;
			int j= 0;
			while(i>((row+column)/2)){
				long x = arrPascal[i][j];
				System.out.print("arrPascal["+i+"]["+j+"] =");
				System.out.printf("%3d\n",x);
				sum = sum + x;
				i--;
				j++;
			}
		}
		else{
			int i = 91;
			int j = column+row-92;
			while(i>((row+column)/2)){
				long x = arrPascal[i][j];
				System.out.print("arrPascal["+i+"]["+j+"] =");
				System.out.printf("%3d\n",x);
				sum = sum + x;
				i--;
				j++;
			}
		}	
		System.out.printf("%-16s","Fibbonaci("+(row+column+1)+")");
		System.out.print("=");
		System.out.printf("%3d\n",sum);
		
		for(int j = 0; j<=(row+column); j++){
			System.out.println(arrPascal[row+column][j]);
		}
	}
	
	public static int getInt(String prompt, Scanner console){
		System.out.println(prompt);
		while(!console.hasNextInt()){
			console.next(); //Discard Bad Input
			System.out.print("Not an integer. Please try again. ");
			System.out.println(prompt);
		}
		while(console.nextInt() < 0){
			System.out.print("Not a positive integer. Please try again. ");
			System.out.println(prompt);
			console.next(); //Discard Bad Input
		}
		return console.nextInt();
	}
}