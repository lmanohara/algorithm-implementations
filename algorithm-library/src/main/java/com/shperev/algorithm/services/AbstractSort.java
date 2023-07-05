package com.shperev.algorithm.services;

/**
 * The abstract class defines common methods for implementing sorting algorithms
 */
public abstract class AbstractSort {

    /**
     * The abstract method that implements the sorting algorithms
     *
     * @param a array to sort
     */
    protected abstract void sort(Comparable[] a);

    /**
     * Compare v < w
     *
     * @param v element to compare
     * @param w element to compare against
     * @return if v < w, return true, or else false
     */
    protected boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * Swap the given two objects in the array
     *
     * @param a array
     * @param i index of the first object
     * @param j index of the object to swap
     */
    protected void swap(Comparable[] a, int i, int j) {
        var temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
