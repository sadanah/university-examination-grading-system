package university.examination.grading.system;

public abstract class Course {
    protected int courseCode;
    protected String courseName;
    protected String studentName;
    protected int marksObtained;

    public Course(int courseCode, String courseName, String studentName, int marksObtained) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.studentName = studentName;
        this.marksObtained = marksObtained;
    }

    public abstract void calculateGrade();

    public void displayDetails(){
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);   
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks Obtained: " + marksObtained);
    }
}
