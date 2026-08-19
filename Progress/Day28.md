# 🚀 Day 28 - LeetCode Challenge

**Date:** 19 August 2026

Today I solved two LeetCode problems based on **Matrix, Binary Search, and Spiral Matrix Traversal**. These problems helped me improve my understanding of searching in a sorted 2D matrix and generating matrices using spiral traversal.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 74 - Search a 2D Matrix

- **Difficulty:** Medium
- **Topic:** Matrix, Binary Search, 2D Array

### 💡 Approach

The problem requires searching for a target value in a matrix where each row is sorted and the first element of each row is greater than the last element of the previous row.

Instead of using nested loops, I treated the entire matrix as a **single sorted array** and applied **Binary Search**.

For a matrix with `rows` rows and `cols` columns:

- Convert the binary search index into a row using `mid / cols`.
- Convert it into a column using `mid % cols`.
- Compare `matrix[row][col]` with the target.

This allows the target to be searched efficiently without scanning every element.

### 🔄 Algorithm

1. Get the number of rows and columns.
2. Set `left = 0`.
3. Set `right = rows * cols - 1`.
4. Calculate the middle index.
5. Convert the middle index into matrix row and column:
   - `row = mid / cols`
   - `col = mid % cols`

6. Compare the matrix value with the target.
7. If equal, return `true`.
8. If the value is smaller, search the right half.
9. Otherwise, search the left half.
10. Return `false` if the target is not found.

### 🔄 Example

For:

```text
matrix =
1  3  5
7  9  11
13 15 17
```

Searching for:

```text
target = 11
```

The matrix can be viewed conceptually as:

```text
1 3 5 7 9 11 13 15 17
```

Binary Search finds `11`.

Final result:

```text
true
```

### ⏱ Complexity

- **Time:** `O(log(m × n))`
- **Space:** `O(1)`

Where `m` is the number of rows and `n` is the number of columns.

### 📚 Key Learning

Learned how to apply **Binary Search on a 2D Matrix** by treating the matrix as a virtual sorted 1D array.

---

## 2️⃣ LeetCode 59 - Spiral Matrix II

- **Difficulty:** Medium
- **Topic:** Matrix, Arrays, Spiral Traversal

### 💡 Approach

The problem requires generating an `n × n` matrix filled with numbers from `1` to `n²` in **spiral order**.

I used four boundaries:

- `top`
- `bottom`
- `left`
- `right`

The matrix is filled in four directions:

1. Left → Right
2. Top → Bottom
3. Right → Left
4. Bottom → Top

After completing each direction, the corresponding boundary is moved inward.

### 🔄 Algorithm

1. Create an `n × n` matrix.
2. Initialize `num = 1`.
3. Set four boundaries: `top`, `bottom`, `left`, and `right`.
4. Fill the top row from left to right.
5. Move the top boundary down.
6. Fill the right column from top to bottom.
7. Move the right boundary left.
8. Fill the bottom row from right to left.
9. Move the bottom boundary up.
10. Fill the left column from bottom to top.
11. Move the left boundary right.
12. Repeat until all cells are filled.
13. Return the matrix.

### 🔄 Example

For:

```text
n = 3
```

The generated matrix is:

```text
1 2 3
8 9 4
7 6 5
```

The numbers are filled in a clockwise spiral:

```text
1 → 2 → 3
          ↓
8 ← 9 ← 4
↑         ↓
7 ← 6 ← 5
```

Final result:

```text
[
 [1, 2, 3],
 [8, 9, 4],
 [7, 6, 5]
]
```

### ⏱ Complexity

- **Time:** `O(n²)`
- **Space:** `O(n²)`

The output matrix itself requires `O(n²)` space.

### 📚 Key Learning

Learned how to generate a matrix in **clockwise spiral order** using boundary variables and controlled traversal.

---

# 📚 Topics Learned

- Matrix
- Arrays
- 2D Arrays
- Binary Search
- Matrix Search
- Spiral Matrix
- Spiral Traversal
- Row-Column Indexing
- Matrix Boundaries
- Nested Loops
- 2D Array Manipulation
- Search Optimization

---

# 🎯 Key Takeaways

- Learned how to search a sorted 2D matrix using Binary Search.
- Improved understanding of converting a 1D index into 2D matrix coordinates.
- Practiced reducing matrix search complexity from `O(m × n)` to `O(log(m × n))`.
- Learned how to generate a matrix in clockwise spiral order.
- Practiced using `top`, `bottom`, `left`, and `right` boundaries.
- Improved understanding of matrix traversal and boundary control.
- Practiced solving matrix problems with efficient algorithms.
- Improved my understanding of 2D array manipulation.

---

# 🚀 Progress

- ✅ Day 28 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **28 Days**

Keep learning. Keep coding. 🚀
