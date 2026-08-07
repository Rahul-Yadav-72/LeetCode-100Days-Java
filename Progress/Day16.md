# 🚀 Day 16 - LeetCode Challenge

**Date:** 07 August 2026

Today I solved two LeetCode problems focused on **Heap (Priority Queue)** and **Arrays**. These problems strengthened my understanding of heap-based optimization and array manipulation techniques.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 215 - Kth Largest Element in an Array

- **Difficulty:** Medium
- **Topic:** Heap, Priority Queue

### 💡 Approach

- Use a **Min Heap (Priority Queue)** of size `k`.
- Traverse the array:
  - Add elements until the heap size becomes `k`.
  - If the current element is greater than the smallest element in the heap, remove the smallest and insert the current element.
- After processing all elements, the heap's top element is the **kth largest**.

### ⏱ Complexity

- **Time Complexity:** `O(n log k)`
- **Space Complexity:** `O(k)`

---

## 2️⃣ LeetCode 66 - Plus One

- **Difficulty:** Easy
- **Topic:** Arrays, Simulation

### 💡 Approach

- Traverse the digits array from right to left.
- If the current digit is less than `9`, increment it and return the array.
- Otherwise, set it to `0` and continue.
- If all digits are `9`, create a new array with one extra digit and set the first element to `1`.

### ⏱ Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)` _(or `O(n)` only when a new array is created)_

---

# 📚 Topics Learned

- Heap (Priority Queue)
- Min Heap
- Arrays
- Simulation
- Carry Propagation

---

# 🎯 Key Takeaways

- Learned how a Min Heap efficiently finds the kth largest element.
- Improved understanding of Java's `PriorityQueue`.
- Practiced handling carry propagation in array-based arithmetic.
- Strengthened problem-solving skills for heap and array interview questions.

---

## 🚀 Progress

- ✅ Day 16 Completed
- ✅ Problems Solved Today: **2**
- ✅ Total Problems Solved: **31**
- 🔥 Challenge Streak: **16 Days**

Keep learning. Keep coding. 🚀
