public class Student {
    private String studentno;
    private String studentname;
    private int scholarship;
    private static int noOfStudents;

    public Student() {
        studentname="not known";
        studentno="not known";
        scholarship=0;
        noOfStudents++;
    }

    public Student(String studentno, String studentname, int scholarship) {
        this.studentno = studentno;
        this.studentname = studentname;
        this.scholarship = scholarship;
        noOfStudents++;
    }

    public String getStudentno() {
        return studentno;
    }

    public void setStudentno(String studentno) {
        this.studentno = studentno;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public static int getNoOfStudents() {
        return noOfStudents;
    }

    public static void setNoOfStudents(int noOfStudents) {
        Student.noOfStudents = noOfStudents;
    }
    
    public void display(){
        System.out.println("Student count : " + getNoOfStudents());
        System.out.println("No : " + getStudentno());
        System.out.println("Name : " + getStudentname());
        System.out.println("Scholarship : " + getScholarship());
    }
}
