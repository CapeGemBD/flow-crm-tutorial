package com.example.application.api;

// ContactController.java (assumed structure based on context)
package com.example.application.api;

public class ContactController {
    // ... methods ...

    public String getContactInfo(String id) {
        // ... implementation ...
        return "Contact Info for ID: " + id;
    }
}

// ContactControllerGeneratedAiTests.java (corrected)
import org.junit.jupiter.api.*;

@BeforeEach
class ContactControllerGeneratedAiTests {
    private ContactController contactController;

    @BeforeAll
    static void setUp() {
        contactController = new ContactController();
    }

    @Test
    void testGetContactInfo_validId() {
        // GIVEN
        String id = "12345";

        // WHEN
        String result = contactController.getContactInfo(id);

        // THEN
        Assertions.assertEquals("Contact Info for ID: 12345", result);
    }
}
