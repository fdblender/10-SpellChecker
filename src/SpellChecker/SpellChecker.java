package SpellChecker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class SpellChecker {

	private static String FILE_NAME = "/usr/share/dict/words";
	private ArrayList<String> words;

	public static HashSet<String> getDict() {
		HashSet<String> dict = new HashSet<String>();
		File wordFile = new File(FILE_NAME);
		//dict.add(word);
		return(dict);
		try {
		    BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));		    
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	public static void main(String[] args) {
		HashSet<String> dict = new HashSet<String>();
				getDict();
		String[] words = getWords();
		for (String i: words) {
			if (dict.get(word) == null) {
				System.out.println("Word misspelled: "+word);
			}
		}

	public static void SpellCheckWord() {

	}

}
