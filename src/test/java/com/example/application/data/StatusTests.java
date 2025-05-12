package com.example.application.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatusTests {
  private Status status;

  @BeforeEach
  public void setUp() {
    status = new Status();
  }

  @Test
  public void testGetName() {
    // GIVEN - A new Status object
    // WHEN - We call getName on the Status object
    String name = status.getName();
    // THEN - The returned name should be null
    assertNull(name);
  }

  @Test
  public void testSetName() {
    // GIVEN - A new Status object
    // WHEN - We call setName with the value "Test Name"
    status.setName("Test Name");
    // THEN - The returned name should be "Test Name"
    assertEquals("Test Name", status.getName());
  }
}