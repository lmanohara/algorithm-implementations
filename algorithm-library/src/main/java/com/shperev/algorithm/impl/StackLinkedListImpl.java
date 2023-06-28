package com.shperev.algorithm.impl;

import com.shperev.algorithm.services.Stack;

import java.util.Iterator;
import java.util.Objects;

public class StackLinkedListImpl<T> implements Stack<T>, Iterable<T> {

    private Node<T> firstNode = null;

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public void push(T t) {
        Node<T> previousNode = firstNode;

        firstNode = new Node<>();
        firstNode.item = t;
        firstNode.next = previousNode;
    }

    @Override
    public T pop() {

        if (Objects.isNull(firstNode)) {
            throw new IllegalArgumentException("Stack is empty");
        }

        T item = firstNode.item;
        firstNode = firstNode.next;

        return item;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private Node<T> currentNode = firstNode;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {

            T item = currentNode.item;
            currentNode = currentNode.next;

            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove method is invalid");
        }
    }
}
