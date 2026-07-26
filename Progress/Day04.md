# 🚀 Day 04 – 100 Days of LeetCode Challenge

**📅 Date:** 26 July 2026

---

## 📌 Problems Solved

| Problem No. | Problem Name   | Difficulty | Topic                |
| ----------- | -------------- | ---------- | -------------------- |
| 27          | Remove Element | Easy       | Arrays, Two Pointers |
| 268         | Missing Number | Easy       | Arrays, Math         |

---

## 💡 Approaches

### 27. Remove Element

- Used the **Two Pointers** approach.
- Traversed the array once.
- Maintained a pointer `k` to store the position of valid elements.
- Whenever an element was not equal to `val`, it was placed at index `k`, and `k` was incremented.
- Returned `k`, which represents the number of elements remaining after removing all occurrences of `val`.

---

### 268. Missing Number

- Used the **Mathematical Sum Formula**.
- Calculated the expected sum of numbers from **0 to n** using:

```java
expectedSum = n * (n + 1) / 2;
```

- Calculated the actual sum of the array elements.
- The missing number is the difference between the expected sum and the actual sum.

---

## ⚡ Complexity Analysis

| Problem        | Time Complexity | Space Complexity |
| -------------- | --------------- | ---------------- |
| Remove Element | O(n)            | O(1)             |
| Missing Number | O(n)            | O(1)             |

---

## 📂 Solution Files

- `Problems/Arrays/RemoveElement_27.java`
- `Problems/Arrays/MissingNumber_268.java`

---

## 📚 Key Learnings

- Practiced the **Two Pointers** technique for in-place array modification.
- Learned how to solve array problems using mathematical formulas.
- Improved understanding of array traversal with constant extra space.
- Continued writing clean and efficient Java solutions.

---

## 📊 Day Summary

- ✅ Problems Solved: **2**
- 🟢 Easy: **2**
- 🟡 Medium: **0**
- 🔴 Hard: **0**
- 📂 Topics Covered:
  - Arrays
  - Two Pointers
  - Math
- 💻 Language: Java

---

## 🎯 Next Goal

- Continue with **Day 05**.
- Solve more array-based problems.
- Practice different approaches to improve problem-solving skills.
- Maintain consistency in the #100DaysOfCode challenge.

---

> **Consistency is the key to mastering Data Structures and Algorithms. Keep coding! 🚀**
