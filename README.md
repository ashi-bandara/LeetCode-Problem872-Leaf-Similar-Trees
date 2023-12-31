
# LeetCode Challenge D17
## Achievements
[![image.png](https://i.postimg.cc/C5K79rmB/image.png)](https://postimg.cc/ft6Y9C4D)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [872.  Leaf-Similar Trees](https://leetcode.com/problems/leaf-similar-trees/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a *leaf value sequence*.
Two binary trees are considered  _leaf-similar_ if their leaf value sequence is the same. Return  `true`  if and only if the two given trees with head nodes  `root1`  and  `root2`  are leaf-similar.

**Example**
![](https://assets.leetcode.com/uploads/2020/09/03/leaf-similar-1.jpg)
>**Input:**
>
>root1 = [3,5,1,6,2,9,8,null,null,7,4],
>
>root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
>
>**Output:** true

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview

To solve the problem, we need to traverse two binary trees and compare the sequences of leaf node values. The  approach involves performing a depth-first traversal on each tree, collecting the values of leaf nodes in a left-to-right order. This is achieved through a recursive process, distinguishing leaf nodes and appending their values to a list. After traversing both trees, we compare the resulting lists. If the lists match, the trees are considered leaf-similar, and the function returns true; otherwise, it returns false.
