package src.StreamsProblem.CountOccuranceOfCommonWords;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Ques: Group the words and count their occurrence from a given string.
public class MyMain {

    public static void main(String[] args) {

        //Directly using Comparator's groupingBy() method.
        String str = "This is a test and it is good to have test";
        List<String> words = Arrays.stream(str.split("\\s+")).toList();
        Map<String, Long> wordsCount = words.stream().collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
        wordsCount.forEach((word,count) -> System.out.println(word+" : "+count));
        System.out.println();

        //Using hashmap and getOrDefault() method.
        String str1 = "This is a test and it is good to have test";
        List<String> words1 = Arrays.stream(str1.split("\\s+")).toList();
        HashMap<String,Integer> wordsCount1 = new HashMap<>();
        words1.forEach(word-> wordsCount1.put(word, wordsCount1.getOrDefault(word,0)+1));
        wordsCount1.forEach((word,count)-> System.out.println(word+" : "+count));
        System.out.println();

        //Extra : get the max element from a list.
        List<Integer> list =  Arrays.asList(5,10,1,19,2,11,12,13,14,15,17,16,18,20,4,3,7,8,9);
        int max = list.stream().max(Integer::compare).get();
        System.out.println("max is :"+max);
        System.out.println();

        //Extra: Filter the word from a string that starts with "i".
        String str2 ="This is a test and it is good to have test";
        Arrays.stream(str2.split(" ")).filter(word -> word.startsWith("i")).forEach(System.out::println);
        System.out.println();

        //Extra: Count the occurrence of each character in a given string
        String value = "abcccccddddd";
        Arrays.stream(value.split("")).
        collect(Collectors.groupingBy(String::valueOf,Collectors.counting())).forEach((a,b) -> System.out.print(a+":"+b+" :: "));
    }
}
