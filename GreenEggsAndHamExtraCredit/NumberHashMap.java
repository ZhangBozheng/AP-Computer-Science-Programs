import java.util.*;
import java.io.*;

public class NumberHashMap{
	public static void main(String[] args)throws FileNotFoundException{ 
		final long startTime = System.currentTimeMillis();
		File f = new File("Numbers3.txt");
		Scanner input = new Scanner(f);
		HashMap map = new HashMap();
		while(input.hasNextInt()){
			int a =input.nextInt();
			if(map.containsKey(a)){
				map.put(a, (int)map.get(a) + 1);
			}
			else{
				map.put(a,1);
			}		
		}
		final long endTime = System.currentTimeMillis();
		System.out.println(map.size());
		Set set = map.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println("Total execution time: " + (endTime - startTime));
	}
}