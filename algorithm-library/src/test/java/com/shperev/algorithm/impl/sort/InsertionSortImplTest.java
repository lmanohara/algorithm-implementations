package com.shperev.algorithm.impl.sort;

import com.shperev.algorithm.impl.sort.InsertionSortImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class InsertionSortImplTest {

    InsertionSortImpl insertionSort = new InsertionSortImpl();

    public static Stream<Arguments> provideIntArrays() {
        return Stream.of(arguments(new Integer[]{10, 4, 1}, new Integer[]{1, 4, 10}),
                arguments(new Integer[]{1, 2, 3, 4}, new Integer[]{1, 2, 3, 4}), arguments(new Integer[]{3, -1, -3},
                        new Integer[]{-3, -1, 3}));
    }

    public static Stream<Arguments> provideStringArrays() {
        return Stream.of(arguments(new String[]{"c", "b", "a"}, new String[]{"a", "b", "c"}),
                arguments(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
    }

    @ParameterizedTest
    @MethodSource("provideIntArrays")
    void givenIntArray_whenArraySorted_thenShouldSortedOriginalArray(Comparable[] actualArray,
                                                                     Comparable[] expectedSortedArray) {

        insertionSort.sort(actualArray);

        assertArrayEquals(expectedSortedArray, actualArray);
    }

    @ParameterizedTest
    @MethodSource("provideStringArrays")
    void givenStringArray_whenArraySorted_thenShouldSortedOriginalArray(Comparable[] actualArray,
                                                                        Comparable[] expectedSortedArray) {

        insertionSort.sort(actualArray);

        assertArrayEquals(expectedSortedArray, actualArray);
    }

}