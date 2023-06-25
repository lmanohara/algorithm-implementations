package com.shperev.algorithm.services;

/**
 * This interface includes the common operation for Union find algorithm
 */
public interface UnionFind {

    /**
     * Check whether p and q are connected
     *
     * @param p first node
     * @param q connected node
     * @return true if the nodes are connected, or else return false
     */
    boolean find(int p, int q);

    /**
     * Connect p and q
     *
     * @param p first node
     * @param q node to connect
     * @return id array with connected nodes
     */
    int[] union(int p, int q);

}
