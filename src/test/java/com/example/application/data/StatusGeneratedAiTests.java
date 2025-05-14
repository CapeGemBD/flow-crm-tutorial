package com.example.application.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatusGeneratedAi {

    private Status status;

    @BeforeEach
    void setUp() {
        status = new Status();
    }

    @Test
    void testGetName() {
        assertEquals("", status.getName());
    }

    @Test
    void testSetName() {
        String name = "Initial Name";
        Status statusWithName = new Status(name);
        assertEquals(name, statusWithName.getName());
    }
}