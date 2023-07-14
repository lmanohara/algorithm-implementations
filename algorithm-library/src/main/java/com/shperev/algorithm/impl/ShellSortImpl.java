package com.shperev.algorithm.impl;

import com.shperev.algorithm.services.AbstractSort;

public class ShellSortImpl extends AbstractSort {

    @Override
    protected void sort(Comparable[] a) {

        int N = a.length;
        // compute the h
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1; // 1, 4
        }

        while (h >= 1) {
            // insertion sort
            for (int i = h; i < N; i++) {
                // first swap the items in between gaps
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    swap(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }
}
