# 🚀 Day 01 – 100 Days of LeetCode Challenge

**📅 Date:** 23 July 2026

---

## 📌 Problems Solved

| Problem No. | Problem Name   | Difficulty | Topic                   |
| ----------- | -------------- | ---------- | ----------------------- |
| 231         | Power of Two   | Easy       | Bit Manipulation        |
| 326         | Power of Three | Easy       | Bit Manipulation / Math |

---

## 💡 Approaches

### 231. Power of Two

- Used **Bit Manipulation**.
- A power of two has exactly **one set bit** in its binary representation.
- Applied the condition:

```java
n > 0 && (n & (n - 1)) == 0
```

---

### 326. Power of Three

- Used an **iterative division** approach.
- Continuously divided the number by **3** until it was no longer divisible.
- If the final value became **1**, the number is a power of three.

---

## ⚡ Complexity Analysis

| Problem        | Time Complexity | Space Complexity |
| -------------- | --------------- | ---------------- |
| Power of Two   | O(1)            | O(1)             |
| Power of Three | O(log₃ n)       | O(1)             |

---

## 📂 Solution Files

- `Problems/BitManipulation/PowerOfTwo_231.java`
- `Problems/BitManipulation/PowerOfThree_326.java`

---

## 📚 Key Learnings

- Learned how bit manipulation can solve problems efficiently.
- Improved understanding of binary representation.
- Practiced solving mathematical problems using iterative logic.
- Focused on writing clean and optimized Java code.

---

## 📊 Day Summary

- ✅ Problems Solved: **2**
- 🟢 Easy: **2**
- 🟡 Medium: **0**
- 🔴 Hard: **0**
- 📂 Topics Covered:
  - Bit Manipulation
  - Math
- 💻 Language: Java

---

## 🎯 Next Goal

- Continue the challenge with **Day 02**.
- Solve at least **2 LeetCode problems**.
- Maintain consistency and improve problem-solving speed.

---

> **Consistency beats perfection. One problem at a time, one day at a time. 🚀**
