package com.shperev.algorithm.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackLinkedListImplTest {


    @Test
    void givenItem_whenPushToStack_thenStackShouldNotEmpty() {
        StackLinkedListImpl<String> stringStackLinkedList = new StackLinkedListImpl<>();
        stringStackLinkedList.push("data1");

        boolean actual = stringStackLinkedList.isEmpty();

        assertFalse(actual);
    }

    @Test
    void givenInitialStack_whenNoItems_thenStackShouldEmpty() {
        StackLinkedListImpl<String> stringStackLinkedList = new StackLinkedListImpl<>();
        boolean actual = stringStackLinkedList.isEmpty();

        assertTrue(actual);
    }

    @Test
    void performPop_whenItemRemoveFromStack_thenShouldReturnItem() {
        StackLinkedListImpl<String> stringStackLinkedList = new StackLinkedListImpl<>();
        stringStackLinkedList.push("data1");
        stringStackLinkedList.push("data2");

        String actual = stringStackLinkedList.pop();

        assertEquals("data2", actual);
    }

    @Test
    void performPop_whenStackIsEmpty_thenShouldThrowException() {
        StackLinkedListImpl<String> stringStackLinkedList = new StackLinkedListImpl<>();

        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, stringStackLinkedList::pop);

        assertEquals("Stack is empty", exception.getMessage());
    }

    @Test
    void givenLinkedStack_whenIterateThroughItems_thenShouldReturnEachItem() {
        StackLinkedListImpl<String> stringStackLinkedList = new StackLinkedListImpl<>();
        stringStackLinkedList.push("data1");
        stringStackLinkedList.push("data2");
        stringStackLinkedList.push("data4");

        for (String item :
                stringStackLinkedList) {
            assertNotNull(item);
        }
    }
}