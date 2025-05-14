package com.example.application.data;

public class ContactGeneratedAiTests {

    private Contact contact;

    @BeforeEach
    void setup() {
        contact = new Contact();
    }

    @Test
    public void testGetFirstName() {
        // GIVEN: A new contact with no first name set
        // WHEN: The getFirstName method is called
        // THEN: The method returns an empty string
        assertEquals("", contact.getFirstName());
    }

    @Test
    public void testSetFirstName() {
        // GIVEN: A new contact with a first name set
        // WHEN: The setFirstName method is called with a new value
        // THEN: The method sets the first name correctly
        contact.setFirstName("John");
        assertEquals("John", contact.getFirstName());
    }

    @Test
    public void testGetLastName() {
        // GIVEN: A new contact with no last name set
        // WHEN: The getLastName method is called
        // THEN: The method returns an empty string
        assertEquals("", contact.getLastName());
    }

    @Test
    public void testSetLastName() {
        // GIVEN: A new contact with a last name set
        // WHEN: The setLastName method is called with a new value
        // THEN: The method sets the last name correctly
        contact.setLastName("Doe");
        assertEquals("Doe", contact.getLastName());
    }

    @Test
    public void testGetEmail() {
        // GIVEN: A new contact with an email set
        // WHEN: The getEmail method is called
        // THEN: The method returns the correct email
        contact.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", contact.getEmail());
    }
}