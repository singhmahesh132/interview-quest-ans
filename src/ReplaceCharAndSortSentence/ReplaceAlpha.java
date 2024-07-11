
import java.util. Arrays;
import java.util. Comparator; 
import java.til. HashMap; 
import java.util.List;

//Ques: Remove a character from string and sort the string on basis of length of words.
//After sorting print the string with original words.
public class ReplaceAlpha {

//Manually created a method to remove character from each words, since string.replace() does not appends empty character.
public static String removeAlphabetFronWord(String word, char alphaToRemove){

	char[] wordArr = word. toCharArray();
	StringBuilder sb = new StringBuilder();

	for (char c: wordArr) {
    		if(c != alphaToRemove)
          		sb.append(c);
  	}
	return sb.toString();
}



public static void main(String[] args){

	String word = "my world is mom";
	char alpha = ‘m';
	List<String> wordList = Arrays asList(word.split(“ “));
	HashMap<String, String> myMap = new HashMap<>();

//Using streams, first store the hashmap with replaced word as key and actual word as value.
//then remove the character from words and sort then as per lenght
//then using hashmap get the original words as value using modified word as key.
	wordList.stream).map(letter -> {
		myMap.put(ReplaceAlpha.removeAlphabetFromWord(letter,alpha),letter);
		return ReplaceAlpha.removeAlphabetFromWord(letter,alpha);
	}).sorted(Comparator.comparingInt(String::length)).forEach(letter -> System.out.print(myMap.get(letter)+” “));

}