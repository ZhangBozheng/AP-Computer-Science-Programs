import java.util.*; //import packages to use scanner for file reading.
import java.io.*;// same

public class GreenEggsAndHam{
	public static void main(String[] args)throws FileNotFoundException{ //when file reading you always need throws FileNotFoundException
		final long startTime = System.currentTimeMillis();
		File f = new File("GreenEggsAndHamText.txt"); //gets the file from the directory
		Scanner input = new Scanner(f);
		ArrayList<String> words = new ArrayList<String>(); //creates an arraylist that will contain the words
		ArrayList<Integer> frequency = new ArrayList<>(); //creates an arraylist that will contain the frequencies
		while(input.hasNext()){ //while there are more words to search through
			String b = input.next(); //string b is the next word that the program searches through
			String a = b.toUpperCase();//changes the string to uppercase
			if(words.contains(a) == false){//if the next word is not in the words arraylist, then it creates a new element in the arraylist
				words.add(a);//adds the next word to the words arraylist
				frequency.add(1);// makes the frequency of that word 1
			}
			else{ //if the word is in the words arraylist, add 1 to the frequency of that word
				frequency.set(words.indexOf(a), frequency.get(words.indexOf(a)) +1); //adds 1 to the frequency of the word
			}		
		}
		for(int i = 0; i < words.size(); i++) { //prints out the arraylists. I could not use the in-built print statements because that
			String words1 = words.get(i);//formats the arraylists in a way that I don't want
			int frequency1 = frequency.get(i);
			System.out.println(words1 + ":" + frequency1);
		}
		int sum = 0; //sum the total words by adding the frecquencies of the words
		for(int i = 0; i<frequency.size(); i++){
			sum = sum + frequency.get(i);
		}
		System.out.println("Total unique words: "+words.size());//prints out the unique words
		System.out.println("Total words: "+sum);
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime));
	}
}