package SpellChecker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SpellChecker {

	private static String FILE_NAME = "/usr/share/dict/words";
	private ArrayList<String> words;

	public static HashSet<String> getDict() {
		HashSet<String> dict = new HashSet<String>();
		// File wordFile = new File(FILE_NAME);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
			String line = reader.readLine();
			while (line != null) {
				dict.add(line);
				line = reader.readLine();
			}
			reader.close();			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return (dict);
	}

	public static String[] inputWords() {
		Scanner scan = new Scanner(System.in);
		String[] wordList = new String[10];
		String phrase = "";
		System.out.println("Enter a word or a phrase: ");
		phrase = scan.nextLine();
		wordList = phrase.split(" ");
		for (int i=0; i<wordList.length;i++) {
			System.out.println(wordList[i]);
		}
		return wordList;
	}

	public static void main(String[] args) {
		// HashSet<String> dict = new HashSet<String>();
		HashSet<String> dict = getDict();
		String[] wordList = inputWords();
		boolean found = true;
		for (String word : wordList) {
			if (!dict.contains(word)) {
				found = false;
				System.out.println("Word misspelled: " + word);
			}		
		}
		if (found) {
			System.out.println("All words are correct!");
		}
	}

}
