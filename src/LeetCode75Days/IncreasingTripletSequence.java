package src.LeetCode75Days;

/*
334. Increasing Triplet Subsequence
Given an integer array nums, return true if there exists a triple of indices (i, j, k)
such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

Example 1:
Input: nums = [1,2,3,4,5]
Output: true

Example 2:
Input: nums = [5,4,3,2,1]
Output: false

Example 3:
Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

Example 4:
Input: nums = [20,100,10,12,5,13]
Output: true
 */
public class IncreasingTripletSequence {
    public static boolean increasingTriplet(int[] nums) {

        //Strategy is we will traverse the array and arrange three numbers
        //in increasing order using two variables i.e. first and second.
        if(nums == null || nums.length < 3)
            return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int number : nums){
            if(number <= first)
                first = number;
            else if(number <= second)
                second = number;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(IncreasingTripletSequence.increasingTriplet(new int[]{20,100,21,22,7,100,5,10,9,12,6,13}));
    }
}
