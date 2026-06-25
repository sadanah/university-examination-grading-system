package university.examination.grading.system;

public class PracticalCourse extends Course {
    private String grade;
    private String performanceCategory;

    public PracticalCourse(int courseCode, String courseName, String studentName, int marksObtained) {
        super(courseCode, courseName, studentName, marksObtained);
    }

    @Override
    public void calculateGrade() {
        if (marksObtained >= 80) {
            grade = "A";
        } else if (marksObtained >= 70) {
            grade = "B";
        } else if (marksObtained >= 55) {
            grade = "C";
        } else{
            grade = "F";
        }
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }

}
