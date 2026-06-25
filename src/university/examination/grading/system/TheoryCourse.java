package university.examination.grading.system;

public class TheoryCourse extends Course {
    private String grade;

    public TheoryCourse(int courseCode, String courseName, String studentName, int marksObtained) {
        super(courseCode, courseName, studentName, marksObtained);
    }

    @Override
    public void calculateGrade() {
        if (marksObtained >= 75) {
            grade = "A";
        } else if (marksObtained >= 65) {
            grade = "B";
        } else if (marksObtained >= 50) {
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
