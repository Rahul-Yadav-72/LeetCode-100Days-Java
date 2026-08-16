# 🚀 Day 25 - LeetCode Challenge

**Date:** 16 August 2026

Today I solved two LeetCode problems based on **Strings and Stack**. These problems helped me improve my understanding of palindrome validation, string processing, stack operations, and matching parentheses.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 125 - Valid Palindrome

- **Difficulty:** Easy
- **Topic:** Strings, Two Pointers, Character Validation

### 💡 Approach

The problem requires checking whether a string is a palindrome after converting uppercase letters to lowercase and ignoring non-alphanumeric characters.

I used two pointers:

- `left` → Starts from the beginning of the string.
- `right` → Starts from the end of the string.

I skipped non-alphanumeric characters and compared the characters after converting them to lowercase.

### 🔄 Algorithm

1. Initialize two pointers, `left` and `right`.
2. Move `left` forward while the character is not alphanumeric.
3. Move `right` backward while the character is not alphanumeric.
4. Convert both characters to lowercase.
5. Compare the characters.
6. If they are different, return `false`.
7. Move both pointers toward the center.
8. If all characters match, return `true`.

### 🔄 Example

For:

```text
s = "A man, a plan, a canal: Panama"
```

After ignoring spaces, punctuation, and capitalization:

```text
amanaplanacanalpanama
```

The string reads the same from both directions.

Final result:

```text
true
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

### 📚 Key Learning

Learned how **two-pointer techniques** can efficiently be used for palindrome validation while ignoring non-alphanumeric characters.

---

## 2️⃣ LeetCode 20 - Valid Parentheses

- **Difficulty:** Easy
- **Topic:** Stack, Strings, Parentheses Matching

### 💡 Approach

The problem requires checking whether every opening bracket has a corresponding closing bracket in the correct order.

I used a **Stack** to store opening brackets.

When a closing bracket is encountered, I check whether it matches the opening bracket at the top of the stack.

### 🔄 Algorithm

1. Create a `Stack<Character>`.
2. Traverse the string character by character.
3. If the character is an opening bracket:
   - Push it into the stack.

4. If the character is a closing bracket:
   - Check whether the stack is not empty.
   - Check whether the top element matches the corresponding opening bracket.

5. If it matches, pop the opening bracket.
6. If it does not match, return `false`.
7. After traversal, check whether the stack is empty.
8. If the stack is empty, return `true`; otherwise, return `false`.

### 🔄 Example

For:

```text
s = "({[]})"
```

Stack operations:

```text
( → push
{ → push
[ → push
] → pop [
} → pop {
) → pop (
```

The stack becomes empty.

Final result:

```text
true
```

For:

```text
s = "([)]"
```

The closing `)` does not match the top `[`.

Final result:

```text
false
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

### 📚 Key Learning

Learned how a **Stack (LIFO)** can be used to validate nested and properly ordered parentheses.

---

# 📚 Topics Learned

- Strings
- Two Pointers
- Stack
- String Traversal
- Palindrome
- Character Validation
- Parentheses Matching
- LIFO
- `Character.isLetterOrDigit()`
- `Character.toLowerCase()`

---

# 🎯 Key Takeaways

- Learned how to validate palindromes using the two-pointer technique.
- Practiced ignoring non-alphanumeric characters while comparing strings.
- Learned how Stack follows the **LIFO (Last In, First Out)** principle.
- Understood how stacks can be used to match opening and closing brackets.
- Improved string traversal and character comparison skills.
- Practiced solving problems using efficient `O(n)` time complexity.

---

# 🚀 Progress

- ✅ Day 25 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **25 Days**

Keep learning. Keep coding. 🚀
