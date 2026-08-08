# 🚀 Day 17 - LeetCode Challenge

**Date:** 08 August 2026

Today I solved two LeetCode problems focusing on **Arrays** and **Stack**. These problems helped me improve my understanding of array traversal, minimum/maximum tracking, and stack-based data structures.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 1491 - Average Salary Excluding the Minimum and Maximum Salary

- **Difficulty:** Easy
- **Topic:** Arrays

### 💡 Approach

- Initialize `min`, `max`, and `sum` using the first salary.
- Traverse the remaining salary values.
- Track the minimum and maximum salary.
- Calculate the total salary sum.
- Subtract the minimum and maximum salary from the total.
- Divide the remaining sum by `salary.length - 2`.

### ⏱ Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## 2️⃣ LeetCode 155 - Min Stack

- **Difficulty:** Medium
- **Topic:** Stack

### 💡 Approach

I used two stacks:

- `st` → Stores all elements of the stack.
- `min` → Stores the minimum elements encountered so far.

### Push Operation

- Add the element to the main stack.
- If the minimum stack is empty or the new value is smaller than or equal to the current minimum, add it to the minimum stack.

### Pop Operation

- Remove the top element from the main stack.
- If the removed element is equal to the current minimum, remove it from the minimum stack.

### Get Minimum

The top of the `min` stack always contains the current minimum element.

### ⏱ Complexity

| Operation  | Time Complexity |
| ---------- | --------------- |
| `push()`   | `O(1)`          |
| `pop()`    | `O(1)`          |
| `top()`    | `O(1)`          |
| `getMin()` | `O(1)`          |

- **Space Complexity:** `O(n)`

---

# 📚 Topics Learned

- Arrays
- Stack
- Minimum and Maximum Tracking
- Auxiliary Stack
- Constant-Time Operations

---

# 🎯 Key Takeaways

- Learned how to calculate an average while excluding minimum and maximum values.
- Practiced tracking minimum and maximum values in a single array traversal.
- Learned how an auxiliary stack can efficiently maintain the minimum value.
- Improved understanding of `O(1)` stack operations.
- Strengthened problem-solving skills for coding interviews.

---

## 🚀 Progress

- ✅ Day 17 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **17 Days**

Keep learning. Keep coding. 🚀
