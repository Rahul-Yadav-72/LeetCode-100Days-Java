# 🚀 Day 27 - LeetCode Challenge

**Date:** 18 August 2026

Today I solved two LeetCode problems based on **Matrix and 2D Arrays**. These problems helped me improve my understanding of matrix traversal, diagonal calculations, row-column indexing, and matrix transposition.

---

# ✅ Problems Solved

## 1️⃣ LeetCode 1572 - Matrix Diagonal Sum

- **Difficulty:** Easy
- **Topic:** Matrix, Arrays, Diagonal Traversal

### 💡 Approach

The problem requires calculating the sum of the elements present on both the **primary diagonal** and **secondary diagonal** of a square matrix.

I used a single loop to traverse the matrix:

- The primary diagonal elements are present at `matrix[i][i]`.
- The secondary diagonal elements are present at `matrix[i][n - i - 1]`.
- If the matrix has an odd number of rows and columns, the center element belongs to both diagonals, so it should be counted only once.

### 🔄 Algorithm

1. Get the size `n` of the matrix.
2. Initialize `sum = 0`.
3. Traverse the matrix using a single loop.
4. Add the primary diagonal element `matrix[i][i]`.
5. Add the secondary diagonal element `matrix[i][n - i - 1]`.
6. Check whether both diagonal positions are different.
7. Return the final diagonal sum.

### 🔄 Example

For:

```text
matrix =
1 2 3
4 5 6
7 8 9
```

Primary diagonal:

```text
1 + 5 + 9
```

Secondary diagonal:

```text
3 + 5 + 7
```

The center element `5` is common to both diagonals, so it is counted only once.

Final result:

```text
25
```

### ⏱ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

### 📚 Key Learning

Learned how to calculate the sum of both diagonals efficiently using a **single loop** and constant extra space.

---

## 2️⃣ LeetCode 867 - Transpose Matrix

- **Difficulty:** Easy
- **Topic:** Matrix, Arrays, 2D Array, Matrix Traversal

### 💡 Approach

The problem requires finding the **transpose of a matrix**.

In a transpose, the rows of the original matrix become columns, and the columns become rows.

I created a new matrix with dimensions:

```text
columns × rows
```

Then I traversed the original matrix and placed each element using:

```text
result[j][i] = matrix[i][j]
```

### 🔄 Algorithm

1. Find the number of rows and columns.
2. Create a new matrix of size `columns × rows`.
3. Traverse the original matrix using nested loops.
4. Store each element at `result[j][i]`.
5. Return the transposed matrix.

### 🔄 Example

For:

```text
matrix =
1 2 3
4 5 6
```

The transpose is:

```text
1 4
2 5
3 6
```

The transformation is:

```text
matrix[i][j] → result[j][i]
```

### ⏱ Complexity

- **Time:** `O(m × n)`
- **Space:** `O(m × n)`

Where `m` is the number of rows and `n` is the number of columns.

### 📚 Key Learning

Learned how to transpose a matrix by swapping the **row and column indices** and improved my understanding of 2D array manipulation.

---

# 📚 Topics Learned

- Matrix
- Arrays
- 2D Arrays
- Matrix Traversal
- Diagonal Traversal
- Primary Diagonal
- Secondary Diagonal
- Row-Column Indexing
- Matrix Transpose
- Nested Loops
- 2D Array Manipulation
- Constant Space Optimization

---

# 🎯 Key Takeaways

- Learned how to calculate the sum of both diagonals efficiently.
- Practiced traversing a square matrix using a single loop.
- Learned how to avoid counting the center element twice.
- Improved understanding of **2D array indexing**.
- Learned how to transpose a matrix by swapping row and column positions.
- Practiced working with rectangular matrices.
- Improved matrix traversal and manipulation skills.
- Practiced solving matrix problems with efficient time complexity.

---

# 🚀 Progress

- ✅ Day 27 Completed
- ✅ Problems Solved Today: **2**
- 🔥 Challenge Streak: **27 Days**

Keep learning. Keep coding. 🚀
