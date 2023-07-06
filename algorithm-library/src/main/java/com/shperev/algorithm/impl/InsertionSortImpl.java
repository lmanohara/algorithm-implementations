package com.shperev.algorithm.impl;

import com.shperev.algorithm.services.AbstractSort;

public class InsertionSortImpl extends AbstractSort {
    @Override
    protected void sort(Comparable[] a) {

        int N = a.length;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    swap(a, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
