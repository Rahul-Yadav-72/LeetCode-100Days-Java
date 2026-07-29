# 🚀 Day 07 – 100 Days of LeetCode Challenge

**📅 Date:** 29 July 2026

---

## 📌 Problems Solved

| Problem No. | Problem Name                            | Difficulty | Topic        |
| ----------- | --------------------------------------- | ---------- | ------------ |
| 11          | Container With Most Water               | Medium     | Two Pointers |
| 747         | Largest Number At Least Twice of Others | Easy       | Arrays       |

---

## 💡 Approaches

### 11. Container With Most Water

- Solved using the **Two Pointer** technique.
- Initialized two pointers at the beginning and end of the array.
- Calculated the current container area using:
  - Height = `min(height[left], height[right])`
  - Width = `right - left`
- Updated the maximum area whenever a larger area was found.
- Moved the pointer with the **smaller height**, since only increasing the limiting height can potentially produce a larger area.
- Achieved an optimal linear-time solution without checking every possible pair.

---

### 747. Largest Number At Least Twice of Others

- Traversed the array once to find the **largest** and **second largest** elements.
- Tracked the index of the maximum element during traversal.
- Compared whether the largest element is at least twice the second largest element.
- Returned the index of the dominant element if the condition was satisfied; otherwise returned `-1`.
- Solved efficiently using a single pass through the array.

---

## ⚡ Complexity Analysis

| Problem                                 | Time Complexity | Space Complexity |
| --------------------------------------- | --------------- | ---------------- |
| Container With Most Water               | O(n)            | O(1)             |
| Largest Number At Least Twice of Others | O(n)            | O(1)             |

---

## 📂 Solution Files

- `Problems/TwoPointers/ContainerWithMostWater_11.java`
- `Problems/Arrays/LargestNumberAtLeastTwiceOfOthers_747.java`

---

## 📚 Key Learnings

- Learned how the **Two Pointer** technique can optimize brute-force problems from **O(n²)** to **O(n)**.
- Understood why moving the pointer with the smaller height is the optimal strategy in the Container With Most Water problem.
- Practiced finding the maximum and second maximum values efficiently in a single traversal.
- Improved problem-solving skills by identifying optimal approaches instead of using unnecessary nested loops.
- Continued writing clean, readable, and interview-ready Java solutions.

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

- Continue with **Day 08**.
- Solve more Two Pointer and Array problems.
- Focus on improving problem-solving speed and code optimization.
- Maintain consistency in the **#100DaysOfLeetCode** challenge.

---

> **Small improvements every day lead to big achievements. Keep coding and keep growing! 🚀**
