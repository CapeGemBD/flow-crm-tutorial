package com.example.application.data;

import org.junit.jupiter.api.*;

public class CompanyGeneratedAiTests {
    private static Company company;

    @BeforeAll
    static void setUp() {
        company = new Company();
    }

    @Test
    void testSayHello_validName() {
        // GIVEN
        String name = "John Doe";

        // WHEN
        String result = company.sayHello(name);

        // THEN
        Assertions.assertEquals("Hello, John Doe", result);
    }
}