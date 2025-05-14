package com.example.application.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusGeneratedAiTests {

  private Status status;

  @BeforeEach
  void setUp() {
    status = new Status();
  }

  @Test
  void testConstructor_Default() {
    // GIVEN - A new Status object is created using the default constructor
    Status status = new Status();
    // THEN - The name attribute is null
    assertNull(status.getName());
  }

  @Test
  void testConstructor_WithName() {
    // GIVEN - A new Status object is created with a name
    Status status = new Status("Pending");
    // THEN - The name attribute is set to "Pending"
    assertEquals("Pending", status.getName());
  }

  @Test
  void testGetName() {
    // GIVEN - A Status object with a name is created
    status.setName("Completed");
    // WHEN - The getName method is called
    String name = status.getName();
    // THEN - The returned name matches the set name
    assertEquals("Completed", name);
  }

  @Test
  void testSetters() {
    // GIVEN - A Status object is created
    // WHEN - The setName method is called with "Active"
    status.setName("Active");
    // THEN - The name attribute is set to "Active"
    assertEquals("Active", status.getName());
  }

}