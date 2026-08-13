# 🚀 Day 22 - LeetCode Challenge

**Date:** 13 August 2026

Today I solved two LeetCode problems based on **Strings, Stack, and Greedy**. These problems helped me improve my understanding of string manipulation, reversing words, and using a stack to build the lexicographically smallest result.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 151 - Reverse Words in a String

- **Difficulty:** Medium
- **Topic:** Strings, StringBuilder

### 💡 Approach

The problem requires reversing the order of words in a string while removing extra spaces.

I used the following approach:

1. Split the string into words using whitespace.
2. Traverse the words array from right to left.
3. Append each word to a `StringBuilder`.
4. Remove the extra space at the end using `trim()`.
5. Return the reversed string.

### 🔄 Example

For:

```text
s = "  hello world  "
```

The words are:

```text
["hello", "world"]
```

After reversing:

```text
"world hello"
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

### 📚 Key Learning

Learned how to use `split()`, `StringBuilder`, and reverse traversal to manipulate strings efficiently.

---

## 2️⃣ LeetCode 316 - Remove Duplicate Letters

- **Difficulty:** Medium
- **Topic:** Stack, Greedy, String

### 💡 Approach

The goal is to remove duplicate letters so that every character appears exactly once and the resulting string is **lexicographically smallest**.

I used:

- `lastIdx[]` → Stores the last occurrence of every character.
- `present[]` → Keeps track of characters currently present in the stack.
- `Stack<Character>` → Builds the final answer.

### 🔄 Algorithm

1. Find the last occurrence of every character.
2. Traverse the string from left to right.
3. If the character is already present in the stack, skip it.
4. Otherwise, check the top of the stack.
5. If the top character is greater than the current character and occurs again later, remove it.
6. Add the current character to the stack.
7. Finally, pop all characters from the stack and reverse the result.

### 🔄 Example

For:

```text
s = "bcabc"
```

The final result is:

```text
"abc"
```

Every character appears exactly once, and `"abc"` is lexicographically smallest.

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

### 📚 Key Learning

Learned how **Stack + Greedy + Last Occurrence** can be combined to create a lexicographically smallest result while removing duplicates.

---

# 📚 Topics Learned

- Strings
- String Manipulation
- StringBuilder
- Stack
- Greedy Algorithm
- Last Occurrence
- Lexicographical Order
- `split()`

---

# 🎯 Key Takeaways

- Learned how to reverse the order of words in a string.
- Practiced handling extra spaces in strings.
- Learned how to use a stack for greedy string problems.
- Understood the importance of storing the last occurrence of characters.
- Practiced maintaining unique characters while generating the smallest lexicographical result.
- Improved understanding of Stack-based problem solving.

---

# 🚀 Progress

- ✅ Day 22 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **22 Days**

Keep learning. Keep coding. 🚀
