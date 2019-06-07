package com.hadden.java.core;

import java.util.Arrays;

public class JavaArrays {

    public static void main(String[] args) {
        // Declare and initialize
        int[] a;
        int[] b = {3, 2, 1};

        int[][] e = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int c[] = new int[3]; // Allocates memory
        int d[][][] = new int[3][][]; // Must include size for first dimension at least

        // Copy
        System.arraycopy(b, 0, c, 0, 3);

        for (int i : c) {
            System.out.println(i);
        }

        // Arrays utility class
        Arrays.sort(c); // Sorting

        for (int i : c) {
            System.out.println(i);
        }

        System.out.print(Arrays.equals(b, c) + "\n"); // Equality
        System.out.println(Arrays.hashCode(b)); // Hashcode
        Arrays.fill(b, 9); // Fill

        for (int i : b) {
            System.out.println(i);
        }
    }
}
