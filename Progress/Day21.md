# 🚀 Day 21 - LeetCode Challenge

**Date:** 12 August 2026

Today I solved two LeetCode problems based on **Two Pointers, Sorting, and Strings**. These problems helped me understand how to efficiently pair elements using a greedy two-pointer approach and how to find the last word in a string using reverse traversal.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 881 - Boats to Save People

- **Difficulty:** Medium
- **Topic:** Two Pointers, Sorting, Greedy

### 💡 Approach

The problem requires finding the minimum number of boats needed to rescue all people. Each boat can carry at most two people, and their combined weight cannot exceed the given `limit`.

I used the **Two Pointer** approach after sorting the array.

### 🔄 Algorithm

1. Sort the `people` array.
2. Use `start` for the lightest person.
3. Use `end` for the heaviest person.
4. If the lightest and heaviest people can fit together:
   - Move both `start` and `end`.

5. Otherwise:
   - The heaviest person must go alone, so move `end`.

6. Increment the boat count.
7. Continue until all people are assigned to boats.

### 🔄 Example

For:

```text
people = [3, 2, 2, 1]
limit = 3
```

After sorting:

```text
[1, 2, 2, 3]
```

Pairing:

```text
1 + 2 = 3  → One boat
2           → One boat
3           → One boat
```

Therefore:

```text
Minimum Boats = 3
```

### ⏱ Complexity

- **Time:** `O(n log n)`
- **Space:** `O(1)` auxiliary space apart from the sorting implementation

### 📚 Key Learning

Learned how **sorting + two pointers + greedy thinking** can efficiently solve pairing problems.

---

## 2️⃣ LeetCode 58 - Length of Last Word

- **Difficulty:** Easy
- **Topic:** Strings

### 💡 Approach

The problem requires finding the length of the last word in a string while handling spaces at the end.

I used **reverse traversal** instead of splitting the string.

### 🔄 Algorithm

1. Start traversing the string from the last character.
2. Ignore trailing spaces.
3. Start counting characters when a non-space character is found.
4. Continue until a space is encountered after the last word starts.
5. Return the count.

### 🔄 Example

For:

```text
s = "Hello World "
```

Starting from the end:

```text
"Hello World "
          ↑
     Ignore space
```

The last word is:

```text
World
```

Therefore:

```text
Length = 5
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

### 📚 Key Learning

Learned how reverse traversal can efficiently solve string problems without creating additional arrays or strings.

---

# 📚 Topics Learned

- Two Pointers
- Sorting
- Greedy Algorithm
- Arrays
- Strings
- Reverse Traversal
- `Arrays.sort()`
- Time and Space Complexity

---

# 🎯 Key Takeaways

- Learned how to use the **Two Pointer** technique after sorting.
- Understood how greedy decisions can minimize the number of boats.
- Practiced handling pairing constraints efficiently.
- Learned how to find the last word using reverse string traversal.
- Improved understanding of **O(n log n)** and **O(n)** solutions.
- Practiced writing solutions with **O(1) auxiliary space**.

---

# 🚀 Progress

- ✅ Day 21 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **21 Days**

Keep learning. Keep coding. 🚀
