package com.shperev.algorithm.impl;

import com.shperev.algorithm.services.Stack;

import java.util.Objects;

public class StackArrayImpl<T> implements Stack<T> {
    private final Object [] stack;
    private int N = 0;

    StackArrayImpl(int arraySize) {
        this.stack = new Object[arraySize];
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public void push(T t) {
        stack[N++] = t;
    }

    @Override
    public T pop() {
        if(N == 0){
            throw new IllegalArgumentException("Stack is empty");
        }
        Object object = stack[--N];
        stack[N] = null;

        return (T) object;
    }
}
