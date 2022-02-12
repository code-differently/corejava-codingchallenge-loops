package com.codedifferently.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Part04Test {
    @Test
    public void camelCaseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "She Sells Sea Shells";

        // When
        String actual = Part04.camelCase(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "sllehs aes slles ehs";

        // When
        String actual = Part04.reverse(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseWordsTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "ehs slles aes sllehs";

        // When
        String actual = Part04.reverseWords(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void reverseThenCamelCaseTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "Sllehs Aes Slles Ehs";

        // When
        String actual = Part04.reverseThenCamelCase(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void removeFirstAndLastCharacterTest() {
        // Given
        String input = "she sells sea shells";
        String expected = "he sells sea shell";

        // When
        String actual = Part04.removeFirstAndLastCharacter(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest1() {
        // Given
        String input = "shE sells SEA sHeLlS";
        String expected = "SHe SELLS sea ShElLs";

        // When
        String actual = Part04.invertCasing(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invertCasingTest2() {
        // Given
        String input = "She SelLS seA ShELlS";
        String expected = "sHE sELls SEa sHeLlS";

        // When
        String actual = Part04.invertCasing(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
