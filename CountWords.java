import java.io.*;
import java.util.*;

public class CountWords{
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("hamlet.txt");
		Scanner input = new Scanner(f);
		System.out.println("length returns " + f.length());
		int count = 0;
		while (input.hasNext()){
			String word = input.next();
			count++;
		}
		System.out.println("total words = " + count);
	}
}
		