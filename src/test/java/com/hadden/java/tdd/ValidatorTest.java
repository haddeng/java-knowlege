package com.hadden.java.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {
    @Test
    public void testIsValid() {
        Validator validator = new Validator();
        assertTrue(validator.isValid("ABC"));
        assertFalse(validator.isValid("ACB"));
    }
}
