    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */
    package assignmentq1;

    import java.util.List;
    import java.util.Scanner;

    /**
 * This is the main class for a Student Management Application.
 * It allows users to capture, search, delete, and print student records.
 * Users can navigate through a menu to perform these actions.
 * The application is designed for managing student data.
 *
 * @author lab_services_student
 */
    public class AssignmentQ1 {


        public static void main(String[] args) {
            StudentManager studentManager = new StudentManager();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("STUDENT MANAGEMENT APPLICATION");
                System.out.println("****************************");
                System.out.println("ENTER (1) TO LAUNCH MENU OR ANY OTHER KEY TO EXIT");
                String input = scanner.nextLine();
                if (!input.equals("1")) {
                    System.out.println("Exiting application. Goodbye!");
                    break;
                }
                showMenu(studentManager, scanner);
            }
            scanner.close();
        }
//Displays the main menu of the Student Management Application.
        //Users can choose various options from this menu.
        private static void showMenu(StudentManager studentManager, Scanner scanner) {
            while (true) {
                System.out.println("PLEASE SELECT ONE OF THE FOLLOWING MENU ITEMS:");
                System.out.println("(1) Capture a new student");
                System.out.println("(2) Search for a student");
                System.out.println("(3) Delete a student");
                System.out.println("(4) Print student report");
                System.out.println("(5) Exit application");
                String choice = scanner.nextLine();
                    //The StudentManager instance for managing student records.
                    //The Scanner for user input.
                switch (choice) {
                    case "1":
                        captureNewStudent(studentManager, scanner);
                        break;
                    case "2":
                        searchStudent(studentManager, scanner);
                        break;
                    case "3":
                        deleteStudent(studentManager, scanner);
                        break;
                    case "4":
                        printStudentReport(studentManager);
                        break;
                    case "5":
                        exitApplication();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
        
      //Captures a new student's information and adds it to the student manager.
     
      // studentManager: The StudentManager instance for managing student records.;
      // scanner   :     The Scanner for user input.
   
        private static void captureNewStudent(StudentManager studentManager, Scanner scanner) {
            System.out.println("Capture a new student");
            System.out.println("*******************************");
            System.out.print("Enter the student id: ");
            String studentId = scanner.nextLine();
            System.out.print("Enter the student name: ");
            String studentName = scanner.nextLine();
            int studentAge;
            while (true) {
                try {
                    System.out.print("Enter the student age: ");
                    studentAge = Integer.parseInt(scanner.nextLine());
                    if (studentAge >= 16) {
                        break;
                    } else {
                        System.out.println("You have entered an incorrect student age! Age must be 16 or greater.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid age.");
                }
            }
            System.out.print("Enter the student email: ");
            String studentEmail = scanner.nextLine();
            System.out.print("Enter the student course: ");
            String studentCourse = scanner.nextLine();

            Student newStudent = new Student(studentId, studentName, studentAge, studentEmail, studentCourse);
            studentManager.saveStudent(newStudent);
            System.out.println("Student details have been successfully saved.");
        }
 
      //Searches for a student by student ID and displays their information if found.
     
      //studentManager The StudentManager instance for managing student records.
      //scanner        The Scanner for user input.
     
        private static void searchStudent(StudentManager studentManager, Scanner scanner) {
            System.out.print("Enter the student id to search: ");
            String searchId = scanner.nextLine();

            Student foundStudent = studentManager.searchStudent(searchId);

            if (foundStudent != null) {
                System.out.println("------------------------------------");
                System.out.println("Student ID: " + foundStudent.getStudentId());
                System.out.println("Student Name: " + foundStudent.getStudentName());
                System.out.println("Student Age: " + foundStudent.getStudentAge());
                System.out.println("Student Email: " + foundStudent.getStudentEmail());
                System.out.println("Student Course: " + foundStudent.getStudentCourse());
                System.out.println("------------------------------------");
            } else {
                System.out.println("Student with student ID " + searchId + " not found.");
            }
        }

   //Deletes a student record by student ID if found.
     
     // studentManager  :  The StudentManager instance for managing student records.
    // scanner  :   The Scanner for user input,
     
        private static void deleteStudent(StudentManager studentManager, Scanner scanner) {
            System.out.print("Enter the student id to delete: ");
            String deleteId = scanner.nextLine();

            if (studentManager.deleteStudent(deleteId)) {
                System.out.println("Student with student ID " + deleteId + " was deleted.");
            } else {
                System.out.println("Student with student ID " + deleteId + " not found.");
            }
        }

        private static void printStudentReport(StudentManager studentManager) {
            List<Student> students = studentManager.getAllStudents();

            System.out.println("Student Report");
            System.out.println("----------------------------------");

            int studentCount = 1;
            for (Student student : students) {
                System.out.println("Student " + studentCount);
                System.out.println("-------------------------------");
                System.out.println("Student ID: " + student.getStudentId());
                System.out.println("Student Name: " + student.getStudentName());
                System.out.println("Student Age: " + student.getStudentAge());
                System.out.println("Student Email: " + student.getStudentEmail());
                System.out.println("Student Course: " + student.getStudentCourse());
                System.out.println("----------------------------------");
                studentCount++;
            }
        }
 
      //Prints a report of all student records.
     
      //studentManager The StudentManager instance for managing student records.
     
        private static void exitApplication() {
            System.out.println("Exiting application. Goodbye!");
            System.exit(0);
        }
    }