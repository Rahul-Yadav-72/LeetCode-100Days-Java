# 🚀 Day 24 - LeetCode Challenge

**Date:** 15 August 2026

Today I solved two LeetCode problems based on **Strings and Character Counting**. These problems helped me improve my understanding of frequency counting, character distribution, and finding consecutive repeating characters.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 1897 - Redistribute Characters to Make All Strings Equal

- **Difficulty:** Easy
- **Topic:** Strings, Frequency Counting, Arrays

### 💡 Approach

The problem requires checking whether characters from all strings can be redistributed so that every string becomes equal.

I used a frequency array of size `26` to count the total occurrences of each lowercase English character across all strings.

If the total frequency of every character is divisible by the number of strings, then the characters can be distributed equally among all strings.

### 🔄 Algorithm

1. Create an integer array `count` of size `26`.
2. Traverse every string in the `words` array.
3. Count the frequency of each character using:

   ```java
   count[w.charAt(j) - 'a']++;
   ```

4. Traverse the frequency array.
5. Check whether every character's frequency is divisible by the number of strings.
6. If any frequency is not divisible, return `false`.
7. Otherwise, return `true`.

### 🔄 Example

For:

```text
words = ["abc", "aac", "bc"]
```

Total character frequencies are:

```text
a → 3
b → 2
c → 3
```

There are `3` strings.

Since the frequency of `b` is not divisible by `3`:

```text
2 % 3 != 0
```

The strings cannot be made equal.

Final result:

```text
false
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

### 📚 Key Learning

Learned how **frequency counting** can be used to determine whether characters can be redistributed equally among multiple strings.

---

## 2️⃣ LeetCode 1446 - Consecutive Characters

- **Difficulty:** Easy
- **Topic:** Strings, String Traversal, Counting

### 💡 Approach

The problem requires finding the maximum length of a substring containing the same character consecutively.

I used two variables:

- `count` → Stores the current consecutive character count.
- `max` → Stores the maximum consecutive count found so far.

### 🔄 Algorithm

1. Initialize `max` and `count` to `1`.
2. Traverse the string starting from index `1`.
3. Compare the current character with the previous character.
4. If both characters are the same:
   - Increment `count`.

5. Otherwise:
   - Reset `count` to `1`.

6. Update `max` using `Math.max()`.
7. Return `max`.

### 🔄 Example

For:

```text
s = "abbcccddddeeeeedcba"
```

The consecutive groups include:

```text
a   → 1
bb  → 2
ccc → 3
dddd → 4
eeeee → 5
```

The maximum consecutive character length is:

```text
5
```

Final result:

```text
5
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

### 📚 Key Learning

Learned how to track **consecutive characters** using a simple counter and efficiently find the longest repeating character sequence.

---

# 📚 Topics Learned

- Strings
- String Traversal
- Character Frequency
- Frequency Counting
- Arrays
- Consecutive Characters
- Counting
- Character Comparison
- `Math.max()`

---

# 🎯 Key Takeaways

- Learned how to count character frequencies using an array.
- Understood how divisibility can determine whether characters can be redistributed equally.
- Practiced traversing strings character by character.
- Learned how to find the longest sequence of consecutive characters.
- Improved understanding of counting and comparison techniques.
- Practiced solving string problems using `O(n)` time and `O(1)` extra space.

---

# 🚀 Progress

- ✅ Day 24 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **24 Days**

Keep learning. Keep coding. 🚀
