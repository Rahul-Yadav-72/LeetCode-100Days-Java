# 🚀 Day 02 – 100 Days of LeetCode Challenge

**📅 Date:** 24 July 2026

---

## 📌 Problems Solved

| Problem No. | Problem Name           | Difficulty | Topic               |
| ----------- | ---------------------- | ---------- | ------------------- |
| 509         | Fibonacci Number       | Easy       | Dynamic Programming |
| 1137        | N-th Tribonacci Number | Easy       | Dynamic Programming |

---

## 💡 Approaches

### 509. Fibonacci Number

- Used an **iterative Dynamic Programming** approach.
- Stored only the previous two Fibonacci numbers.
- Avoided recursion to achieve constant space complexity.

```java
prev = 0;
curr = 1;

for (int i = 2; i <= n; i++) {
    int next = prev + curr;
    prev = curr;
    curr = next;
}
```

---

### 1137. N-th Tribonacci Number

- Used an **iterative Dynamic Programming** approach.
- Stored the previous three Tribonacci numbers.
- Updated the values in each iteration until the nth term was reached.

---

## ⚡ Complexity Analysis

| Problem                | Time Complexity | Space Complexity |
| ---------------------- | --------------- | ---------------- |
| Fibonacci Number       | O(n)            | O(1)             |
| N-th Tribonacci Number | O(n)            | O(1)             |

---

## 📂 Solution Files

- `Problems/DynamicProgramming/FibonacciNumber_509.java`
- `Problems/DynamicProgramming/N_thTribonacciNumber_1137.java`

---

## 📚 Key Learnings

- Learned the fundamentals of Dynamic Programming.
- Understood recurrence relations through Fibonacci and Tribonacci sequences.
- Practiced the Bottom-Up (Tabulation) approach.
- Optimized solutions by reducing space complexity from O(n) to O(1).
- Improved Java implementation for Dynamic Programming problems.

---

## 📊 Day Summary

- ✅ Problems Solved: **2**
- 🟢 Easy: **2**
- 🟡 Medium: **0**
- 🔴 Hard: **0**
- 📂 Topics Covered:
  - Dynamic Programming
- 💻 Language: Java

---

## 🎯 Next Goal

- Continue with **Day 03**.
- Learn **Memoization** and **Tabulation** in depth.
- Solve more Dynamic Programming problems.
- Maintain consistency in the #100DaysOfCode challenge.

---

> **Small improvements every day lead to remarkable results. Keep coding! 🚀**
