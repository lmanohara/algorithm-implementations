package com.shperev.algorithm.impl;

import com.shperev.algorithm.services.UnionFind;

/**
 * The implementation of the union find based on the path compression algorithm
 */
public class WeightedUnionFindImpl implements UnionFind {

    private final int[] idArray;

    public WeightedUnionFindImpl(final int arraySize) {
        this.idArray = new int[arraySize];
        for (int i = 0; i < this.idArray.length; i++) {
            this.idArray[i] = i;
        }
    }

    /**
     * Constructor for connected with some nodes
     *
     * @param contactedArray some connected nodes
     */
    public WeightedUnionFindImpl(final int[] contactedArray) {
        this.idArray = contactedArray;
    }

    /**
     * Find whether given node p and q are connected
     *
     * @param p given node p
     * @param q given node q
     * @return true if nodes are connected, else false
     */
    @Override
    public boolean find(int p, int q) {

        return root(p) == root(q);
    }

    /**
     * Connect node p to given node q
     *
     * @param p node to connect
     * @param q root node
     * @return id array
     */
    @Override
    public int[] union(int p, int q) {
        int rootOfp = root(p);
        int rootOfq = root(q);

        idArray[rootOfp] = rootOfq;

        return this.idArray;
    }

    /**
     * Find the root node for given node
     *
     * @param i node
     * @return root node
     */
    private int root(int i) {
        while (i != idArray[i]) {
            // set the root for current node to next connected node's root
            idArray[i] = idArray[idArray[i]];

            i = idArray[i];
        }

        return i;
    }
}
