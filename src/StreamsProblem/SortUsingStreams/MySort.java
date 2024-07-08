package src.StreamsProblem.SortUsingStreams;

import java.util.*;

public class MySort {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        Collections.sort(al);
        al.sort(Comparator.reverseOrder());

        List<Integer> al1 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        al1.stream().sorted().forEach(System.out::print);
        System.out.println();

        List<Integer> al2 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        al2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();

        List<Integer> al4 = Arrays.asList(1, 2, 4, 2, 10, 9, 5, 3, 20);
        TreeSet<Integer> ts = new TreeSet<>(al4);
        ts.forEach(System.out::print);
        System.out.println();

        List<Integer> al5 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        TreeSet<Integer> ts1 = new TreeSet<>(al5);
        ts1.forEach(System.out::print);
    }
}
