# Jump Search — Simple Presentation

---

## Objectives
- Learn how Jump Search finds a value in a sorted list.
- See the block-by-block jump step and the linear search inside a block.
- Compare Jump Search to Binary Search and Linear Search.

---

## What is Jump Search?
Jump Search is a search algorithm for sorted arrays.
Instead of checking every element, it jumps ahead by a fixed block size and then searches linearly within the block where the target can appear.

Example: search `8` in sorted list [1, 3, 4, 6, 8, 10, 12]

---

## Key Idea: Jump and Linear Scan
1. Choose a step size `m` (often `sqrt(n)`).
2. Jump forward by `m` elements until the current item is greater than or equal to the target.
3. Search backward or linearly from the previous jump point to the current block.

This reduces comparisons compared to checking every element in a sorted list.

---

## Example Walkthrough
Sorted array: [1, 3, 4, 6, 8, 10, 12]
Target: 8
Step size: `m = 3`

- Jump 1: index 0 → value 1 (not ≥ 8)
- Jump 2: index 3 → value 6 (not ≥ 8)
- Jump 3: index 6 → value 12 (≥ 8) → stop jumping

Now search linearly from index 3 to 6:
- index 3 → 6 (not target)
- index 4 → 8 → found it!

---

## Algorithm Steps
- Set `m = floor(sqrt(n))`.
- Start at index `0`.
- While current element < target and index < n:
  - Move to index `min(index + m, n - 1)`.
- Once you land in a block where element ≥ target, do a linear scan from the previous block start.
- If you reach the end of the block or array without finding the target, it is not present.

---

## Why Jump Search?
- Works only on sorted data.
- Faster than Linear Search for large lists.
- Simpler than Binary Search when random access is easy and memory is not a concern.

Performance:
- Best / average / worst-case: O(√n)
- Uses O(1) extra space

---

## When to Use It
- Useful when the list is sorted and the jump cost is roughly equal to a single comparison.
- Good for arrays or structures where accessing elements by index is fast.
- Not ideal for linked lists or when the cost of jumping is much higher than linear traversal.

---

## Sample Java Pseudocode
```java
int jumpSearch(int[] arr, int target) {
    int n = arr.length;
    int step = (int)Math.floor(Math.sqrt(n));
    int prev = 0;

    while (arr[Math.min(step, n) - 1] < target) {
        prev = step;
        step += (int)Math.floor(Math.sqrt(n));
        if (prev >= n) {
            return -1; // not found
        }
    }

    while (prev < Math.min(step, n)) {
        if (arr[prev] == target) {
            return prev;
        }
        prev++;
    }

    return -1;
}
```

---

## Speaker Notes (student-friendly)
- Emphasize that Jump Search needs a sorted array.
- Explain the block jump first, then the final linear scan.
- Show `m = sqrt(n)` as a rule of thumb and why it balances jumps vs scans.

---

## Practice Ideas
- Trace Jump Search by hand on different sorted lists.
- Compare the number of comparisons against Linear Search.
- Try implementing Jump Search in Java and test with both present and missing values.

---

End of slides.
