package com.shperev.algorithm.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MergeSortImplTest {

    MergeSortImpl mergeSort = new MergeSortImpl();

    public static Stream<Arguments> provideIntArray() {
        return Stream.of(arguments(new Integer[]{90, 200, 34, 12, 30},
                new Integer[]{12, 30, 34, 90, 200}), arguments(new Integer[]{23, 10},
                new Integer[]{10, 23}));
    }

    @ParameterizedTest
    @MethodSource("provideIntArray")
    void givenAnUnSortedArray_whenArraySorted_thenReturnSortedArray(final Integer[] actual,
                                                                    final Integer[] expected) {
        mergeSort.sort(actual);

        assertArrayEquals(expected, actual);
    }

    @Test
    void givenArrayWithOneElement_whenNothingSort_theReturnOriginalArray() {
        Integer[] actual = {1};
        mergeSort.sort(actual);

        assertArrayEquals(new Integer[]{1}, actual);
    }

}