package src.StreamsProblem.SortUsingStreams;

import java.util.*;

//Quest: sort the list using streams.
public class MySort {

    public static void main(String[] args) {

        //Using Collection's sort() method and List's sort() method.
        List<Integer> al = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        Collections.sort(al);
        al.sort(Comparator.reverseOrder());

        //Using stream's Sorted() method.
        List<Integer> al1 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        al1.stream().sorted().forEach(System.out::print);
        System.out.println();

        //Descending sort using stream's Sorted() method.
        List<Integer> al2 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        al2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();

        //sorting using single for loop by using TreeSet collection.
        List<Integer> al4 = Arrays.asList(1, 2, 4, 2, 10, 9, 5, 3, 20);
        TreeSet<Integer> ts = new TreeSet<>(al4);
        ts.forEach(System.out::print);
        System.out.println();
    }
}
