package demo;
import java.util.Arrays;
public class SortStrings {
	public static void main(String[] args) {
		String[] words= {"kamalesh","siri","naresh","amar"};
	    Arrays.sort(words);
	    System.out.println("Sorted Strings:");
	    for(String word : words) {
	    	 System.out.println(word);
	    }
	}
}
