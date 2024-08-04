package src.LeetCode75Days;

import java.util.Arrays;

/*
238. Product of Array Except Self

Given an integer array numbs, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of numbs is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: numbs = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: numbs = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */

//Strategy
//	1.	Create two arrays, prefix and suffix, where prefix[i] contains the product of all elements before numbs[i] and suffix[i] contains the product of all elements after nums[i].
//	2.	Traverse the numbs array to fill in the prefix array.
//	3.	Traverse the numbs array in reverse to fill in the suffix array.
//	4.	Construct the answer array where each element at index i is the product of prefix[i] and suffix[i].

public class ArrayProductExceptSelf {
    public static int[] productExceptSelf(int[] numbs) {

        int[] multiples = new int[numbs.length];
        int[] fwdMultiples = new int[numbs.length];
        int[] bkdMultiples = new int[numbs.length];

        int multi = 1;
        for(int i = 0; i < numbs.length; i++){
            fwdMultiples[i] = multi = multi * numbs[i];
        }

        multi = 1;
        for(int i = numbs.length-1; i >= 0; i--){
            bkdMultiples[i] = multi = multi * numbs[i];
        }

        for(int i = 0; i < numbs.length; i++){
            if(i == 0)
                multiples[i] = bkdMultiples[i+1];
            else if(i == numbs.length-1)
                multiples[i] = fwdMultiples[i-1];
            else
                multiples[i] = fwdMultiples[i-1] * bkdMultiples[i+1];
        }

        return multiples;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(ArrayProductExceptSelf.productExceptSelf(new int[]{1,2,3,4})));
    }
}
