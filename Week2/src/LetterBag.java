import java.util.ArrayList;

public class LetterBag {

	private final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	private int[] letterFrequencies;
	
	public LetterBag() {
		letterFrequencies = new int[26];	//of the alphabet
	}
	
	//adds letter to bag
	
	public void add(String letter) {
		String lower = letter.toLowerCase();
		int index = getIndexForLetter(lower);
		letterFrequencies[index]++;
	}

	private int getIndexForLetter(String lower) {
		return alphabet.indexOf(lower);
	}
	
	public String getTotalWords() {
		return alphabet;
	}

	public String getNumUniqueWords() {
		return null;
	}
	
	public String getNumOccurances(String string) {
		return null;
	}
	
}
