package com.example.application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}



class ApplicationTests {

  @Test
  void testMainMethod() {
    // GIVEN - Set up the context for the test
    // WHEN - Execute the main method of the application
    SpringApplication.run(Application.class, new String[] {}); 
    // THEN - Assert that the application runs successfully
  }
}