# 🚀 Day 19 - LeetCode Challenge

**Date:** 10 August 2026

Today I solved two LeetCode problems based on **HashMap and Cycle Detection**. Both problems helped me understand efficient techniques for finding consecutive sequences and duplicate values without using unnecessary brute-force operations.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 128 - Longest Consecutive Sequence

- **Difficulty:** Medium
- **Topic:** Array, HashMap

### 💡 Approach

The goal is to find the length of the longest sequence of consecutive integers.

For example:

```text
Input: [100, 4, 200, 1, 3, 2]

Consecutive sequence:
1 → 2 → 3 → 4

Answer: 4
```

I used a `HashMap<Integer, Boolean>` to store all the elements and identify the **starting point** of every consecutive sequence.

The approach works in three steps:

1. Store every number in the `HashMap`.
2. Check whether `key - 1` exists.
3. If it does not exist, the current key is the **start of a sequence**.

Starting from the sequence's beginning, keep checking for `key + 1`, `key + 2`, and so on.

For example:

```text
[100, 4, 200, 1, 3, 2]

Starting points:
100 → no 99
4   → 3 exists
200 → no 199
1   → no 0
3   → 2 exists
2   → 1 exists

Sequence:
1 → 2 → 3 → 4

Length = 4
```

The maximum sequence length is then returned.

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

---

## 2️⃣ LeetCode 287 - Find the Duplicate Number

- **Difficulty:** Medium
- **Topic:** Array, Two Pointers, Cycle Detection

### 💡 Approach

The goal is to find the duplicate number in an array containing `n + 1` integers where each integer is in the range `[1, n]`.

For example:

```text
Input:
[1, 3, 4, 2, 2]

Duplicate:
2
```

I used **Floyd's Cycle Detection Algorithm**, also known as the **Tortoise and Hare Algorithm**.

The array can be treated like a linked list, where the value at each index points to the next index:

```text
Index → Value

0 → 1
1 → 3
2 → 4
3 → 2
4 → 2
```

Because one number is repeated, this creates an **implicit cycle**.

I used two pointers:

- `slow` → moves one step at a time.
- `fast` → moves two steps at a time.

### 🔄 Phase 1: Detect the Cycle

```java
do {
    slow = nums[slow];
    fast = nums[nums[fast]];
} while (slow != fast);
```

The two pointers eventually meet inside the cycle.

### 🔄 Phase 2: Find the Duplicate

After detecting the cycle:

```java
fast = 0;

while (slow != fast) {
    slow = nums[slow];
    fast = nums[fast];
}
```

Both pointers now move one step at a time.

The point where they meet is the **duplicate number**.

For:

```text
[1, 3, 4, 2, 2]
```

The duplicate number is:

```text
2
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

The important advantage of this approach is that it does **not modify the input array** and does not require an additional `HashSet`.

---

# 🔄 Same Core Concept

Both problems use the same fundamental idea:

> **Use a mapping or a smart traversal so that the answer can be found without brute-force scanning.**

### Longest Consecutive Sequence

```text
Array → HashMap → Find Starting Points

Input:
[100, 4, 200, 1, 3, 2]

Starting Point:
1 → no 0

Sequence:
1 → 2 → 3 → 4

Answer → 4
```

### Find the Duplicate Number

```text
Array → Pointers → Implicit Cycle

Index → Value

0 → 1
1 → 3
2 → 4
3 → 2
4 → 2

Cycle → Duplicate → 2
```

---

# 📚 Topics Learned

- HashMap
- Arrays
- Consecutive Sequences
- Two Pointer Technique
- Floyd's Cycle Detection
- Tortoise and Hare Algorithm
- Cycle Detection
- Time and Space Complexity
- Efficient Problem Solving

---

# 🎯 Key Takeaways

- Learned how to find the **longest consecutive sequence** efficiently.
- Understood how to identify the starting point of a sequence using a HashMap.
- Learned **Floyd's Cycle Detection Algorithm**.
- Understood how an array can be treated like a linked list.
- Learned how to find a duplicate number using **O(1) extra space**.
- Improved my understanding of **HashMap and Two Pointer techniques**.
- Practiced choosing efficient algorithms instead of brute-force approaches.

---

## 🚀 Progress

- ✅ Day 19 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **19 Days**

Keep learning. Keep coding. 🚀
