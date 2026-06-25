package university.examination.grading.system;

public class TheoryCourse extends Course {
    private char grade;

    public TheoryCourse(int courseCode, String courseName, String studentName, int marksObtained, char grade, String performanceCategory, String academicStatus) {
        super(courseCode, courseName, studentName, marksObtained, grade, performanceCategory, academicStatus);
    }

    @Override
    public char calculateGrade(int marksObtained) {
        if (marksObtained >= 75) {
            grade = 'A';
        } else if (marksObtained >= 65) {
            grade = 'B';
        } else if (marksObtained >= 50) {
            grade = 'C';
        } else{
            grade = 'F';
        }

        return grade;
    }
}
