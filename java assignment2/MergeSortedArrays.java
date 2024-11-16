// Question 1: Given are two one-dimensional arrays A & B, which are sorted in ascending order.
// Write a Java program to merge them into a single sorted array C that contains every item from arrays A & B, in ascending order.

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Example sorted arrays A and B
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8, 10};

        // Merging arrays A and B into sorted array C
        int[] C = mergeArrays(A, B);

        // Printing the merged sorted array C
        System.out.println("Merged Sorted Array: " + Arrays.toString(C));
    }

    public static int[] mergeArrays(int[] A, int[] B) {
        int lengthA = A.length;
        int lengthB = B.length;
        int[] C = new int[lengthA + lengthB];

        int i = 0, j = 0, k = 0;

        // Merge arrays A and B into C
        while (i < lengthA && j < lengthB) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        // Add remaining elements of A, if any
        while (i < lengthA) {
            C[k++] = A[i++];
        }

        // Add remaining elements of B, if any
        while (j < lengthB) {
            C[k++] = B[j++];
        }

        return C;
    }
}