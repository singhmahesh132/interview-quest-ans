package src.FinalListQuestions;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingFinal {
    void show(Integer i){System.out.println("integer");}
    /*void show(String s){System.out.println("string");}*/
    void show(Object o){System.out.println("object");}

    public static void main(String[] args){

        UnderstandingFinal s = new UnderstandingFinal();
        s.show( null);


        final List<String> aList = new ArrayList<>();
        aList.add("A");
        aList.forEach(System.out::println);

        //here array list variable cannot be assigned new object since it is final,
        // will give compile error,
        //but we can do all other list operations like add, remove etc.
        //aList = new ArrayList<>();
    }
}
