package algorithm;

import java.util.Arrays;

public class ComparisonDemo {
    public static void main(String[] args) {

        System.out.println("Direct comparisons:");

        System.out.println("5 > 3 => " + (5 > 3));   // true because 5 is greater than 3
        System.out.println("2 > 4 => " + (2 > 4));   // false because 2 is not greater than 4
        System.out.println("7 > 7 => " + (7 > 7));   // false because 7 is equal to 7

        System.out.println();
        System.out.println("Array neighbor comparisons:");

        int[] arr = {5, 2, 8, 3, 1};
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        // Jump Search requires a sorted array
        Arrays.sort(arr);
        System.out.println("Sorted array:   " + Arrays.toString(arr));

        int target = 3;
        int idx = jumpSearch(arr, target);
        if (idx >= 0) {
            System.out.println("Found " + target + " at index " + idx + ".");
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    // Jump Search implementation for sorted arrays
    static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        if (n == 0) return -1;

        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n) return -1;
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) return i;
        }

        return -1;
    }
}
