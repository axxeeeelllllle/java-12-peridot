package algorithm2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 1};

        System.out.println("Unsorted array: " + Arrays.toString(numbers));

        // Sort first because Jump Search requires sorted arrays
        Arrays.sort(numbers);
        System.out.println("Sorted array:   " + Arrays.toString(numbers));

        int target = 3;
        int index = jumpSearch(numbers, target);
        if (index >= 0) {
            System.out.println("Found " + target + " at index " + index + ".");
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

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

        while (prev < Math.min(step, n)) {
            if (arr[prev] == target) return prev;
            prev++;
        }

        return -1;
    }
}