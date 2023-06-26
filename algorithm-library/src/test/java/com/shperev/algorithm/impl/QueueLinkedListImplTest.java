package com.shperev.algorithm.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueLinkedListImplTest {

    @Test
    void givenQueue_whenQueueIsEmpty_thenShouldReturnTrue() {
        QueueLinkedListImpl<String> stringQueueLinkedList = new QueueLinkedListImpl<>();

        boolean actual = stringQueueLinkedList.isEmpty();

        assertTrue(actual);
    }

    @Test
    void givenItem_whenAddToQueue_thenShouldReturnFalse() {
        QueueLinkedListImpl<String> stringQueueLinkedList = new QueueLinkedListImpl<>();
        stringQueueLinkedList.enqueue("data1");

        boolean actual = stringQueueLinkedList.isEmpty();

        assertFalse(actual);
    }

    @Test
    void givenQueue_whenRemoveItem_thenShouldReturnRemovedItem() {
        QueueLinkedListImpl<String> stringQueueLinkedList = new QueueLinkedListImpl<>();
        stringQueueLinkedList.enqueue("data1");
        stringQueueLinkedList.enqueue("data2");

        String actual = stringQueueLinkedList.dequeue();

        assertEquals("data1", actual);
    }


    @Test
    void givenEmptyQueue_whenDequeue_theShouldThrowException() {
        QueueLinkedListImpl<String> stringQueueLinkedList = new QueueLinkedListImpl<>();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, stringQueueLinkedList::dequeue);

        assertEquals("Queue is empty", exception.getMessage());
    }

}