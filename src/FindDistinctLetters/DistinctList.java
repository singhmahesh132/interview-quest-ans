package src.FindDistinctLetters;

import java.util.*;

//Ques: Find the letter not present
public class DistinctList {
    public static void main(String[] args){
        List<String> list = Arrays.asList("A","B","C");
        Set<String> set = Set.of("A","C");

        list.forEach(alpha -> {
            if(set.contains(alpha)){
                System.out.println(alpha);
            }
        });
    }
}
