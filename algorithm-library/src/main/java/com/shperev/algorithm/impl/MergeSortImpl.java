package com.shperev.algorithm.impl;

import com.shperev.algorithm.services.AbstractSort;

public class MergeSortImpl extends AbstractSort {
    @Override
    protected void sort(Comparable[] a) {

    }


    private void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        // Copy elements in original array to auxiliary array
        for (int k = 0; k <= hi; k++) {
            aux[k] = a[k];
        }

        int i = lo;
        int j = mid + 1;

        // Merge auxiliary array into the original array
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }

    }
}
