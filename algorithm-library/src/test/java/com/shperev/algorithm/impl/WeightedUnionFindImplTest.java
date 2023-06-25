package com.shperev.algorithm.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class WeightedUnionFindImplTest {

    public static Stream<Arguments> provideConnectedNodes() {

        return Stream.of(
                arguments(1, 0, new int[]{0, 1, 2}, new int[]{0, 0, 2}),
                arguments(2, 1, new int[]{0, 0, 2}, new int[]{0, 0, 0}));
    }

    public static Stream<Arguments> provideFindArgs() {
        return Stream.of(arguments(1, 0, new int[]{0, 0, 0, 3}), arguments(3, 0, new int[]{0, 0, 0, 2}));
    }


    @ParameterizedTest
    @MethodSource("provideConnectedNodes")
    void givenNodes_whenApplyUnionOperation_thenShouldReturnIdArray(int p, int q, int[] previousArrayState,
                                                                    int[] expectedIdArray) {

        WeightedUnionFindImpl weightedUnionFind = new WeightedUnionFindImpl(previousArrayState);

        int[] actualIdArray = weightedUnionFind.union(p, q);

        assertArrayEquals(expectedIdArray, actualIdArray);
    }

    @ParameterizedTest
    @MethodSource("provideFindArgs")
    void givenNodes_whenNodeAreConnected_thenShouldReturnTrue(int p, int q, int[] previousIdArray) {
        WeightedUnionFindImpl weightedUnionFind = new WeightedUnionFindImpl(previousIdArray);

        boolean actualValue = weightedUnionFind.find(p, q);

        assertTrue(actualValue);
    }

    @Test
    void givenNodes_whenNodesAreNotConnected_thenShouldReturnFalse() {
        WeightedUnionFindImpl weightedUnionFind = new WeightedUnionFindImpl(new int[]{0, 0, 2});

        boolean actualValue = weightedUnionFind.find(2, 1);

        assertFalse(actualValue);
    }
}