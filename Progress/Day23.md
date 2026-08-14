# 🚀 Day 23 - LeetCode Challenge

**Date:** 14 August 2026

Today I solved two LeetCode problems based on **Strings and Stack**. These problems helped me improve my understanding of stack-based string decoding and string compression using `StringBuilder`.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 394 - Decode String

- **Difficulty:** Medium
- **Topic:** Stack, Strings, StringBuilder

### 💡 Approach

The problem requires decoding an encoded string where a pattern like `k[encoded_string]` means that the `encoded_string` should be repeated `k` times.

I used two stacks:

- `numberStack` → Stores the repetition count.
- `mainStack` → Stores characters and intermediate strings.

### 🔄 Algorithm

1. Traverse the string from left to right.
2. When a number is found, construct the complete number and push it into `numberStack`.
3. Push characters and `[` into `mainStack`.
4. When `]` is encountered:
   - Pop characters from `mainStack` until `[` is found.
   - Remove `[`.
   - Get the repetition count from `numberStack`.
   - Repeat the extracted string according to the count.
   - Push the resulting string back into `mainStack`.

5. Finally, pop all elements from `mainStack` to construct the decoded string.

### 🔄 Example

For:

```text
s = "3[a2[c]]"
```

First:

```text
2[c] → "cc"
```

Then:

```text
3[acc] → "accaccacc"
```

Final result:

```text
"accaccacc"
```

### ⏱ Complexity

- **Time:** `O(n)` approximately
- **Space:** `O(n)`

### 📚 Key Learning

Learned how **two stacks** can be used together to handle nested encoded strings and repetition counts.

---

## 2️⃣ LeetCode 443 - String Compression

- **Difficulty:** Medium
- **Topic:** Strings, StringBuilder

### 💡 Approach

The problem requires compressing consecutive repeating characters in a character array.

For example:

```text
["a","a","b","b","c","c","c"]
```

becomes:

```text
["a","2","b","2","c","3"]
```

I used a `StringBuilder` to construct the compressed string and then copied the result back into the original character array.

### 🔄 Algorithm

1. Start with the first character.
2. Maintain a `count` variable to count consecutive occurrences.
3. Traverse the character array.
4. When the current character changes:
   - Append the count if it is greater than `1`.
   - Append the new character.
   - Reset the count.

5. Copy the compressed string back into the original `chars` array.
6. Return the compressed length.

### 🔄 Example

For:

```text
chars = ['a','a','b','b','c','c','c']
```

The compressed result is:

```text
"a2b2c3"
```

Return value:

```text
6
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

### 📚 Key Learning

Learned how to handle consecutive characters, maintain frequency counts, and use `StringBuilder` for efficient string construction.

---

# 📚 Topics Learned

- Strings
- String Manipulation
- StringBuilder
- Stack
- Nested Strings
- String Decoding
- String Compression
- Frequency Counting
- Repetition Handling

---

# 🎯 Key Takeaways

- Learned how to decode nested strings using two stacks.
- Practiced storing and processing repetition counts.
- Understood how stacks help solve nested string problems.
- Learned how to compress consecutive characters.
- Practiced using `StringBuilder` for string construction.
- Improved understanding of string-based problem solving.

---

# 🚀 Progress

- ✅ Day 23 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **23 Days**

Keep learning. Keep coding. 🚀
