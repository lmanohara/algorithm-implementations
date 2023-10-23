package com.shperev.algorithm.impl.sort;

public class BottomUpMergeSort extends MergeSortImpl {

    private static Comparable [] aux;
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        for(int sz = 1; sz < N; sz = sz + sz){
        }
    }

}
