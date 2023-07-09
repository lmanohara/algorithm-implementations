package com.shperev.algorithm.impl;

import com.shperev.algorithm.services.AbstractSort;

/**
 * Steps of the insertion sort
 * <ul>
 *     <li> Compare the current element in sorted part of the array</li>
 *     <li> If current element grater than the last element in sorted array, continue to next iteration </li>
 *     <li> If current element less than the last element in sorted array, insert the value in correct position </li>
 * </ul>
 */
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
