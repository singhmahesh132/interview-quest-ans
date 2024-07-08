package src.StreamsProblem.CountOccuranceOfCommonWords;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyMain {
    public static void main(String[] args) {
        String str = "This is a test and it is good to have test";
        List<String> words = Arrays.stream(str.split("\\s+")).toList();
        Map<String, Long> wordsCount = words.stream().collect(Collectors.groupingBy(String::toString,Collectors.counting()));
        wordsCount.forEach((word,count) -> System.out.println(word+" : "+count));
        System.out.println();

        String str1 = "This is a test and it is good to have test";
        List<String> words1 = Arrays.stream(str.split("\\s+")).toList();
        HashMap<String,Integer> wordsCount1 = new HashMap<>();
        words1.forEach(word-> wordsCount1.put(word, wordsCount1.getOrDefault(word,0)+1));
        wordsCount1.forEach((word,count)-> System.out.println(word+" : "+count));
        System.out.println();

        List<Integer> list =  Arrays.asList(5,10,1,19,2,11,12,13,14,15,17,16,18,20,4,3,7,8,9);
        int max = list.stream().max(Integer::compare).get();
        System.out.print("max is :"+max);
        System.out.println();

        String str2 ="This is a test and it is good to have test";
        Arrays.stream(str2.split(" ")).filter(word -> word.startsWith("i")).forEach(System.out::println);
    }
}
