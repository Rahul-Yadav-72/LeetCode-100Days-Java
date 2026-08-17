# 🚀 Day 26 - LeetCode Challenge

**Date:** 17 August 2026

Today I solved two LeetCode problems based on **Stack and Strings**. These problems helped me improve my understanding of stack-based parentheses validation and character frequency counting using HashMap.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 921 - Minimum Add to Make Parentheses Valid

- **Difficulty:** Medium
- **Topic:** Stack, Greedy, Strings, Parentheses Matching

### 💡 Approach

The problem requires finding the minimum number of parentheses that need to be added to make the string valid.

I used a **Stack** to keep track of unmatched opening parentheses.

- If the character is `'('`, push it into the stack.
- If the character is `')'` and the stack is not empty, pop the matching `'('`.
- If the character is `')'` and the stack is empty, an opening parenthesis is required, so increment `count`.
- After processing the entire string, the remaining opening parentheses in the stack also need closing parentheses.

The final answer is:

```text
count + stack.size()
```

### 🔄 Algorithm

1. Create a `Stack<Character>`.
2. Initialize `count = 0`.
3. Traverse the string character by character.
4. If the character is `'('`, push it into the stack.
5. If the character is `')'` and the stack is not empty, pop the stack.
6. If the character is `')'` and the stack is empty, increment `count`.
7. After traversal, add the remaining stack size to `count`.
8. Return the total count.

### 🔄 Example

For:

```text
s = "(((())"
```

There are unmatched opening parentheses remaining.

Required additions:

```text
2
```

Final result:

```text
2
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

### 📚 Key Learning

Learned how a **Stack** can be used to keep track of unmatched opening parentheses and determine the minimum number of parentheses required to make a string valid.

---

## 2️⃣ LeetCode 242 - Valid Anagram

- **Difficulty:** Easy
- **Topic:** Strings, HashMap, Character Frequency

### 💡 Approach

The problem requires checking whether two strings contain the same characters with the same frequencies.

I used a **HashMap<Character, Integer>** to store the frequency of each character in the first string.

Then, while traversing the second string:

- If the character exists in the HashMap, decrease its frequency.
- If the character does not exist, return `false`.

Finally, I check whether all character frequencies are `0`.

### 🔄 Algorithm

1. Check whether both strings have the same length.
2. Create a `HashMap<Character, Integer>`.
3. Traverse string `s` and store the frequency of each character.
4. Traverse string `t`.
5. Decrease the frequency for each character found.
6. If a character does not exist in the map, return `false`.
7. Check whether every frequency in the map is `0`.
8. If all frequencies are `0`, return `true`.

### 🔄 Example

For:

```text
s = "anagram"
t = "nagaram"
```

Character frequencies are the same:

```text
a → 3
n → 1
g → 1
r → 1
m → 1
```

Final result:

```text
true
```

For:

```text
s = "rat"
t = "car"
```

The character frequencies are different.

Final result:

```text
false
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(k)`

Where `k` is the number of distinct characters.

### 📚 Key Learning

Learned how **HashMap frequency counting** can efficiently determine whether two strings are anagrams.

---

# 📚 Topics Learned

- Strings
- Stack
- HashMap
- Greedy
- Character Frequency
- Parentheses Matching
- String Traversal
- LIFO
- `HashMap<Character, Integer>`
- Frequency Counting

---

# 🎯 Key Takeaways

- Learned how to find the minimum additions required to make parentheses valid.
- Practiced using a **Stack** to track unmatched parentheses.
- Improved understanding of the **LIFO (Last In, First Out)** principle.
- Learned how to use a **HashMap** for character frequency counting.
- Practiced comparing character frequencies between two strings.
- Improved string traversal and validation skills.
- Practiced solving problems with efficient `O(n)` time complexity.

---

# 🚀 Progress

- ✅ Day 26 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **26 Days**

Keep learning. Keep coding. 🚀
