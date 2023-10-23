package com.shperev.algorithm.impl.sort;

import com.shperev.algorithm.services.AbstractSort;

public class SelectionSortImpl extends AbstractSort {

    /**
     * Steps of the selection sort algorithm
     * Select an element in the arrays
     * Iterate through the rest of the array to find the minimum value compare to the selected value
     * Swap first selected value against the minimum value found
     *
     * @param a array to sort
     */
    @Override
    public void sort(Comparable[] a) {

        int N = a.length;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }

            }

            swap(a, i, min);
        }
    }
}
