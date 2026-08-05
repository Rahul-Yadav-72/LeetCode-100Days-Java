# 🚀 Day 14 - LeetCode Challenge

**Date:** 05 August 2026

Today I solved two LeetCode problems focused on **Arrays**. These problems helped me improve my understanding of counting techniques and prefix/suffix array concepts used in array-based interview questions.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 2089 - Find Target Indices After Sorting Array

- **Difficulty:** Easy
- **Topic:** Arrays, Counting

### 💡 Approach

- Count the number of elements smaller than the target.
- Count how many times the target appears in the array.
- The first occurrence of the target in the sorted array starts after all smaller elements.
- Add consecutive indices equal to the target count into the answer list.

### ⏱ Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)` _(excluding the output list)_

---

## 2️⃣ LeetCode 42 - Trapping Rain Water

- **Difficulty:** Hard
- **Topic:** Arrays, Prefix & Suffix Arrays

### 💡 Approach

- Build a **Left Max** array to store the highest bar from the left.
- Build a **Right Max** array to store the highest bar from the right.
- For each index:
  - Water Level = `min(leftMax, rightMax)`
  - Trapped Water = `Water Level - Current Height`
- Sum the trapped water for every index.

### ⏱ Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

# 📚 Topics Learned

- Arrays
- Counting Technique
- Prefix Maximum Array
- Suffix Maximum Array
- Water Trapping Problem

---

# 🎯 Key Takeaways

- Learned how counting can solve sorting-related problems without actually sorting the array.
- Practiced using prefix and suffix maximum arrays.
- Improved understanding of array preprocessing techniques.
- Strengthened problem-solving skills for interview-level array problems.

---

## 🚀 Progress

- ✅ Day 14 Completed
- ✅ Problems Solved Today: **2**
- ✅ Total Problems Solved: **27**
- 🔥 Challenge Streak: **14 Days**

Keep learning. Keep coding. 🚀
