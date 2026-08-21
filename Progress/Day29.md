# 🚀 Day 29 - LeetCode Challenge

**Date:** 21 August 2026

Today I solved two LeetCode problems based on **Linked List, Matrix, Two Pointers, and In-Place Manipulation**. These problems helped me improve my understanding of linked list traversal, reversal, palindrome checking, matrix transposition, and in-place rotation.

---

## ✅ Problems Solved

### 1️⃣ LeetCode 234 - Palindrome Linked List

**Difficulty:** Easy

**Topics:** Linked List, Two Pointers, Fast & Slow Pointers, Linked List Reversal, Palindrome

### 💡 Approach

The problem requires checking whether a singly linked list reads the same from both directions.

I used the **Fast and Slow Pointer** technique to find the middle of the linked list. Then, I reversed the second half of the linked list and compared it with the first half.

### 🔄 Algorithm

1. If the list is empty or contains only one node, return `true`.
2. Initialize `slow = head` and `fast = head`.
3. Move `slow` one step and `fast` two steps at a time.
4. When `fast` reaches the end, `slow` points to the middle.
5. Reverse the second half of the linked list.
6. Compare the first half with the reversed second half.
7. If any values are different, return `false`.
8. Otherwise, return `true`.

### 🔄 Example

**Input:**

```text
1 → 2 → 2 → 1
```

Second half:

```text
2 → 1
```

After reversing:

```text
1 → 2
```

Comparison:

```text
First Half:   1 → 2
Second Half:  1 → 2
```

**Result:** `true`

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

### 📚 Key Learning

Learned how to combine **Fast & Slow Pointers** with **Linked List Reversal** to check a palindrome efficiently without using extra space.

---

## 2️⃣ LeetCode 48 - Rotate Image

**Difficulty:** Medium

**Topics:** Matrix, Arrays, 2D Arrays, Matrix Transpose, Matrix Rotation, In-Place Manipulation

### 💡 Approach

The problem requires rotating an `n × n` matrix **90 degrees clockwise**.

An efficient in-place approach is performed in two steps:

1. **Transpose the matrix**
2. **Reverse every row**

### 🔄 Example

**Original Matrix:**

```text
1 2 3
4 5 6
7 8 9
```

**After Transpose:**

```text
1 4 7
2 5 8
3 6 9
```

**After Reversing Every Row:**

```text
7 4 1
8 5 2
9 6 3
```

This gives the matrix rotated **90 degrees clockwise**.

### 🔄 Algorithm

1. Traverse the matrix diagonally.
2. Swap `matrix[i][j]` with `matrix[j][i]` to transpose the matrix.
3. Reverse every row.
4. The matrix is now rotated 90 degrees clockwise.

### ⏱ Complexity

- **Time:** `O(n²)`
- **Space:** `O(1)`

The rotation is performed **in-place**, so no extra matrix is required.

### 📚 Key Learning

Learned how **matrix transposition + row reversal** can be used to rotate a square matrix 90 degrees clockwise efficiently and in-place.

---

## 📚 Topics Learned

- Linked List
- Fast & Slow Pointers
- Two Pointers
- Linked List Reversal
- Palindrome
- Matrix
- Arrays
- 2D Arrays
- Matrix Transpose
- Matrix Rotation
- In-Place Manipulation
- Row Reversal
- Nested Loops

---

## 🎯 Key Takeaways

- Learned how to find the middle of a linked list using **Fast & Slow Pointers**.
- Practiced reversing a linked list in-place.
- Learned how to check whether a linked list is a palindrome.
- Improved understanding of **O(1) extra-space solutions**.
- Learned how to transpose a square matrix.
- Practiced rotating a matrix 90 degrees clockwise.
- Understood the relationship between **transpose and row reversal**.
- Improved my understanding of in-place matrix manipulation.

---

## 🚀 Progress

- ✅ Day 29 Completed
- ✅ Problems Solved Today: 2
- 🔥 Challenge Streak: 29 Days

> **Keep learning. Keep coding. Keep improving. 🚀**
