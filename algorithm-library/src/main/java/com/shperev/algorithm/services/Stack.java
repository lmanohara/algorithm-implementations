package com.shperev.algorithm.services;

/**
 * The inference includes common operations for stack data structure
 */
public interface Stack<T> {

    /**
     * Check whether stack is empty
     *
     * @return true if stack is empty, else false
     */
    boolean isEmpty();

    /**
     * Push item to the stack
     *
     * @param t item
     */
    void push(T t);

    /**
     * Pop item from the stack
     *
     * @return item
     */
    T pop();

}
