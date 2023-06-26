package com.shperev.algorithm.services;

/**
 * The interface defines for common operation for queue
 *
 * @param <T> type of the item
 */
public interface Queue<T> {

    /**
     * Check whether queue is empty
     *
     * @return true if queue is empty, or else false
     */
    boolean isEmpty();

    /**
     * Add item to the end of the queue
     *
     * @param t item
     */
    void enqueue(T t);

    /**
     * Remove item from the front of the queue
     *
     * @return item that removed
     */
    T dequeue();
}
