package src.LeetCode75Days;

/*
1768. Merge Strings Alternately

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r */

public class MergeStringAlternatively {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder newWord = new StringBuilder();
        int i = 0;
        int ptr = Math.min(word1.length(), word2.length());
        while (i < ptr) {
            newWord.append(word1.charAt(i));
            newWord.append(word2.charAt(i));
            i++;
        }
        if(word1.length() < word2.length())
            newWord.append(word2.substring(ptr));
        else
            newWord.append(word1.substring(ptr));

        return newWord.toString();
    }

    public static void main(String[] args){
            System.out.println("word = "+ MergeStringAlternatively.mergeAlternately("1223","af"));
        }
}
