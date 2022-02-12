package com.codedifferently.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Part02Test {
    @Test
    public void getSumTest() {
        // : Given
        Integer input = 5;
        Integer expected = 10;

        // : When
        Integer actual = Part02.getSumOfN(input);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIsEven() {
        // : Given
        Integer input = 6;

        // : When
        Boolean actual = Part02.isEven(input);

        // : Then
        Assertions.assertTrue(actual);
    }

    @Test
    public void testIsEven2() {
        // : Given
        Integer input = 7;

        // : When
        Boolean actual = Part02.isEven(input);

        // : Then
        Assertions.assertFalse(actual);
    }

    @Test
    public void reverseDigitsTest() {
        // : Given
        Integer input = 12345;
        Integer expected = 54321;

        // : When
        Integer actual = Part02.reverseDigits(input);

        // : Then
        Assertions.assertEquals(expected, actual);
    }
}
