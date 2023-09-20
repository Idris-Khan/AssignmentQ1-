/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignmentq1;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class StudentManagerTest {
    
    @Test
    public void TestSaveStudent() {
        // Your test logic for saving a student goes here
        StudentManager studentManager = new StudentManager();
        Student student = new Student("123", "John Doe", 18, "john@example.com", "Math");
        studentManager.saveStudent(student);

        List<Student> students = studentManager.getAllStudents();
        assertNotNull(students);
        assertEquals(1, students.size());
        assertEquals("123", students.get(0).getStudentId());
    }

    @Test
    public void TestSearchStudent() {
        // Your test logic for searching a student goes here
    }

    @Test
    public void TestSearchStudent_StudentNotFound() {
        // Your test logic for searching a non-existent student goes here
    }

    @Test
    public void TestDeleteStudent() {
        // Your test logic for deleting a student goes here
    }

    @Test
    public void TestDeleteStudent_StudentNotFound() {
        // Your test logic for deleting a non-existent student goes here
    }

    @Test
    public void TestStudentAge_StudentAgeValid() {
        // Your test logic for validating a valid student age goes here
    }

    @Test
    public void TestStudentAge_StudentAgeInvalid() {
        // Your test logic for validating an invalid student age goes here
    }

    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter() {
        // Your test logic for validating student age with invalid characters goes here
    }
}