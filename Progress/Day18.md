# 🚀 Day 18 - LeetCode Challenge

**Date:** 09 August 2026

Today I solved two LeetCode problems based on **Stack and Queue implementation**. Both problems use one data structure to implement the behavior of another data structure.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 225 - Implement Stack Using Queues

- **Difficulty:** Easy
- **Topic:** Stack, Queue

### 💡 Approach

A Stack follows **LIFO (Last In, First Out)**, while a Queue follows **FIFO (First In, First Out)**.

I used two queues:

- `mainQueue` → Stores the stack elements.
- `tempQueue` → Temporarily stores elements while performing `push()`.

During `push()`:

1. Move all elements from `mainQueue` to `tempQueue`.
2. Add the new element to `mainQueue`.
3. Move all elements back from `tempQueue` to `mainQueue`.

This keeps the newest element at the front of `mainQueue`.

Therefore:

- `pop()` removes the front element.
- `top()` returns the front element.
- `empty()` checks whether the queue is empty.

### ⏱ Complexity

- **Push:** `O(n)`
- **Pop:** `O(1)`
- **Top:** `O(1)`
- **Space:** `O(n)`

---

## 2️⃣ LeetCode 232 - Implement Queue Using Stacks

- **Difficulty:** Easy
- **Topic:** Queue, Stack

### 💡 Approach

A Queue follows **FIFO (First In, First Out)**, while a Stack follows **LIFO (Last In, First Out)**.

I used two stacks:

- `stack1` → Stores the queue elements.
- `stack2` → Temporarily stores elements during `push()`.

During `push()`:

1. Move all elements from `stack1` to `stack2`.
2. Add the new element to `stack1`.
3. Move all elements back from `stack2` to `stack1`.

This keeps the oldest element at the top of `stack1`.

Therefore:

- `pop()` removes the oldest element.
- `peek()` returns the oldest element.
- `empty()` checks whether the stack is empty.

### ⏱ Complexity

- **Push:** `O(n)`
- **Pop:** `O(1)`
- **Peek:** `O(1)`
- **Space:** `O(n)`

---

# 🔄 Same Core Concept

Both problems use the same fundamental idea:

> **Rearrange elements during insertion so that removal and access operations become simple and efficient.**

### Stack Using Queue

```text
Queue → Rearrange → Stack Behavior

Push:
1 → [1]
2 → [2, 1]
3 → [3, 2, 1]

Pop → 3
```

### Queue Using Stack

```text
Stack → Rearrange → Queue Behavior

Push:
1 → [1]
2 → [1, 2]
3 → [1, 2, 3]

Pop → 1
```

---

# 📚 Topics Learned

- Stack
- Queue
- LIFO
- FIFO
- Data Structure Implementation
- Java `Stack`
- Java `Queue`
- `LinkedList`
- Data Structure Design

---

# 🎯 Key Takeaways

- Learned how to implement a Stack using Queues.
- Learned how to implement a Queue using Stacks.
- Understood the difference between **LIFO** and **FIFO**.
- Practiced rearranging elements to achieve the required data structure behavior.
- Improved understanding of data structure implementation problems.

---

## 🚀 Progress

- ✅ Day 18 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **18 Days**

Keep learning. Keep coding. 🚀