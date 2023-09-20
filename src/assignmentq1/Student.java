/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentq1;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
class Student {
    private String studentId;   //The unique identifier for the student
    private String studentName; //The name of the student
    private int studentAge;     //The age of the student
    private String studentEmail;        //The email address of the student
    private String studentCourse;       //The course in which the student is enrolled

    public Student(String studentId, String studentName, int studentAge, String studentEmail, String studentCourse) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }
//Retrieves the students id
    public String getStudentId() {
        return studentId;
    }
//Retrieves the student's name.
    public String getStudentName() {
        return studentName;
    }
//Retrieves the student's age.
    public int getStudentAge() {
        return studentAge;
    }
//Retrieves the student's email address.
    public String getStudentEmail() {
        return studentEmail;
    }
//Retrieves the course in which the student is enrolled.
    public String getStudentCourse() {
        return studentCourse;
    }
}