package src.FinalListQuestions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        final List<String> aList = new ArrayList<>();
        aList.add("A");
        aList.forEach(System.out::println);

        //here array list variable cannot be assigned new object since it is final,
        // will give compile error,
        //but we can do all other list operations like add, remove etc.
        //aList = new ArrayList<>();
    }
}
