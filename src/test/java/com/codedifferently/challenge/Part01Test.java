package com.codedifferently.challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Part01Test {
    private Part01 part01;

    @BeforeEach
    public void setUp(){
        part01 = new Part01();
    }

    @Test
    public void getRow() {
        String expected = "********************";
        int width = 20;
        String actual = part01.getRow(width);
        Assertions.assertEquals(expected, actual);
    }





    @Test
    public void testGetSmallTriangle() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n";
        String actual = part01.getSmallTriangle();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetLargeTriangle() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n" +
                "*******\n" +
                "********\n" +
                "*********\n";
        String actual = part01.getLargeTriangle();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTriangleTest1() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n" +
                "*******\n" +
                "********\n" +
                "*********\n";
        String actual = part01.getTriangle(10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTriangleTest2() {
        String expected =
                "*\n" +
                "**\n" +
                "***\n" +
                "****\n";
        String actual = part01.getTriangle(5);
        Assertions.assertEquals(expected, actual);
    }


}
