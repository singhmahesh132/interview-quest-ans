package src.SortUsingBST;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        Collections.sort(al);

        List<Integer> al1 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        al1.stream().sorted().forEach(System.out::print);

        List<Integer> al2 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);

    }
}
