package Sony;

public class Demo {


	public static void main(String[] args) {
		// split the string by space
		String[] words = "is2 sentance4 this1 a3".split(" ");

		// create an array to hold the sorted words
		String[] sortedWords = new String[words.length];

		// loop through each word in the original array

		for (String word : words) {

			// extract the last character (which should be the number)
			int index = Integer.parseInt(word.substring(word.length() - 1));

			// add the word to the sorted array at the correct index
			sortedWords[index - 1] = word.substring(0, word.length() - 1);
		}

		// join the sorted words into a sentence 
		System.out.println(String.join(" ", sortedWords));

	}	
}
