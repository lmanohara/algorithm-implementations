package com.shperev.algorithm.impl;

import com.shperev.algorithm.services.Stack;

import java.util.Objects;

public class StackLinkedListImpl<T> implements Stack<T> {

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
}
