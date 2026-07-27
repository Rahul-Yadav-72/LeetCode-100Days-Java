# 🚀 Day 05 – 100 Days of LeetCode Challenge

**📅 Date:** 27 July 2026

---

## 📌 Problems Solved

| Problem No. | Problem Name                             | Difficulty | Topic         |
| ------------ | ---------------------------------------- | ---------- | ------------- |
| 167          | Two Sum II - Input Array Is Sorted       | Medium     | Two Pointers  |
| 977          | Squares of a Sorted Array                | Easy       | Two Pointers  |

---

## 💡 Approaches

### 167. Two Sum II - Input Array Is Sorted

- Used the **Two Pointers** technique.
- Initialized one pointer at the beginning and another at the end of the sorted array.
- Compared the sum of both elements with the target.
- If the sum was greater than the target, moved the right pointer to the left.
- If the sum was smaller than the target, moved the left pointer to the right.
- Returned the **1-based indices** of the two numbers whose sum equals the target.

---

### 977. Squares of a Sorted Array

- Used the **Two Pointers** technique.
- Compared the squares of the leftmost and rightmost elements.
- Placed the larger square at the end of the result array.
- Moved the corresponding pointer inward and continued until all elements were processed.
- Produced a sorted array of squared values in linear time.

---

## ⚡ Complexity Analysis

| Problem                              | Time Complexity | Space Complexity |
| ------------------------------------ | --------------- | ---------------- |
| Two Sum II                           | O(n)            | O(1)             |
| Squares of a Sorted Array            | O(n)            | O(n)             |

---

## 📂 Solution Files

- `Problems/TwoPointers/TwoSumII_167.java`
- `Problems/TwoPointers/SortedSquares_977.java`

---

## 📚 Key Learnings

- Strengthened understanding of the **Two Pointers** technique.
- Learned how sorted arrays help eliminate the need for nested loops.
- Practiced solving problems with linear time complexity.
- Improved confidence in pointer manipulation and array traversal.
- Continued writing clean and efficient Java solutions.

---

## 📊 Day Summary

- ✅ Problems Solved: **2**
- 🟢 Easy: **1**
- 🟡 Medium: **1**
- 🔴 Hard: **0**
- 📂 Topics Covered:
  - Two Pointers
  - Arrays
- 💻 Language: Java

---

## 🎯 Next Goal

- Continue with **Day 06**.
- Solve more Two Pointers and Sliding Window problems.
- Focus on writing optimized and interview-ready solutions.
- Maintain consistency in the **#100DaysOfLeetCode** challenge.

---

> **Every day you solve a problem, you become a better programmer than yesterday. Keep going! 🚀**