package university.examination.grading.system;

public abstract class Course {
    protected int courseCode;
    protected String courseName;
    protected String studentName;
    protected int marksObtained;
    protected char grade;
    protected String performanceCategory;
    protected int statusCode;
    protected String academicStatus;

    public Course(int courseCode, String courseName, String studentName, int marksObtained, char grade, String performanceCategory, String academicStatus) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.studentName = studentName;
        this.marksObtained = marksObtained;
        this.grade = calculateGrade(marksObtained);
        this.performanceCategory = performanceCategory(this.grade);
        this.academicStatus = academicStatus(this.statusCode);
    }

    // abstract cuz different logic for each subclass
    public abstract char calculateGrade(int marksObtained);

    // does not need to be abstract cuz subclasses use same logic
    public String performanceCategory(int grade){
        if (grade == 'A') {
            performanceCategory = "Outstanding";
            statusCode = 1;
        } else if (grade == 'B') {
            performanceCategory = "Very Good";
            statusCode = 2;
        } else if (grade == 'C') {
            performanceCategory = "Satisfactory";
            statusCode = 3;
        } else {
            performanceCategory = "Fail";
            statusCode = 4;
        }
        return performanceCategory;
    }

    public String academicStatus(int statusCode){
        switch (statusCode) {
            case 1:
                academicStatus = "Dean's List";
                break;
            case 2:
                academicStatus = "Good Standing";
                break;
            case 3:
                academicStatus = "Academic Warning";
                break;
            case 4:
                academicStatus = "Repeat Course Required";
                break;
            default:
                academicStatus = "Unknown";
                break;
        }
        return academicStatus;
    }

    public void displayDetails(){
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);   
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks Obtained: " + marksObtained);
        System.out.println("Grade: " + grade);
        System.out.println("Performance Category: " + performanceCategory);
        System.out.println("Academic Status: " + academicStatus);
    }
}
