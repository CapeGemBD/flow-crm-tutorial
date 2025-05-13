package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DisplayName.*;

@SpringBootApplication
public class ApplicationGeneratedAiTests extends SpringBootApplication {

  @Test
  public void mainMethodTest() {
    SpringApplication.run(Application.class, new String[] {});
  }
}