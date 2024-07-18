package src.PairsMakingSum;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Ques: Find the pairs in the array which make sum 8
public class PairMakingSum {

    public static void main(String[] args) {
        Integer[] arr = {3,5,2,4,6,1,7,4};
        int sum = 8;

        Set<Integer> set = new HashSet<>();

        List.of(arr).forEach(num -> {
            if(set.contains(sum-num))
                    System.out.println("pair= "+num+","+(sum-num));
            else
                set.add(num);
        });
    }
}
