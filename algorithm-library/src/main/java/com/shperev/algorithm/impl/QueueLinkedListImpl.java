package com.shperev.algorithm.impl;

import com.shperev.algorithm.services.Queue;

public class QueueLinkedListImpl<T> implements Queue<T> {
    private Node<T> first, last;

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void enqueue(T t) {
        Node<T> oldLast = last;
        last = new Node<>();
        last.item = t;
        last.next = null;

        // if queue is empty, first node and last node are same
        if (isEmpty()) {
            first = last;

        } else {
            // if there is first and last node, the old last node should be pointed to the new last node
            oldLast.next = last;
        }
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }

        Node<T> oldFirstNode = first;
        first.next = null;

        return oldFirstNode.item;
    }
}
