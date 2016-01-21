
public class PrintGrid{
	public static void main(String args[]){
		int[][] grid1 = new int[3][5];
		GridPrint(grid1);
	}

	public static void GridPrint(int[][]grid){
		int start = 0;
		for(int i = 0; i<grid.length; i++){
			for(int j = 0; j<grid[i].length; j++){
				grid[i][j] = start+1;
				start++;
				System.out.printf("%4d", grid[i][j]);
			}
		System.out.println();
		}
	}
}