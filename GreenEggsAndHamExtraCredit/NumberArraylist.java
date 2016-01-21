import java.util.*; 
import java.io.*;

public class NumberArraylist{
	public static void main(String[] args)throws FileNotFoundException{ 
		final long startTime = System.currentTimeMillis();
		File f = new File("Numbers3.txt");
		Scanner input = new Scanner(f);
		ArrayList<Integer> words = new ArrayList<Integer>();
		ArrayList<Integer> frequency = new ArrayList<>();
		while(input.hasNextInt()){
			int a = input.nextInt();
			if(words.contains(a) == false){
				words.add(a);
				frequency.add(1);
			}
			else{
				frequency.set(words.indexOf(a), frequency.get(words.indexOf(a)) +1);
			}		
		}
		final long endTime = System.currentTimeMillis();
		for(int i = 0; i < words.size(); i++) {
			int words1 = words.get(i);
			int frequency1 = frequency.get(i);
			System.out.println(words1 + ":" + frequency1);
		}
		int sum = 0;
		for(int i = 0; i<frequency.size(); i++){
			sum = sum + frequency.get(i);
		}
		System.out.println("Total unique words: "+words.size());
		System.out.println("Total words: "+sum);
		System.out.println("Total execution time: " + (endTime - startTime));
	}
}