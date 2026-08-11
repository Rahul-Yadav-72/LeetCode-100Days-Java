# 🚀 Day 20 - LeetCode Challenge

**Date:** 11 August 2026

Today I solved two LeetCode problems based on **Heap / Priority Queue and Prefix Sum**. These problems helped me understand how to efficiently process the largest elements and calculate a pivot index using left and right sums.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 1046 - Last Stone Weight

- **Difficulty:** Easy
- **Topic:** Heap, Priority Queue

### 💡 Approach

The problem requires repeatedly selecting the **two heaviest stones**.

I used a **Max Heap** implemented using Java's `PriorityQueue`.

Since Java's `PriorityQueue` is a Min Heap by default, I used:

```java
PriorityQueue<Integer> pq =
    new PriorityQueue<>(Collections.reverseOrder());
```

This makes the largest stone available at the top of the heap.

### 🔄 Algorithm

1. Add all stones to the Max Heap.
2. Remove the two largest stones.
3. Calculate their difference.
4. If the difference is greater than `0`, add the remaining stone back to the heap.
5. Continue until at most one stone remains.
6. Return the remaining stone or `0` if the heap is empty.

### ⏱ Complexity

- **Time:** `O(n log n)`
- **Space:** `O(n)`

### 📚 Key Learning

Learned how to use a **Max Heap with Java PriorityQueue** by using `Collections.reverseOrder()`.

---

## 2️⃣ LeetCode 724 - Find Pivot Index

- **Difficulty:** Easy
- **Topic:** Arrays, Prefix Sum

### 💡 Approach

A pivot index is an index where:

```text
Sum of elements on the left
=
Sum of elements on the right
```

I first calculated the total sum of the array as `rsum`.

Then I traversed the array:

1. Remove the current element from `rsum`.
2. Compare `lsum` with `rsum`.
3. If both are equal, the current index is the pivot index.
4. Otherwise, add the current element to `lsum`.
5. If no pivot index exists, return `-1`.

### 🔄 Example

For:

```text
nums = [1, 7, 3, 6, 5, 6]
```

At index `3`:

```text
Left Sum  = 1 + 7 + 3 = 11
Right Sum = 5 + 6 = 11
```

Therefore:

```text
Pivot Index = 3
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

### 📚 Key Learning

Learned how to solve the pivot index problem efficiently using a **running left sum and remaining right sum**, without creating extra prefix/suffix arrays.

---

# 📚 Topics Learned

- Heap
- Priority Queue
- Max Heap
- Arrays
- Prefix Sum
- Running Sum
- `PriorityQueue`
- `Collections.reverseOrder()`

---

# 🎯 Key Takeaways

- Learned how to implement a **Max Heap** using Java's `PriorityQueue`.
- Practiced repeatedly extracting the two largest elements efficiently.
- Learned how to use a running sum to find a pivot index.
- Improved understanding of **Prefix Sum concepts**.
- Practiced optimizing solutions for both **time and space complexity**.

---

# 🚀 Progress

- ✅ Day 20 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **20 Days**

Keep learning. Keep coding. 🚀
