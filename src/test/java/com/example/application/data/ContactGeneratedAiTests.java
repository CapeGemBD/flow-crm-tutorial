package com.example.application.data;

// Contact.java (assumed structure based on previous context)
public class Contact {
    // ... (including methods without modifications for simplicity)
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}

// ContactGeneratedAiTests.java (corrected version)
import org.junit.jupiter.api.*;

@BeforeEach
class ContactGeneratedAiTests {
    private Contact contact;

    @BeforeAll
    static void setUp() {
        contact = new Contact();
    }

    @Test
    void testSayHello_validName() {
        // GIVEN
        String name = "John";

        // WHEN
        String result = contact.sayHello(name);  // Corrected method call

        // THEN
        Assertions.assertEquals("Hello, John", result);
    }
}
