package com.example.application.data;

public class CompanyGeneratedAiTests {

    private Company company;

    @BeforeEach
    void setUp() {
        company = new Company();
    }

    @Test
    void testGetName() {
        // GIVEN: A company object with a name set
        company.setName("Test Company");

        // WHEN: The getName method is called
        String actualName = company.getName();

        // THEN: The expected name matches the actual name
        assertEquals("Test Company", actualName);
    }

    @Test
    void testSetName() {
        // GIVEN: A company object with a default name
        String originalName = "Default Name";
        company.setName(originalName);

        // WHEN: The setName method is called with a new name
        company.setName("New Test Company");

        // THEN: The actual name matches the expected new name
        assertEquals("New Test Company", company.getName());
    }

    @Test
    void testGetEmployees() {
        // GIVEN: A company object with employees set
        List<Contact> employees = new LinkedList<>();
        employees.add(new Contact());
        company.setEmployees(employees);

        // WHEN: The getEmployees method is called
        List<Contact> actualEmployees = company.getEmployees();

        // THEN: The expected list of employees matches the actual list
        assertEquals(1, actualEmployees.size());
    }

    @Test
    void testGetEmployeeCount() {
        // GIVEN: A company object with some employees set
        List<Contact> employees = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            employees.add(new Contact());
        }
        company.setEmployees(employees);

        // WHEN: The getEmployeeCount method is called
        int actualEmployeeCount = company.getEmployeeCount();

        // THEN: The expected employee count matches the actual count
        assertEquals(5, actualEmployeeCount);
    }
}