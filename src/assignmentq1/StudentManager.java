/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentq1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * This class manages a collection of students and provides methods to save, search,
 * and delete student records. It also allows retrieving a list of all students.
 * The class uses an ArrayList to store student records.
 * 
 * @author lab_services_student
 */
public class StudentManager {
    private List<Student> students = new ArrayList<>();
//A List to store student records
    public void saveStudent(Student student) {
        students.add(student);
    }
    // Saves the students record by adding it to th list

    public Student searchStudent(String studentId) {// Searches the student record by their Id
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent(String studentId) { // deletes the students information off the data base
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId().equals(studentId)) {
                iterator.remove();// Remove the student from the list
                return true;// Return true as the student was deleted
            }
        }
        return false;
    }
// Retrieves a list of all student records.
    public List<Student> getAllStudents() {//A List containing all student records.
        return students;
    }
}