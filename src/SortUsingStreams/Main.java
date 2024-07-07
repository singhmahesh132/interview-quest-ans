package src.SortUsingStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        Collections.sort(al);
        al.sort(Comparator.naturalOrder());

        List<Integer> al1 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        al1.stream().sorted().forEach(System.out::print);
        System.out.println();

        List<Integer> al2 = Arrays.asList(0, 1, 0, 0, 0, 1, 0, 1);
        al2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();

        List<Integer> al3 = Arrays.asList(1, 2, 4, 10, 9, 5, 3, 20);
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        al3.forEach(binarySearchTree::insertValue);

        binarySearchTree.inOrderTraversal(binarySearchTree.root);
    }
}
