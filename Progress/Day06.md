# 🚀 Day 06 – 100 Days of LeetCode Challenge

**📅 Date:** 28 July 2026

---

## 📌 Problems Solved

| Problem No. | Problem Name                 | Difficulty | Topic              |
| ----------- | ---------------------------- | ---------- | ------------------ |
| 238         | Product of Array Except Self | Medium     | Arrays, Prefix Sum |
| 319         | Bulb Switcher                | Medium     | Math               |

---

## 💡 Approaches

### 238. Product of Array Except Self

- Solved without using the division operator by utilizing **Prefix and Suffix Products**.
- Created a `right` array to pre-calculate and store the product of all elements to the right of each index.
- Iterated from right to left to populate the `right` product array.
- Maintained a running `left` product variable, starting at 1.
- Iterated from left to right, computing the final answer for each index by multiplying the running `left` product with the pre-computed `right[i+1]` value.
- Achieved linear time complexity by decoupling the left and right product computations.

---

### 319. Bulb Switcher

- Used **Mathematical Deduction** to optimize the solution.
- Recognized that a bulb remains ON only if it is toggled an odd number of times.
- A number has an odd number of factors _only_ if it is a perfect square.
- Instead of simulating the bulb toggles, the problem reduces to finding the number of perfect squares up to `n`.
- Implemented a `while` loop to count perfect squares (`i * i <= n`), effectively achieving $O(\sqrt{n})$ time complexity.

---

## ⚡ Complexity Analysis

| Problem                      | Time Complexity | Space Complexity |
| ---------------------------- | --------------- | ---------------- |
| Product of Array Except Self | O(n)            | O(n)             |
| Bulb Switcher                | O(√n)           | O(1)             |

---

## 📂 Solution Files

- `Problems/Arrays/ProductOfArrayExceptSelf_238.java`
- `Problems/Math/BulbSwitcher_319.java`

---

## 📚 Key Learnings

- Learned how to avoid division in array product problems using prefix and suffix arrays.
- Realized the power of mathematics in algorithmic optimization—reducing a potentially $O(n^2)$ simulation problem to a highly efficient mathematical calculation.
- Improved logical reasoning regarding factors and perfect squares.
- Continued writing clean and efficient Java solutions.

---

## 📊 Day Summary

- ✅ Problems Solved: **2**
- 🟢 Easy: **0**
- 🟡 Medium: **2**
- 🔴 Hard: **0**
- 📂 Topics Covered:
  - Arrays
  - Prefix Sum
  - Math
- 💻 Language: Java

---

## 🎯 Next Goal

- Continue with **Day 07**.
- Explore more Array transformations and Mathematical logic problems.
- Focus on writing optimized, interview-ready solutions and minimizing space complexity further.
- Maintain consistency in the **#100DaysOfLeetCode** challenge.

---

> **Every day you solve a problem, you become a better programmer than yesterday. Keep going! 🚀**
