# 🚀 Day 31 - LeetCode Challenge

**Date:** 22 August 2026

Today I solved two LeetCode problems based on **Arrays, Linked Lists, Pointer Manipulation, and Mathematical Operations**. These problems helped me improve my understanding of in-place array rotation and performing arithmetic operations using linked lists.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 189 - Rotate Array

- **Difficulty:** Medium
- **Topic:** Array, Two Pointers, In-Place Manipulation

### 💡 Approach

The problem requires rotating an array to the right by `k` positions.

I used the **reversal algorithm**, which allows the array to be rotated **in-place** without using an extra array.

First, I reverse the complete array. Then, I reverse the first `k` elements and finally reverse the remaining elements.

Before performing the rotations, I use:

`k = k % nums.length`

This handles cases where `k` is greater than the length of the array.

### 🔄 Algorithm

1. Calculate `k = k % nums.length`.
2. Reverse the complete array.
3. Reverse the first `k` elements.
4. Reverse the remaining elements from `k` to the end.
5. The array is now rotated to the right by `k` positions.

### 🔄 Example

For:

```text
nums = [1, 2, 3, 4, 5, 6, 7]
k = 3
```

After reversing the complete array:

```text
[7, 6, 5, 4, 3, 2, 1]
```

Reverse the first `3` elements:

```text
[5, 6, 7, 4, 3, 2, 1]
```

Reverse the remaining elements:

```text
[5, 6, 7, 1, 2, 3, 4]
```

Final result:

```text
[5, 6, 7, 1, 2, 3, 4]
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

### 📚 Key Learning

Learned how the **array reversal technique** can be used to rotate an array efficiently while maintaining **O(1) extra space**.

---

## 2️⃣ LeetCode 2 - Add Two Numbers

- **Difficulty:** Medium
- **Topic:** Linked List, Math, Carry, Pointer Manipulation

### 💡 Approach

The problem requires adding two numbers represented by two **non-empty linked lists**.

Each node contains one digit, and the digits are stored in **reverse order**.

I traverse both linked lists simultaneously while maintaining a `carry` value.

For every pair of digits, I calculate:

```text
sum = carry + x + y
```

The digit stored in the new node is:

```text
sum % 10
```

The carry for the next position is:

```text
sum / 10
```

I use a **dummy node** to simplify the construction of the resulting linked list.

### 🔄 Algorithm

1. Create a dummy node.
2. Initialize pointers `p` and `q` for the two linked lists.
3. Initialize `carry = 0`.
4. Traverse while either linked list still has nodes.
5. Get the current values from both lists.
6. Calculate the sum including the carry.
7. Store `sum % 10` in a new node.
8. Update `carry = sum / 10`.
9. Move the linked list pointers forward.
10. If a carry remains after traversal, add it as a new node.
11. Return `dummy.next`.

### 🔄 Example

For:

```text
l1 = 2 → 4 → 3
l2 = 5 → 6 → 4
```

The numbers represented are:

```text
342 + 465 = 807
```

The result linked list is:

```text
7 → 0 → 8
```

Final result:

```text
7 → 0 → 8
```

### ⏱ Complexity

- **Time:** `O(max(m, n))`
- **Space:** `O(max(m, n))`

The output list requires space proportional to the number of digits in the result.

### 📚 Key Learning

Learned how to perform **digit-by-digit addition using linked lists**, handle carry values, and construct the result using pointer manipulation.

---

# 📚 Topics Learned

- Arrays
- Linked Lists
- Singly Linked List
- Two Pointers
- Pointer Manipulation
- In-Place Array Manipulation
- Array Reversal
- Array Rotation
- Mathematical Operations
- Carry Handling
- Dummy Node
- Node Traversal
- Linked List Construction
- Modulo Operation
- Integer Division
- O(1) Extra Space

---

# 🎯 Key Takeaways

- Learned how to rotate an array using the **reversal algorithm**.
- Improved understanding of **in-place array manipulation**.
- Practiced using two-pointer techniques for reversing arrays.
- Learned how `k % n` handles large rotation values.
- Improved my understanding of linked list traversal.
- Learned how to add numbers represented by linked lists.
- Practiced handling **carry values** during addition.
- Learned how to use a **dummy node** when constructing a linked list.
- Improved my pointer manipulation skills.
- Practiced solving problems efficiently with optimal time and space complexity.

---

# 🚀 Progress

- ✅ Day 31 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **31 Days**

Keep learning. Keep coding. 🚀
