package src.StreamsProblem.FindMissingNumber;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

//Ques: find the missing number from the list without sorting.
public class MissingNumber {

    public static void main(String[] args){

        //Using set over list, because get operation on set is faster.
        Set<Integer> mySet =  Set.of(5,10,1,19,2,11,12,13,6,14,17,16,18,4,3,7,8,9,20);

        //Simply iterate until set.size()+1, since one element is missing so actual size should be +1 of current.
        //keep doing contains(i), you will get elements not present.
        for(int i = 1; i <= mySet.size()+1 ; i++){
            if(!mySet.contains(i)){
                System.out.println(i+" is Not found");
            }
        }
    }
}
