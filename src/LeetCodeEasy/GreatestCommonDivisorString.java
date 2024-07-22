package src.LeetCodeEasy;

import java.util.HashMap;
import java.util.Map;

/* 1071. Greatest Common Divisor of Strings
Hint
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.


Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""*/

public class GreatestCommonDivisorString {
    public static String gcdOfStrings(String str1, String str2) {
        String[] wordToMatchArr = str2.split("");
        Map<String, Integer> divCount = new HashMap<>();
        StringBuilder wordToMatch = new StringBuilder();

        for(int i = 0; i < wordToMatchArr.length; i++){
            wordToMatch.append(wordToMatchArr[i]);
            int count = matchSubString(str1, wordToMatch.toString());
            if(count!=0)
                divCount.put(wordToMatch.toString(),count);
        }

        if (divCount.isEmpty())
            return "";
        else
            return divCount.entrySet().stream().min((o1, o2) -> o2.getValue().compareTo(o1.getValue())).get().getKey();
    }

    public static int matchSubString(String str, String wrd){
        int divCount = 0;
        while (!str.isEmpty()) {
            if (str.startsWith(wrd)) {
                divCount++;
                str = str.substring(wrd.length());
            } else
                return 0;
        }
        return divCount;
    }

    public static void main(String[] args){
        System.out.println(GreatestCommonDivisorString.gcdOfStrings("ABABAB","ABAB"));
    }
}
