package com.example.application.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(org.junit.runners.JUnit4.class)
public class HelloActionTest {

    @Test
    public void testSayHello() {
        HelloAction helloAction = new HelloAction();
        String result = helloAction.sayHello();
        assertEquals("Hello, World!", result);
    }
}
