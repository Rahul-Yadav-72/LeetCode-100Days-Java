# 🚀 Day 11 - LeetCode Challenge

**Date:** 02 August 2026

Today I solved two LeetCode problems focused on **Binary Search**. These problems helped me strengthen my understanding of searching in modified sorted arrays and finding peak elements efficiently using logarithmic time complexity.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 153 - Find Minimum in Rotated Sorted Array

- **Difficulty:** Medium
- **Topic:** Binary Search

### 💡 Approach

- Handle edge cases:
  - If the array contains only one element, return it.
  - If the array is already sorted, the first element is the minimum.
- Apply Binary Search on the rotated sorted array.
- Check whether the middle element or its next element is the minimum.
- Decide which half to search based on the sorted portion of the array.

### ⏱ Complexity

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`

---

## 2️⃣ LeetCode 162 - Find Peak Element

- **Difficulty:** Medium
- **Topic:** Binary Search

### 💡 Approach

- Use Binary Search to compare the middle element with its next element.
- If `nums[mid] > nums[mid + 1]`, the peak lies on the left side (including `mid`).
- Otherwise, the peak lies on the right side.
- Continue until `start` and `end` meet, which gives the index of a peak element.

### ⏱ Complexity

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`

---

# 📚 Topics Learned

- Binary Search
- Rotated Sorted Array
- Peak Element
- Divide and Conquer
- Logarithmic Search Algorithms

---

# 🎯 Key Takeaways

- Learned how to find the minimum element in a rotated sorted array efficiently.
- Strengthened understanding of Binary Search beyond standard searching.
- Practiced finding a peak element using logarithmic time complexity.
- Improved problem-solving skills for interview-focused Binary Search problems.

---

## 🚀 Progress

- ✅ Day 11 Completed
- ✅ Total Problems Solved: **22**
- 🔥 Challenge Streak: **11 Days**

Keep learning. Keep coding. 🚀
