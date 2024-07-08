package src.StreamsProblem.FindMissingNumber;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MissingNumber {
    public static void main(String[] args){
        List<Integer> list =  Arrays.asList(5,10,1,19,2,11,12,13,14,15,17,16,18,20,4,3,7,8,9);
        Optional<Integer> maxNum = list.stream().max(Integer::compare);
        for(int i = 1; i < maxNum.get() ; i++){
            if(!list.contains(i)){
                System.out.println(i+"Not found");
            }
        }
    }
}
