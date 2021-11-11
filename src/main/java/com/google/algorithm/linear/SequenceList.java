package com.google.algorithm.linear;

import java.util.Iterator;

/**
 * @author iris
 */
public class SequenceList<T> implements Iterable<T> {

    private T[] eles;
    private int n;

    public SequenceList(int capacity) {
        // 初始化数组
        this.eles = (T[]) new Object[capacity];
        // 初始化长度
        this.n = 0;
    }

    /**
     * 将一个线性表置为空表
     */
    public void clear() {
        n = 0;
    }

    /**
     * 判断当前线性表是否是空表
     * @return
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * 获取线性表长度
     * @return
     */
    public int length() {
        return n;
    }

    /**
     * 获取指定位置的元素
     * @param i
     * @return
     */
    public T get(int i) {
        return eles[i];
    }

    public void insert(T t) {
        if (n == eles.length) {
            resize(2 * eles.length);
        }
        eles[n++] = t;
    }

    public void insert(int i, T t) {
        if (n == eles.length) {
            resize(2 * eles.length);
        }
        // 先把i索引处的元素及后面的元素依次向后移动一位
        for (int j = n; j > i; j--) {
            eles[j] = eles[j - 1];
        }
        // 再把t元素放到i索引处即可
        eles[i] = t;
        // 元素个数+1
        n++;
    }

    /**
     * 删除指定位置i处的元素，并返回该元素
     * @param i
     * @return
     */
    public T remove(int i) {
        T current = eles[i];
        for (int j = i; j < n - 1; j++) {
            eles[j] = eles[j + 1];
        }
        n--;
        if (n < eles.length / 4) {
            resize(eles.length / 2);
        }
        return current;
    }

    /**
     * 查询t元素第一次出现的位置
     * @param t
     * @return
     */
    public int indexOf(T t) {
        for (int i = 0; i < n; i++) {
            if (eles[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 根据参数newSize，重置eles的大小
     * @param newSize
     */
    public void resize(int newSize) {
        T[] temp = eles;
        eles = (T[]) new Object[newSize];
        for (int i = 0; i < n; i++) {
            eles[i] = temp[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator {
        private int cusor;
        public SIterator() {
            this.cusor = 0;
        }

        @Override
        public boolean hasNext() {
            return cusor < n;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
