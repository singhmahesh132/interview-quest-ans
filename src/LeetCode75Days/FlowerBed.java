package src.LeetCode75Days;

/*
605. Can Place Flowers

You have a long flowerbed in which some of the plots are planted, and some are not. However,
flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
and an integer n, return true if n new flowers can be planted in the flowerbed without violating
the no-adjacent-flowers rule and false otherwise.


Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
*/
public class FlowerBed {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ctr = 0;
        int i = 0;
        if(flowerbed.length == 1 && flowerbed[i] == 0)
            return true;
        while(i < flowerbed.length && ctr!=n){
            if(i==0){
                if(flowerbed[i]==0 && flowerbed[i+1] == 0){
                    flowerbed[i] = 1;
                    ctr++;
                }
                i++;
            }
            else if(i==flowerbed.length-1){
                if(flowerbed[i]==0 && flowerbed[i-1] == 0){
                    flowerbed[i] = 1;
                    ctr++;
                }
                i++;
            }
            else {
                if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i] = 1;
                    ctr++;
                }
                i++;
            }
        }
        return ctr==n;
    }

    public static void main(String[] args){
        System.out.println(FlowerBed.canPlaceFlowers(new int[]{1, 0, 0, 0, 1},1));
    }
}
