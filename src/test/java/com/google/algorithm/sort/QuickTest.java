package com.google.algorithm.sort;

import java.util.Arrays;

public class QuickTest {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
