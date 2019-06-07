package com.hadden.java.core;

public class JavaControlFlow {
    public static void main(String[] args) {
        int x = 1;
        int y;
        int[] ints = {1, 2, 3};

        // If then else
        if (x == 1) {
            System.out.print("If X is 1");
        } else if (x == 2) {
            System.out.println("If X is 2");
        } else {
            System.out.println("If X is something else");
        }

        // Switch (takes byte, int, char, short or String (since Java 7)
        switch (x) {
            case 1:
                System.out.println("Switch x is 1");
                break;
            case 2:
            case 3:
                System.out.println("Switch x is 2 or 3");
                break;
            default:
                System.out.println("Switch x is something else");
        }

        // While
        do {
            System.out.println("Do: " + x);
        } while (--x > 0);

        while (x++ < 5) {
            System.out.println("While: " + x);
        }

        // For
        for (y = 0; y < 10; y++) {
            if (y == 2) {
                continue; // Skip
            }

            System.out.println("For: " + y);
        }

        for (int i : ints) {
            System.out.println("For In: " + i);

            if (i == 2) {
                break; // Quit early
            }
        }
    }
}
