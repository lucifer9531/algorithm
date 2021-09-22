package com.google.algorithm.sort;

public class Shell {

    public static void sort(Comparable[] a) {
        // 根据数组a的长度 确定增量h的初始值
        int h = 1;
        while (h < a.length / 2) {
            h = 2 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h ; j -= h) {
                    if (greater(a[j - h], a[j])) {
                        exchange(a, j - h, j);
                    } else {
                        break;
                    }
                }
            }
            // 减小h的增量
            h = h / 2;
        }
    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
