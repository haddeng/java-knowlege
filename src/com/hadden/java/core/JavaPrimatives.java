package com.hadden.java.core;

public class JavaPrimatives {

    public static void main(String[] args) {
        boolean boolean1; // Unknown size
        byte byte1; // 8 bits, -2^7 (-128) to 2^7-1 (127)
        char char1; // 16 bits, 0 (0) to 2^16-1 (65535)
        short short1; // 16 bits, -2^15 (-32768) to 2^15-1 (32767)
        int int1; // 32 bits, -2^31 to 2^31-1
        float float1; // 32 bits, -2^31 to 2^31-1
        long long1; // 64 bits, -2^63 to 2^23-1
        double double1; // 64 bits, -2^63 to 2^63-1

        // Literals
        boolean1 = true;
        byte1 = 1;
        char1 = 'a';
        short1 = 1;
        int1 = 1; // Literal integer defaults to integer
        float1 = 1.0f; // Literal decimal defaults to double which is too big for float
        long1 = 1;
        double1 = 1.0;

        int1 = 0xFF; // Hex
        int1 = 07; // Octal
        int1 = 0b11010; // Binary (Java 7)

        byte1 = 0b0010_0101; // With separator (Java 7)
        short1 = 1_000; // With separator (Java 7)
        int1 = 1_000_000; // With separator (Java 7)
        float1 = 3.14_15F; // With separator (Java 7)
        long1 = 1234_5678_9012_3456L; // With separator (Java 7)
        double1 = 1234_5678_9012_3456D; // With separator (Java 7). Cast required to upscale int literal

        // Assigning non literals
        byte1 = (byte)int1; // Cast required to compile
        char1 = (char)int1; // Cast required to compile
        short1 = (short)int1; // Cast required to compile
        int1 = (int)float1; // Cast required to compile
        long1 = (long)double1; // Cast required to compile
    }
}
