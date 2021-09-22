package com.google.algorithm.sort;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a = {4, 6, 8, 3, 7, 9, 5, 2, 10, 1};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
