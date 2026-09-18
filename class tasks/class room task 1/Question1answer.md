# Question 1 — Think & Analysis: Optimized Matrix Multiplication

## 1. Identify the time complexity of conventional matrix multiplication.

The conventional matrix multiplication algorithm uses three nested loops.

For each element of the resulting matrix, N multiplications and additions are performed.

Therefore, the time complexity is:

O(N³)

For example, if N = 128, the conventional approach performs approximately 128³ = 2,097,152 multiplication operations.

---

## 2. Explain how Strassen’s algorithm reduces the number of recursive multiplications.

In conventional matrix multiplication, two matrices are divided into four submatrices, requiring 8 recursive matrix multiplications.

Strassen’s algorithm reduces these 8 multiplications to only 7 recursive multiplications.

It uses additional matrix additions and subtractions to calculate the result.

For each recursive step:

- Conventional method → 8 multiplications
- Strassen’s algorithm → 7 multiplications

Because multiplication is the more expensive operation, reducing the number of recursive multiplications improves the overall time complexity.

The time complexity of Strassen’s algorithm is approximately:

O(N^log₂7)

which is approximately:

O(N^2.807)

This is better than the conventional O(N³) approach for sufficiently large matrices.

---

## 3. Design the recursive solution using the divide-and-conquer approach.

Strassen’s algorithm follows the divide-and-conquer approach.

First, each N × N matrix is divided into four N/2 × N/2 submatrices:

A11, A12, A21, A22

and

B11, B12, B21, B22.

Seven products are then recursively calculated:

M1 = (A11 + A22)(B11 + B22)

M2 = (A21 + A22)B11

M3 = A11(B12 - B22)

M4 = A22(B21 - B11)

M5 = (A11 + A12)B22

M6 = (A21 - A11)(B11 + B12)

M7 = (A12 - A22)(B21 + B22)

The four result submatrices are calculated as:

C11 = M1 + M4 - M5 + M7

C12 = M3 + M5

C21 = M2 + M4

C22 = M1 - M2 + M3 + M6

Finally, the four submatrices are combined to form the resulting N × N matrix.

The recursion continues until the matrix size reaches 1 × 1, where normal multiplication is performed.

---

## 4. Consider the additional memory required for submatrices.

Strassen’s algorithm requires additional memory because it creates temporary submatrices for additions, subtractions, and recursive multiplication.

This can increase memory usage compared with the conventional algorithm.

Therefore, unnecessary matrix creation should be avoided where possible.

For N ≤ 128, memory usage is manageable, but an implementation should still reuse temporary matrices or use a suitable threshold for switching to conventional multiplication.

---

## 5. Decide when the conventional method may be more efficient than recursion.

Although Strassen’s algorithm has a better asymptotic time complexity, recursion introduces overhead.

For small matrices, the conventional O(N³) method can be faster because:

- It has no recursive function-call overhead.
- It requires fewer temporary matrices.
- It performs fewer additions and subtractions.
- Its implementation is simpler.

Therefore, a practical implementation can use a threshold.

For example:

- Small matrix size → conventional multiplication
- Large matrix size → Strassen’s algorithm

This hybrid approach can provide better practical performance.

---

## Conclusion

Conventional matrix multiplication has a time complexity of O(N³).

Strassen’s algorithm reduces the number of recursive multiplications from 8 to 7 and achieves a time complexity of approximately O(N^2.807).

For large matrices, Strassen’s divide-and-conquer approach can reduce computation time. However, for small matrices, conventional multiplication may be more efficient because of the overhead caused by recursion and temporary matrices.
