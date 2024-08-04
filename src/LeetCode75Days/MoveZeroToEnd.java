package src.LeetCode75Days;

import java.util.Arrays;

/*
283. Move Zeroes
Given an integer array, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 */
public class MoveZeroToEnd {

    public static void moveZeroesToStart(int[] numbs) {

        if (numbs.length == 1)
            return;
        int ptr = 0;
        for (int num : numbs) {
            if (num != 0)
                numbs[ptr++] = num;
        }

        while (ptr < numbs.length) {
            numbs[ptr++] = 0;
        }

        System.out.println(Arrays.toString(numbs));
    }

    public static void main(String[] args) {
        int[] numbs = {0, 1, 0, 0, 0, 0, 2, 0, 3, 0};
        MoveZeroToEnd.moveZeroesToStart(numbs);
    }
}
