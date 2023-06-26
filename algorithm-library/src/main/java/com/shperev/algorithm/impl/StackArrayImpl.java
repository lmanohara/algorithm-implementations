package com.shperev.algorithm.impl;

import com.shperev.algorithm.services.Stack;

public class StackArrayImpl<T> implements Stack<T> {
    private static final int INITIAL_STACK_SIZE = 1;
    private Object[] stack;
    private int N = 0;

    StackArrayImpl() {
        this.stack = new Object[INITIAL_STACK_SIZE];
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public void push(T t) {
        if (N == stack.length) {
            // doubling the array every time when array is full
            resize(2 * stack.length);
        }

        stack[N++] = t;
    }

    @Override
    public T pop() {
        if (N == 0) {
            throw new IllegalArgumentException("Stack is empty");
            // if array size is 1/4 when popping the item, then shrink the array into 1/2
        } else if (N > 0 && N == stack.length / 4) {
            resize(stack.length / 2);
        }
        Object object = stack[--N];
        stack[N] = null;

        return (T) object;
    }

    private void resize(int size) {
        Object[] copyOfStack = new Object[size];
        for (int i = 0; i < N; i++) {
            copyOfStack[i] = stack[i];
        }

        this.stack = copyOfStack;
    }
}
