package com.codedifferently.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problems01Test {

    @Test
    public void catDogTest01(){
        Problems01 problems01 = new Problems01();
        String input = "catdog";
        Boolean expected  = true;
        Boolean actual = problems01.catDog(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void catDogTest02(){
        Problems01 problems01 = new Problems01();
        String input = "catcat";
        Boolean expected  = false;
        Boolean actual = problems01.catDog(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void catDogTest03(){
        Problems01 problems01 = new Problems01();
        String input = "1cat1cadodog";
        Boolean expected  = true;
        Boolean actual = problems01.catDog(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void catDogTest04(){
        Problems01 problems01 = new Problems01();
        String input = "1cat1cadodog";
        Boolean expected  = true;
        Boolean actual = problems01.catDog(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void catDogTest05(){
        Problems01 problems01 = new Problems01();
        String input = "catxdogxdogxcat";
        Boolean expected  = false;
        Boolean actual = problems01.catDog(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void plusOut01(){
        Problems01 problems01 = new Problems01();
        String inputStr = "12xy34";
        String word = "xy";
        String expected  = "++xy++";
        String actual = problems01.plusOut(inputStr, word);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void plusOut02(){
        Problems01 problems01 = new Problems01();
        String inputStr = "12xy34";
        String word = "1";
        String expected  = "1+++++";
        String actual = problems01.plusOut(inputStr, word);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void plusOut03(){
        Problems01 problems01 = new Problems01();
        String inputStr = "12xy34xyabcxy";
        String word = "xy";
        String expected  = "++xy++xy+++xy";
        String actual = problems01.plusOut(inputStr, word);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void plusOut04(){
        Problems01 problems01 = new Problems01();
        String inputStr = "abXYabcXYZ";
        String word = "XY";
        String expected  = "++XY+++XY+";
        String actual = problems01.plusOut(inputStr, word);
        Assertions.assertEquals(expected,actual);
    }


}
