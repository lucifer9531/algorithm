package com.google.algorithm.sort;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
