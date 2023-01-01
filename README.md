# Data Structures and Algorithms

## Essentials

| Data Structure Implementations | Algorithm Implementations  | Concept Reviews                     |
| :----------------------------- | :------------------------- | :---------------------------------- |
| ArrayList                      | Binary Search (13.12.2022) | Big O notation (13.12.2022)         |
| HashTable                      | Merge Sort (15.12.2022)    | Arrays and Strings (21.12.2022)     |
| StringBuilder                  |                            | Linked Lists (16.12.2022)           |
| Linked List (15.12.2022)       |                            | Stacks and Queues (22.12.2022)      |
| Stack (17.12.2022)             |                            | Trees and Graphs (22.12.2022)       |
| Directional Graph (23.12.2022) |                            | Bit Manipulation (23.12.2022)       |
|                                |                            | Object-Oriented Design (25.12.2022) |
|                                |                            | Dynamic Programming (26.12.2022)    |

# Problem Solving

<!-- use <sup>exponent</> and <sub>base</> -->

## Arrays and Strings

| Resource             | Name                                    | Note                                                               |
| :------------------- | :-------------------------------------- | :----------------------------------------------------------------- |
| CtCI[\*](#resources) | 1.1 Is Unique                           |                                                                    |
|                      | 1.2 Check Permutations                  |                                                                    |
| LeetCode             | 1. Two Sum                              |                                                                    |
|                      | 13. Roman to Integer                    |                                                                    |
|                      | 14. Longest Common Prefix               |                                                                    |
|                      | 26. Remove Duplicates from Sorted Array |                                                                    |
|                      | 66. Plus One                            |                                                                    |
|                      | 88. Merge Sorted Arrays                 | `Inverted insert` to not worry about indexing conflicts            |
|                      | 121. Best Time to Buy and Sell Stock    | Compound the difference between `insant sell` and `overall profit` |
|                      | 125. Valid Palindrome                   |                                                                    |
|                      | 169. Majority Element                   |                                                                    |
|                      | 171. Excel Sheet Column Number          |                                                                    |
|                      | 498. Diagonal Traverse                  |                                                                    |

<br />

## Linked Lists

| Resource             | Name                                  | Note                                      |
| :------------------- | :------------------------------------ | :---------------------------------------- |
| CtCI[\*](#resources) | 2.1 Remove Dups                       |                                           |
|                      | 2.2 Return Kth to Last                |                                           |
| LeetCode             | 21. Merge Two Sorted Lists            | Beware the `pass by reference`            |
|                      | 141. Linked List Cycle                |                                           |
|                      | 160. Intersection of Two Linked Lists | Compare `Nodes` with `HashSet` not values |
| Other                | Reverse Linked List                   |                                           |

<br />

## Stacks and Queues

| Resource             | Name                  | Note                                                                                                                |
| :------------------- | :-------------------- | :------------------------------------------------------------------------------------------------------------------ |
| CtCI[\*](#resources) | 3.2 Stack Min         | A member `min` of class `Stack`, althought sacrificing memory, allows for `O(1) time` access to the minimum element |
| LeetCode             | 20. Valid Parentheses |                                                                                                                     |

<br />

## Trees and Graphs

| Resource             | Name                              | Note                                  |
| :------------------- | :-------------------------------- | :------------------------------------ |
| CtCI[\*](#resources) | 4.1 Route Between Nodes           | Used `Breadth-first search (BFS)`     |
| LeetCode             | 94. Binary Tree Inorder Traversal |                                       |
|                      | 101. Symmetric Tree               | `BFS` with a lot of conditional `if`s |
|                      | 104. Maximum Depth of Binary Tree | `DFS`                                 |

<br />

## Bit Manipulation

| Resource             | Name               | Note                                                                         |
| :------------------- | :----------------- | :--------------------------------------------------------------------------- |
| CtCI[\*](#resources) | 5.1 Insertion      | Masking the target with `And &`, then `OR \|` with `shifted <<` insert value |
| LeetCode             | 136. Single Number | Used `Xor ^` for O(n) time                                                   |

<br />

## Dynamic Programming

| Resource             | Name                                            | Note                                                                    |
| :------------------- | :---------------------------------------------- | :---------------------------------------------------------------------- |
| CtCI[\*](#resources) | 8.1 Triple Steps                                | `Memoization` of the known three first steps and `bottom-up` from there |
| LeetCode             | 69. Sqrt(x)                                     | Return `midpoint` before `midpoint`<sup>`2`</sup>` > x`                 |
|                      | 70. Climbing Stairs                             | See `8.1 Triple Steps`                                                  |
|                      | 108. Convert Sorted Array to Binary Search Tree | `Recursion` with a helper function and `half-and-half` approach         |
|                      | 118. Pascal's Triangle                          |                                                                         |

<br />

## Object-Oriented Design

| Resource             | Name              | Note                                                                                                               |
| :------------------- | :---------------- | :----------------------------------------------------------------------------------------------------------------- |
| CtCI[\*](#resources) | 7.1 Deck of Cards | `Protected` fields and `static factory` used to control `CardGame` subclass instantiation and `Card` list creation |

<br />

---

### Resources

#### \* Cracking The Coding Interview

<br />

---

### How To

<u>Execute code :</u>

```bash
cd $dir/ ;
# first build
javac classes/* ;
# subsequent
ls classes/*.class | xargs rm && javac classes/* ;
java $solution.java ;
```

<u>Cleaning :</u>

```bash
cd $repo/ ;
find . -type f | grep -e "\.class$" | xargs rm ;
```
