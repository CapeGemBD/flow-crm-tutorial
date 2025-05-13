 package com.example.application.data;

   import org.junit.jupiter.api.*;
   import static org.junit.jupiter.api.Assertions.*;
   import jakarta.persistence.EntityManager;

   public class StatusGeneratedAiTests {

       private EntityManager entityManager;

       @BeforeEach
       void setup() {
           entityManager = // Initialize EntityManager here
       }

       @AfterEach
       void teardown() {
           if (entityManager.getTransaction().isActive()) {
               entityManager.getTransaction().rollback();
           }
       }

       @Test
       void testStatusCreationWithValidName() {
           // GIVEN
           String name = "Active";

           // WHEN
           Status status = new Status(name);

           // THEN
           assertNotNull(status);
           assertEquals(name, status.getName());
       }

       @Test
       void testStatusCreationWithNullName() {
           // GIVEN
           String name = null;

           // WHEN
           Status status = new Status(name);

           // THEN
           assertNotNull(status);
           assertEquals("", status.getName());
       }

       @Test
       void testStatusNameUpdate() {
           // GIVEN
           String initialName = "Active";
           String updatedName = "Inactive";
           Status status = new Status(initialName);

           // WHEN
           status.setName(updatedName);

           // THEN
           assertEquals(updatedName, status.getName());
       }
   }