package com.hadden.java.core;

public class JavaOperators {
    public static void main(String[] args) {
        int a = 1;
        String s = "A";

        // Postfix
        a++;
        a--;

        // Unary
        ++a;
        --a;
        a = -a;
        a = ~a; // Invert bits

        // Additive
        a = a + 1;
        a = a - 1;
        s = s + "B";

        // Multiplicative
        a = a * 1;
        a = a / 1;
        a = a % 1;

        // Shift
        a = a >> 1; // Divide by 2 and keep sign
        a = a >>> 1; // Divide by 2 and lose sign (right-most bit becomes 0)
        a = a << 1; // Multiply by 2

        // Equality
        System.out.println(a == 1);
        System.out.println(a != 1);

        // Relational
        System.out.println(a > 1);
        System.out.println(a >= 1);
        System.out.println(a < 1);
        System.out.println(a <= 1);
        System.out.println(s instanceof String);

        // Bitwise
        System.out.println(a & 1); // And
        System.out.println(a | 1); // Or
        System.out.println(a ^ 1); // Xor

        // Logical
        System.out.println(a == 1 && true); // Short-circuit And
        System.out.println(a == 1 || true); // Short-circuit Or

        // Assignment
        a += 1;
        a -= 1;
        a *= 1;
        a /= 1;
        a %= 1;
        a >>= 1;
        a >>>= 1;
        a <<= 1;
        a &= 1;
        a |= 1;

        // Ternary
        System.out.println(a > 1 ? ">1" : "!>1");
    }
}
