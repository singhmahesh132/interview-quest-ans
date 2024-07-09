package src.MakingHighestSum;

import java.util.stream.Stream;

//Ques: Find the pair which makes the highest sum
public class PairsMakingHighestSum {
    public static void main(String[] args) {
        Integer[] arr = {1, -2, 5, 3, -4, 10, 6, 9, 4, 2, -9, -2};

        int max = Stream.of(arr).max(Integer::compareTo).get();

        //int secondMax = Stream.of(arr).sorted().limit(arr.length-1).max(Integer::compareTo).get();
        int secondMax = Stream.of(arr).sorted().filter(num -> num != max).max(Integer::compareTo).get();

        System.out.println("pair is : "+max+":"+secondMax);
    }
}
