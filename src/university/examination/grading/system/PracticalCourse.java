package university.examination.grading.system;

public class PracticalCourse extends Course {
    private char grade;

    public PracticalCourse(int courseCode, String courseName, String studentName, int marksObtained, char grade, String performanceCategory, String academicStatus) {
        super(courseCode, courseName, studentName, marksObtained, grade, performanceCategory, academicStatus);
    }

    @Override
    public char calculateGrade(int marksObtained) {
        if (marksObtained >= 80) {
            grade = 'A';
        } else if (marksObtained >= 70) {
            grade = 'B';
        } else if (marksObtained >= 55) {
            grade = 'C';
        } else{
            grade = 'F';
        }

        return grade;
    }
}
