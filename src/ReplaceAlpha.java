
import java.util. Arrays;
import java.util. Comparator; 
import java.til. HashMap; 
import java.util.List;

public class ReplaceAlpha {

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

	wordList.stream).map(letter -> {
		myMap.put(ReplaceAlpha.removeAlphabetFromWord(letter,alpha),letter);
		return ReplaceAlpha.removeAlphabetFromWord(letter,alpha);
	}).sorted(Comparator.comparingInt(String::length)).forEach(letter -> System.out.print(myMap.get(letter)+” “));

}