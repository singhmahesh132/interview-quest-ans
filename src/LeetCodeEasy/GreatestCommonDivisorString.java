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
        for(int i = str2.length(); i > 0; i--){
            String newWord = str2.substring(0,i);
            if(getWordDivisor(str1, newWord)){
                if(getWordDivisor(str2, newWord)){
                    return newWord;
                }
            }
        }
        return "";
    }

    public static boolean getWordDivisor(String str, String wrd){
        while(!str.isEmpty()){
            if(str.startsWith(wrd))
                str = str.substring(wrd.length());
            else
                return false;
        }
        return true;
    } 

    public static void main(String[] args){
        System.out.println(GreatestCommonDivisorString.gcdOfStrings("ABABAB","ABAB"));
        System.out.println(GreatestCommonDivisorString.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}
