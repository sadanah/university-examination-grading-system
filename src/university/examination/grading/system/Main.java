/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package university.examination.grading.system;

import java.util.Scanner;
/**
 *
 * @author Sadana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("=================================================\n");
        System.out.print("      UNIVERSITY EXAMINATION GRADING SYSTEM\n");
        System.out.print("=================================================\n\n");

        Scanner scanner = new Scanner(System.in);


        System.out.print("\nEnter the number of student records to process: ");
        int stuCount = scanner.nextInt();

        while(stuCount > 0){
            
            System.out.print("\nEnter the course type (1 for Theory, 2 for Practical): ");
            int courseType = scanner.nextInt();

            System.out.print("Enter the course code: ");
            int courseCode = scanner.nextInt();

            System.out.print("Enter the course name: ");
            String courseName = scanner.next();

            System.out.print("Enter the student name: ");
            String studentName = scanner.next();

            System.out.print("Enter the marks obtained: ");
            int marksObtained = scanner.nextInt();

            Course course;
            if (courseType == 1) {
                course = new TheoryCourse(courseCode, courseName, studentName, marksObtained, ' ', " ", " ");
            } else {
                course = new PracticalCourse(courseCode, courseName, studentName, marksObtained, ' ', " ", " ");
            }

            course.displayDetails();
            stuCount--;
        }
    }
    
}
