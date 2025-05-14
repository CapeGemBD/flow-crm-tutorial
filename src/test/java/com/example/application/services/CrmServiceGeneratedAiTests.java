package com.example;

class HelloAction {
    public String sayHello() {
        return "Hello!";
    }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloActionGeneratedAiTests {

    private HelloAction helloAction;

    @BeforeEach
    void setUp() {
        helloAction = new HelloAction();
    }

    @Test
    void testSayHello() {
        // GIVEN - 
        String expectedGreeting = "Hello!";

        // WHEN - 
        String actualGreeting = helloAction.sayHello();

        // THEN - 
        assertEquals(expectedGreeting, actualGreeting);
    }
}