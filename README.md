# Algorithm Implementations

This project includes the implementation of most common algorithms and data stractures

## Algorithms

### Union find path compression

- Union operation: connect two objects
- Find operation: check whether given two objects are connected
    - Time complexity
        - Find `O(log(n))`
        - Union `O(log(n))`

### Stack data structure

- Push operation: add item into the stack
- Pop operation: remove item from the stack
    - Time complexity
        - Push `O(1)`
        - Pop `O(1)`

### Selection sort

- Select an element, find the smallest value in remaining array.
- Swap the selected element and minimum.
- Repeat until complete list is sorted.
    - Time complexity
        - `O(n^2)`

### Insertion sort

- Compare the current element in sorted part of the array.
- If current element grater than the last element in sorted array, continue to the iteration.
- If current element less than the last element in sorted array, insert the value in correct position.
- Repeat until complete list is sorted.
    - Time complexity
        - `O(n^2)`

## Acknowledgements

- [Coursera Algorithms, Part 1](https://www.coursera.org/learn/algorithms-part1)
