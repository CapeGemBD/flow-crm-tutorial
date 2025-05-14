package com.example.application;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {

    @Test
    public void testMethod() {
        int expected = 5;
        int actual = calculateSum(2, 3);
        assertEquals(expected, actual);
    }

    private int calculateSum(int a, int b) {
        return a + b;
    }
}