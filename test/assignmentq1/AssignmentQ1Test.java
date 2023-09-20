/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignmentq1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class AssignmentQ1Test {
    
    public AssignmentQ1Test() {
    }

     @Test
    public void testSaveStudent() {
        // Test the saveStudent method of StudentManager
        // Create Student objects, save them, and then use assertions to check if they were saved correctly.
        StudentManager studentManager = new StudentManager();
        Student student1 = new Student("1", "John Doe", 20, "john@example.com", "Math");
        studentManager.saveStudent(student1);

        // Use assertions to check if the saved student's data matches the expected data.
        Student savedStudent = studentManager.searchStudent("1");
        assertNotNull(savedStudent);
        assertEquals("John Doe", savedStudent.getStudentName());
        assertEquals(20, savedStudent.getStudentAge());
    }

    @Test
    public void testSearchStudentNotFound() {
        // Test the searchStudent method when the student is not found.
        StudentManager studentManager = new StudentManager();
        Student foundStudent = studentManager.searchStudent("999"); // Assuming "999" is not in the database.
        assertNull(foundStudent);
    }

    // Add more test methods for other functionalities as needed.

}
