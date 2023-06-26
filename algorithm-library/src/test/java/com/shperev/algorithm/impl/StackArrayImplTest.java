package com.shperev.algorithm.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackArrayImplTest {
    @Test
    void givenItem_whenPushToStack_thenStackShouldNotEmpty() {
        StackArrayImpl<String> stringStackArray = new StackArrayImpl<>();
        stringStackArray.push("data1");

        boolean actual = stringStackArray.isEmpty();

        assertFalse(actual);
    }

    @Test
    void givenInitialStack_whenNoItems_thenStackShouldEmpty() {
        StackArrayImpl<String> stringStackArray = new StackArrayImpl<>();
        boolean actual = stringStackArray.isEmpty();

        assertTrue(actual);
    }

    @Test
    void performPop_whenItemRemoveFromStack_thenShouldReturnItem() {
        StackArrayImpl<String> stringStackArray = new StackArrayImpl<>();
        stringStackArray.push("data1");
        stringStackArray.push("data2");

        String actual = stringStackArray.pop();

        assertEquals("data2", actual);
    }

    @Test
    void performPop_whenStackIsEmpty_theShouldThrowException() {
        StackArrayImpl<String> stringStackArray = new StackArrayImpl<>();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, stringStackArray::pop);

        assertEquals("Stack is empty", exception.getMessage());
    }

}