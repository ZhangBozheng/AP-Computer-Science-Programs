public class SpaceNeedle{
	public static final int SIZE = 25;
	public static void main(String args[]){
		lines();
		bigThingTop();
		bigThingBottom();
		lines();
		percent();
		bigThingTop();
	}
	
	public static void lines(){
		for(int line=1; line<= SIZE; line++){		
			for(int j=1; j<=3*SIZE; j++){
				System.out.print(" ");
			}	
			System.out.println("||");
		}
	}
	
	public static void bigThingTop(){
		for(int line=1; line<=SIZE; line++){
			for (int i=1; i<=SIZE*3-3*line; i++){
				System.out.print(" ");
			}	
			System.out.print("__/");
			for (int i=1; i<=3*line-3; i++){
				System.out.print(":");
			}	
			System.out.print("||");
			for (int i=1; i<=3*line-3; i++){
				System.out.print(":");
			}
			System.out.println("\\__");
		}
		System.out.print("|");
		for(int i=1; i<=SIZE*6; i++){
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static void bigThingBottom(){
		for(int line=1; line<=SIZE; line++){
			for(int i=1; i<= (-2)+(2*line); i++){
				System.out.print(" ");
			}
			System.out.print("\\_");
			for(int i=1; i<= ((SIZE*3)+1)-(2*line); i++){
				System.out.print("/\\");
			}
			System.out.println("_/");
		}	
	}
	
	public static void percent(){
		for(int line=1; line <= SIZE*SIZE; line++){
			for(int i= 1; i<=4+ 5*(0.5*SIZE-1); i++){
				System.out.print(" ");
			}	
			if(SIZE%2 ==1){
				System.out.print(" ");
			}	
			else{
				System.out.print("");
			}
			System.out.print("|");
			for(int i=1; i<=SIZE/2; i++){
				System.out.print("%");
			}
			System.out.print("||");
			for(int i=1; i<=SIZE/2; i++){
				System.out.print("%");
			}
			System.out.println("|");
		}
	}	
}