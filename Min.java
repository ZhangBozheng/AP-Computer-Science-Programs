public class Min{
	public static int MinGap(int[] arr){
		if(arr.length()<=2){
			return 0;
		}
		else{
			int[] arrgap = new int[arr.length()-1];
			for(int i = 0; i<arrgap.length; i++){
				arrgap[i] = arr[i+1]-arr[i];
			}
			int min = arrgap[0];
			for(int i = 1; i<arr.length; i++){
				if(arrgap[i]<min){
					min = arrgap[i];
				}
			}
		}
		return min;
	}
}