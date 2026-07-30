# 🚀 Day 08 - LeetCode Challenge

**Date:** 30 July 2026

Today I solved two LeetCode problems focused on **Arrays** and **Greedy Algorithms**. These problems helped me strengthen my understanding of array traversal, greedy techniques, and optimizing solutions for linear time complexity.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 1800 - Maximum Ascending Subarray Sum

- **Difficulty:** Easy
- **Topic:** Arrays

### 💡 Approach

- Traverse the array while maintaining the sum of the current ascending subarray.
- If the current element is greater than the previous one, extend the current sum.
- Otherwise, update the maximum sum found so far and start a new ascending subarray.
- Finally, compare the last subarray sum with the maximum.

### ⏱ Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## 2️⃣ LeetCode 334 - Increasing Triplet Subsequence

- **Difficulty:** Medium
- **Topic:** Arrays, Greedy

### 💡 Approach

- Maintain two variables:
  - `first` → smallest element found so far.
  - `second` → smallest possible second element.
- Traverse the array:
  - Update `first` if a smaller value is found.
  - Otherwise update `second` if possible.
  - If a number is greater than both `first` and `second`, an increasing triplet exists.

### ⏱ Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

# 📚 Topics Learned

- Arrays
- Greedy Algorithm
- Array Traversal
- Running Sum
- Optimal Linear-Time Solutions

---

# 🎯 Key Takeaways

- Learned how to efficiently calculate the maximum sum of an ascending subarray.
- Understood the greedy strategy for detecting an increasing triplet.
- Improved confidence in solving array problems with constant extra space.
- Practiced writing clean and optimized Java solutions.

---

## 🚀 Progress

- ✅ Day 08 Completed
- ✅ Total Problems Solved: **16**
- 🔥 Challenge Streak: **8 Days**

Keep learning. Keep coding. 🚀
