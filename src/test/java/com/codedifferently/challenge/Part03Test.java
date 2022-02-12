package com.codedifferently.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Part03Test {
    @Test
    public void getSumTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 15;

        // : When
        Integer actual = Part03.getSum(input);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetProduct() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 120;

        // : When
        Integer actual = Part03.getProduct(input);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAverageTest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Double expected = 3.0;

        // : When
        Double actual = Part03.getAverage(input);

        // : Then
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void getLargest() {
        // : Given
        Integer[] input = { 1, 2, 3, 4, 5};
        Integer expected = 5;

        // : When
        Integer actual = Part03.getLargest(input);

        // : Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getLargest2() {
        // : Given
        Integer[] input = {2};
        Integer expected = 2;

        // : When
        Integer actual = Part03.getLargest(input);

        // : Then
        Assertions.assertEquals(expected, actual);
    }
}
