//Samuel Hartman
//Brad Messner
//SCS 290
//Using simple youtube tutorial to understand bags 

public class bagSimple {

	public static void main(String[] args) 
	{
	
		LetterBag bag = new LetterBag();
		
		bag.add("a");	//add a
		bag.add("a");
		bag.add("a");
		
		bag.add("e");	//add e
		bag.add("e");
		bag.add("e");
		
		bag.add("f");	//add random
		bag.add("c");
		bag.add("x");
		
		
		System.out.println("Total Items: " + bag.getTotalWords());
		System.out.println("Total Unique Items: " + bag.getNumUniqueWords());
		System.out.println("'a' occured: " + bag.getNumOccurances("a") + " times");
		//System.out.println("Most frequently occuring is: " + bag.getMostFrequent());
		//System.out.println("Top 2 Most Frequent Items: " + bag.getNMostFrequentStrings(2));
		
		
	}

}
