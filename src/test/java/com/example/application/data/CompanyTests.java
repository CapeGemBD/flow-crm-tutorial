package com.example.application.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        // GIVEN two numbers
        int num1 = 5;
        int num2 = 3;
        // WHEN add method is called
        int result = calculator.add(num1, num2);
        // THEN the sum is correct
        assert (result == 8);
    }

    @Test
    void testSubtract() {
        // GIVEN two numbers
        int num1 = 10;
        int num2 = 4;
        // WHEN subtract method is called
        int result = calculator.subtract(num1, num2);
        // THEN the difference is correct
        assert (result == 6);
    }

    @Test
    void testMultiply() {
        // GIVEN two numbers
        int num1 = 7;
        int num2 = 9;
        // WHEN multiply method is called
        int result = calculator.multiply(num1, num2);
        // THEN the product is correct
        assert (result == 63);
    }

    @Test
    void testDivide() {
        // GIVEN two numbers
        int num1 = 20;
        int num2 = 5;
        // WHEN divide method is called
        int result = calculator.divide(num1, num2);
        // THEN the quotient is correct
        assert (result == 4);
    }
}



class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}