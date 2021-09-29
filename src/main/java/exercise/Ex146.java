package exercise;

import java.util.*;

import ads.BinaryTree.*;

//Write a Java program to convert an sorted array to binary search tree

public class Ex146 {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 ,8 ,9 ,10};

        System.out.println(Arrays.toString(arr));

        BinaryTree tree = new BinaryTree();

        reorderArrayBase(arr, 0, arr.length, tree);
    }

    static void reorderArrayBase(Integer[] arr, int start, int end, BinaryTree tree) {
        if (start >= end) {
            return;
        }

        int middle = (start + end) % 2 == 1 ? (start + end) / 2 : (start + end) / 2 - 1;
        tree.add(arr[middle]);
        System.out.println(String.format("%d %d", middle, arr[middle]));
        reorderArrayBase(arr, start, middle, tree);
        reorderArrayBase(arr, middle + 1, end, tree);
    }

}
