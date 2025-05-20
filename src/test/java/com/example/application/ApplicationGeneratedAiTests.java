package com.example.application;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationGeneratedAiTests {

    private Application application;

    @BeforeEach
    void setUp() {
        application = new Application();
    }

    @Test
    void testMainMethod() {
        String[] args = {};

        SpringApplication.run(application.class, args);
        
        assertNotNull(application, "Application instance should not be null after running the main method.");
    }
}