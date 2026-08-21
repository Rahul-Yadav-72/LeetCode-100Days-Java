# 🚀 Day 30 - LeetCode Challenge

**Date:** 21 August 2026

Today I solved two LeetCode problems based on **Linked Lists, Two Pointers, and Pointer Manipulation**. These problems helped me improve my understanding of traversing linked lists, comparing node values, and modifying linked list connections efficiently.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 21 - Merge Two Sorted Lists

- **Difficulty:** Easy
- **Topic:** Linked List, Recursion, Two Pointers

### 💡 Approach

The problem requires merging two sorted singly linked lists into a single sorted linked list.

I used a **dummy node** and a pointer to build the resulting linked list. At each step, I compare the values of the current nodes of both lists and connect the smaller node to the result list.

When one list becomes empty, I attach the remaining nodes of the other list.

### 🔄 Algorithm

1. Create a dummy node.
2. Create a pointer `current` starting from the dummy node.
3. Compare the current nodes of `list1` and `list2`.
4. Attach the node with the smaller value to `current.next`.
5. Move the selected list pointer forward.
6. Move `current` forward.
7. Repeat until one list becomes empty.
8. Attach the remaining nodes of the non-empty list.
9. Return `dummy.next`.

### 🔄 Example

For:

```text
list1 = 1 → 2 → 4
list2 = 1 → 3 → 4
```

The merged list becomes:

```text
1 → 1 → 2 → 3 → 4 → 4
```

Final result:

```text
1 → 1 → 2 → 3 → 4 → 4
```

### ⏱ Complexity

- **Time:** `O(m + n)`
- **Space:** `O(1)`

Where `m` and `n` are the lengths of the two linked lists.

### 📚 Key Learning

Learned how to merge two sorted linked lists efficiently using **pointer manipulation** without creating a new list of nodes.

---

## 2️⃣ LeetCode 83 - Remove Duplicates from Sorted List

- **Difficulty:** Easy
- **Topic:** Linked List, Two Pointers

### 💡 Approach

The problem requires removing duplicate values from a **sorted linked list**.

Since the linked list is already sorted, duplicate values will always appear next to each other.

I traverse the linked list and compare the current node with the next node. If both values are equal, I skip the duplicate node by changing the `next` pointer.

Otherwise, I move to the next node.

### 🔄 Algorithm

1. Start with the head of the linked list.
2. Traverse the list while the current node and its next node are not `null`.
3. Compare `current.val` with `current.next.val`.
4. If both values are equal, skip the duplicate node.
5. Otherwise, move the current pointer forward.
6. Continue until the end of the list.
7. Return the original head.

### 🔄 Example

For:

```text
1 → 1 → 2 → 3 → 3
```

After removing duplicates:

```text
1 → 2 → 3
```

Final result:

```text
1 → 2 → 3
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

### 📚 Key Learning

Learned how the **sorted property of a linked list** can be used to efficiently identify and remove duplicate nodes using pointer manipulation.

---

# 📚 Topics Learned

- Linked List
- Singly Linked List
- Two Pointers
- Pointer Manipulation
- Node Traversal
- Dummy Node
- Linked List Merging
- Duplicate Removal
- Sorted Linked List
- `next` Pointer
- In-Place Modification
- Iterative Traversal

---

# 🎯 Key Takeaways

- Learned how to merge two sorted linked lists efficiently.
- Improved understanding of linked list traversal.
- Practiced comparing node values using pointers.
- Learned how to use a **dummy node** to simplify linked list operations.
- Learned how to remove duplicate nodes from a sorted linked list.
- Improved understanding of modifying `next` pointers.
- Practiced solving linked list problems with **O(1) extra space**.
- Improved my confidence in linked list manipulation and pointer-based problems.

---

# 🚀 Progress

- ✅ Day 30 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **30 Days**

Keep learning. Keep coding. 🚀
