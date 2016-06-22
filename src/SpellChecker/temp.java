package temp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class SpellChecker {	
	private static String FILE_NAME = "/usr/share/dict/words";
	private ArrayList<String> words;
	
	public void SpellChecker() {
		File wordFile = new File(FILE_NAME);
		try {
		    BufferedReader reader = new BufferedReader(new FileReader(filename));
		
	}
	
	
	private static ArrayList<String> readWords(String filename) {
		ArrayList<String> words = new ArrayList<String>();
		File bookfile = new File(filename);

		try {
		    BufferedReader reader = new BufferedReader(new FileReader(filename));
		  	      //for (Integer i = 0; i  reader.readLines(File file) throws Exception {
			 if (!bookfile.exists()) {
				return books;
			}
		      String line = reader.readLine();
		      while (line != null) {
		    	  books.add(line);
		          line = reader.readLine();
		      }
		      reader.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	      // Print from ArrayList
	      
	      return books;
	  }
	
	public static int getDict() {
		HashSet<String> dict = new HashSet<String>();
	}
		dict.add(word);
	
	public static void main(String[] args) {
		HashSet<String> dict = new HashSet<String>();
				getDict();
		String[] words = getWords();
		for (String i: words) {
			if (dict.get(word) == null) {
				System.out.println("Word misspelled: "+word);
			}
		}
	}
		System.out.println((System.getProperty("user.dir") + File.separatorChar +"mybooks.txt"));
		String filename = (System.getProperty("user.dir") + File.separatorChar +"mybooks.txt");
		writeBooks(filename);
		ArrayList<String> myBooks = readBooks(filename);
		// Method 1 : to list all entries in ArrayList
		for(String book: myBooks) {
			System.out.println(book);
		}

		// Method 2 : to list all entries in ArrayList
		for(int i=0; i<myBooks.size(); i++) {
			System.out.println("Book #" + i + " " + myBooks.get(i));
		}
	}
	
public static void SpellCheckWord() {
		
	}
	

}

